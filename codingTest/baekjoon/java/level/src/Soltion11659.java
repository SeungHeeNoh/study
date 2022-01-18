/*
 * ===문제 출처===
 * 11659 구간 합 구하기 4, <https://www.acmicpc.net/problem/11659>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = parseInt(st.nextToken());
// 		int test = parseInt(st.nextToken());
// 		int[] arr = new int[n+1];
// 		st = new StringTokenizer(br.readLine());
// 		StringBuffer result = new StringBuffer();
		
// 		for(int i=0; i<n; i++) {
// 			arr[i+1] = parseInt(st.nextToken());
// 		}

// 		Soltion11659 segementTree = new Soltion11659(n);
// 		segementTree.init(arr, 1, 1, n);

// 		for(int i=0; i<test; i++) {
// 			st = new StringTokenizer(br.readLine());
// 			int left = parseInt(st.nextToken()),
// 				right = parseInt(st.nextToken());
// 			result.append(segementTree.sum(1, 1, n, left, right)).append("\n");
// 		}
// 		System.out.println(result);
// 	}
// }

class Soltion11659 {
	private int[] segementTree;

	public Soltion11659(int size) {
		int treeSize = (int)Math.pow(2, (int)Math.ceil(Math.log(size)/Math.log(2))+1);
		segementTree = new int[treeSize];
	}

	public int init(int[] arr, int index, int start, int end) {
		int value = 0;

		if(start == end) {
			value = arr[start];
		} else {
			value = init(arr, index*2, start, start + (end-start)/2) + init(arr, index*2+1, start+(end-start)/2+1, end);
		}

		return segementTree[index] = value;
	}

	public int sum(int index, int start, int end, int left, int right) {
		if(right < start || end < left) return 0;

		if(left <= start && end <= right) return segementTree[index];

		return sum(index*2, start, start+(end-start)/2, left, right) + sum(index*2+1, start+(end-start)/2+1, end, left, right);
	}
}