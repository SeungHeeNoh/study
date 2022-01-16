/*
 * ===문제 출처===
 * 2042 구간 합 구하기, <https://www.acmicpc.net/problem/2042>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			StringBuffer sb = new StringBuffer();
// 			int n = Integer.parseInt(st.nextToken());
// 			long[] arr = new long[n+1];
// 			int length = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

// 			for(int i=1; i<arr.length; i++) {
// 				arr[i] = Long.parseLong(br.readLine());
// 			}

// 			SegmentTree segmentTree = new SegmentTree(arr.length*4);
// 			segmentTree.init(arr, 1, 1, n);

// 			for(int i=0; i<length; i++) {
// 				st = new StringTokenizer(br.readLine());
// 				int command = Integer.parseInt(st.nextToken()),
// 					b = Integer.parseInt(st.nextToken());
// 				long c = Long.parseLong(st.nextToken());

// 				switch(command) {
// 					case 1 : 
// 						segmentTree.update(1, b, 1, n, c-arr[b]);
// 						arr[b] = c;
// 						break;
// 					case 2 :
// 						sb.append(segmentTree.sum(1, b, (int)c, 1, n)).append("\n");
// 				}
// 			}
		
// 			System.out.println(sb);
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class SegmentTree {
	long tree[];
	int treeSize;

	public SegmentTree(int size) {
		tree = new long[size];
	}

	public long init(long arr[], int index, int start, int end) {

		if(start == end) {
			tree[index] = arr[start];
		} else {
			tree[index] = init(arr, index*2, start, start+(end-start)/2) + init(arr, index*2+1, start+(end-start)/2+1, end);
		}

		return tree[index];
	}

	public void update(int tree_index, int index,  int start, int end, long diff) {
		if(index < start || index > end) return;

		tree[tree_index] += diff;
		if(start == end) return;

		update(tree_index*2, index, start, start+(end-start)/2, diff);
		update(tree_index*2+1, index, start+(end-start)/2+1, end, diff);
	}

	public long sum(int index, int start_index, int end_index, int start, int end) {
		if(end_index < start || start_index > end) return 0;

		if(start_index <= start && end <= end_index) return tree[index];

		return sum(index*2, start_index, end_index, start, start+(end-start)/2) + sum(index*2+1, start_index, end_index, start+(end-start)/2+1, end);
	}
}