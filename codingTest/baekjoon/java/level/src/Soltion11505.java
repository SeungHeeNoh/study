/*
 * ===문제 출처===
 * 11505 구간 곱 구하기, <https://www.acmicpc.net/problem/11505>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	private static long[] arr;

// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuffer result = new StringBuffer();
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = parseInt(st.nextToken()),
// 			test = parseInt(st.nextToken()) + parseInt(st.nextToken());
// 		arr = new long[n+1];

// 		for(int i=0; i<n; i++) {
// 			arr[i+1] = Long.parseLong(br.readLine());
// 		}

// 		Soltion11505 segementTree = new Soltion11505(n);
// 		segementTree.init(arr, 1, 1, n);

// 		for(int t=0; t<test; t++) {
// 			st = new StringTokenizer(br.readLine());
// 			int a = parseInt(st.nextToken()),
// 				b = parseInt(st.nextToken()),
// 				c = parseInt(st.nextToken());

// 			if(a == 1) {
// 				arr[b] = c;
// 				segementTree.update(arr, 1, 1, n, b, c);
// 			} else {
// 				result.append(segementTree.mul(1, 1, n, b, c)).append("\n");
// 			}
// 		}
		
// 		System.out.println(result.toString());
// 	}
// }

class Soltion11505 {
	private static final long MODULAR = 1000000007;

	private static long[] segementTree;

	public Soltion11505(int size) {
		segementTree = new long[(int)Math.pow(2, (int)Math.ceil(Math.log(size)/Math.log(2))+1)];
	}
	
	public long init(long[] arr, int index, int start, int end) {
		if(start == end) {
			return segementTree[index] = arr[start]%MODULAR;
		}

		int mid = start + (end-start)/2;
		return segementTree[index] = (init(arr, index*2, start, mid)%MODULAR * init(arr, index*2+1, mid+1, end)%MODULAR)%MODULAR;
	}

	public long update(long[] arr, int index, int start, int end, int updateIndex, int value) {
		if(updateIndex < start || updateIndex > end) return segementTree[index];

		if(start == end) {
			return segementTree[index] = arr[start]%MODULAR;
		}

		int mid = start + (end-start)/2;
		return segementTree[index] = (update(arr, index*2, start, mid, updateIndex, value)%MODULAR * update(arr, index*2+1, mid+1, end, updateIndex, value)%MODULAR)%MODULAR;
	}

	public long mul(int index, int start, int end, int left, int right) {
		if(right < start || end < left) return 1;

		if(left <= start && end <= right) return segementTree[index];

		int mid = start + (end-start)/2;
		return (mul(index*2, start, mid, left, right)%MODULAR * mul(index*2+1, mid+1, end, left, right)%MODULAR)%MODULAR;
	}
}