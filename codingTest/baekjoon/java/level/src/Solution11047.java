/*
 * ===문제 출처===
 * 11047 동전 0, <https://www.acmicpc.net/problem/11047>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken()),
// 			value = Integer.parseInt(st.nextToken());
// 		int[] coinArray = new int[n];
		
// 		for(int i=1; i<=n; i++) {
// 			coinArray[n-i] = Integer.parseInt(br.readLine());
// 		}

// 		System.out.println(new Solution11047().getResult(coinArray, value));
// 	}
// }

class Solution11047 {
	public int getResult(int[] coinArray, int value) {
		int count = 0;

		for(int i=0; i<coinArray.length && value !=0; i++) {
			if(value < coinArray[i]) continue;
			count += value / coinArray[i];
			value %= coinArray[i];
		}

		return count;
	}
 }