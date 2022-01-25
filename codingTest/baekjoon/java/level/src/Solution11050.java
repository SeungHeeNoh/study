/*
 * ===문제 출처===
 * 11050 이항 계수 1, <https://www.acmicpc.net/problem/11050>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int k = Integer.parseInt(st.nextToken());
// 		int[][] dp = new int[n+1][k+1];

// 		for(int i=0; i<=n; i++) {
// 			for(int j=0; j<=k; j++) {
// 				if(i==0 || j==0 || i==j) {
// 					dp[i][j] = 1;
// 				} else {
// 					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
// 				}
// 			}
// 		}
		
// 		System.out.println(dp[n][k]);
// 	}
// }

class Solution11050 {
	
}