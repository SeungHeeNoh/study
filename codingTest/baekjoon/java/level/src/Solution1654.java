/*
 * ===문제 출처===
 * 1654 랜선 자르기, <https://www.acmicpc.net/problem/1654>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int k = Integer.parseInt(st.nextToken());
// 		int n = Integer.parseInt(st.nextToken());
// 		long min = 1;
// 		long max = 0;
// 		int[] array = new int[k];

// 		for(int i=0; i<k; i++) {
// 			array[i] = Integer.parseInt(br.readLine());
// 			if(max < array[i]) max = array[i];
// 		}

// 		while(min <= max) {
// 			int count = 0;
// 			long mid = (min+max)/2;

// 			for(int i=0; i<k; i++) {
// 				count += array[i]/mid;
// 			}

// 			if(count >= n) {
// 				min = mid+1;
// 			} else if(count < n) {
// 				max = mid-1;
// 			}
// 		}

// 		System.out.println(max);
// 	}
// }

class Solution1654 {

}