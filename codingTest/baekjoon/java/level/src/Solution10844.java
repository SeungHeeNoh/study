/*
 * ===문제 출처===
 * 10844 쉬운 계단 수, <https://www.acmicpc.net/problem/10844>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	static long[][] dp = new long[10][101];
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		long answer = 0;

// 		for(int i=0; i<dp.length; i++) {
// 			dp[i][1] = 1;
// 		}

// 		for(int i=2; i<=n; i++) {
// 			for(int j=0; j<dp.length; j++) {
// 				if(j != 0) dp[j][i] += dp[j-1][i-1];
// 				if(j != 9) dp[j][i] += dp[j+1][i-1];

// 				dp[j][i] %= 1000000000;
// 			}
// 		}

// 		for(int i=1; i<10; i++) {
// 			answer = (answer + dp[i][n])%1000000000;
// 		}

// 		System.out.println((answer)%1000000000);
// 	}
// }

class Solution10844 {
	
}