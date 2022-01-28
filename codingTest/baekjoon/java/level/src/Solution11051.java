/*
 * ===문제 출처===
 * 11051 이항 계수 2, <https://www.acmicpc.net/problem/11051>.
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
// 				if(i == 0 || i == j || j == 0) {
// 					dp[i][j] = 1;
// 				} else {
// 					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%10007;
// 				}
// 			}
// 		}
		
// 		System.out.println(dp[n][k]%10007);
// 	}
// }

class Solution11051 {

}