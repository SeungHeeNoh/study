/*
 * ===문제 출처===
 * 2357 최솟값과 최댓값, <https://www.acmicpc.net/problem/2357>.
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
// 			int[] arr = new int[n+1];
// 			int length = Integer.parseInt(st.nextToken());

// 			for(int i=1; i<arr.length; i++) {
// 				arr[i] = Integer.parseInt(br.readLine());
// 			}

// 			SegmentTreeMinAndMax segmentTree = new SegmentTreeMinAndMax(arr.length);
// 			segmentTree.init(arr, 1, 1, n);

// 			for(int i=0; i<length; i++) {
// 				st = new StringTokenizer(br.readLine());
// 				sb.append(segmentTree.getResult(1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 1, n)).append("\n");
// 			}
		
// 			System.out.println(sb);
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MinAndMax {
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;

	public MinAndMax() {}

	public MinAndMax(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public String toString() {
		return min + " " + max;
	}
}

class SegmentTreeMinAndMax {
	MinAndMax tree[];
	int treeSize;

	public SegmentTreeMinAndMax(int size) {
		int treeHeight = (int)Math.ceil(Math.log(size)/Math.log(2))+1;
		tree = new MinAndMax[(int)Math.pow(2, treeHeight)];

		for(int i=0; i<size; i++) {
			tree[i] = new MinAndMax();
		}
	}

	public MinAndMax init(int arr[], int index, int start, int end) {

		if(start == end) {
			tree[index] = new MinAndMax(arr[start], arr[start]);
		} else {
			MinAndMax mm1 = init(arr, index*2, start, start+(end-start)/2);
			MinAndMax mm2 = init(arr, index*2+1, start+(end-start)/2+1, end);
			tree[index] =  new MinAndMax(Math.min(mm1.min, mm2.min), Math.max(mm1.max, mm2.max));
		}

		return tree[index];
	}

	public MinAndMax getResult(int index, int start_index, int end_index, int start, int end) {
		if(end_index < start || start_index > end) return new MinAndMax();

		if(start_index <= start && end <= end_index) return tree[index];

		MinAndMax mm1 = getResult(index*2, start_index, end_index, start, start+(end-start)/2);
		MinAndMax mm2 = getResult(index*2+1, start_index, end_index, start+(end-start)/2+1, end);

		return new MinAndMax(Math.min(mm1.min, mm2.min), Math.max(mm1.max, mm2.max));
	}
}