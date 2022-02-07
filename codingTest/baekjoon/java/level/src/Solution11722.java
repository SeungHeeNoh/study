/*
 * ===문제 출처===
 * 11722 가장 긴 감소하는 부분 수열, <https://www.acmicpc.net/problem/11722>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int[] array = new int[n];
// 		int[] minSequence = new int[n];
// 		int length = 0;

// 		for(int i=0; i<n; i++) {
// 			array[i] = Integer.parseInt(st.nextToken());
// 		}

// 		minSequence[0] = array[0];

// 		for(int value : array) {
// 			if(minSequence[length] > value) {
// 				minSequence[++length] = value;
// 			} else {
// 				minSequence[search(minSequence, 0, length, value)] = value;
// 			}
// 		}

// 		System.out.println(length+1);
// 	}

// 	public static int search(int[] minSequence, int low, int high, int value) {
// 		int mid = 0;

// 		while(low < high) {
// 			mid = (low + high)/2;

// 			if(minSequence[mid] > value) {
// 				low = mid+1;
// 			} else {
// 				high = mid;
// 			}
// 		}

// 		return high;
// 	}
// }

class Solution11722 {
	
}