/*
 * ===문제 출처===
 * 2751 수 정렬하기 2, <https://www.acmicpc.net/problem/2751>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	static int[] TEMP;
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuffer answer = new StringBuffer();
// 		int n = Integer.parseInt(br.readLine());
// 		TEMP = new int[n];
// 		int[] array = new int[n];

// 		for(int i=0; i<n; i++) {
// 			array[i] = Integer.parseInt(br.readLine());
// 		}

// 		mergeSort(0, n-1, array);

// 		for(int i=0; i<n; i++) {
// 			answer.append(array[i] + "\n");
// 		}

// 		System.out.println(answer.toString());
// 	}

// 	public static void merge(int start, int mid, int end, int[] array) {
// 		int start1 = start;
// 		int end1 = mid;
// 		int start2 = mid+1;
// 		int end2 = end;
// 		int index = start;

// 		while(start1 <= end1 && start2 <= end2) {
// 			if(array[start1] <= array[start2]) {
// 				TEMP[index++] = array[start1++];
// 			} else {
// 				TEMP[index++] = array[start2++];
// 			}
// 		}

// 		while(start1 <= end1) {
// 			TEMP[index++] = array[start1++];
// 		}

// 		while(start2 <= end2) {
// 			TEMP[index++] = array[start2++];
// 		}

// 		for(int i=start; i<=end; i++) {
// 			array[i] = TEMP[i];
// 		}
// 	}

// 	public static void mergeSort(int start, int end, int[] array) {
// 		if(start < end) {
// 			int mid = start + (end - start)/2;
// 			mergeSort(start, mid, array);
// 			mergeSort(mid+1, end, array);

// 			merge(start, mid, end, array);
// 		}
// 	}
// }

class Solution2751 {
	
}