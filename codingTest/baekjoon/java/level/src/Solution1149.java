/*
 * ===문제 출처===
 * 1149 RGB거리, <https://www.acmicpc.net/problem/1149>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		int answer = Integer.MAX_VALUE;
// 		int[][] dp = new int[n][3];

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int a = Integer.parseInt(st.nextToken());
// 			int b = Integer.parseInt(st.nextToken());
// 			int c = Integer.parseInt(st.nextToken());

// 			if(i == 0) {
// 				dp[0][0] = a;
// 				dp[0][1] = b;
// 				dp[0][2] = c;
// 			} else {
// 				dp[i][0] = a + Math.min(dp[i-1][1], dp[i-1][2]);
// 				dp[i][1] = b + Math.min(dp[i-1][0], dp[i-1][2]);
// 				dp[i][2] = c + Math.min(dp[i-1][0], dp[i-1][1]);
// 			}
// 		}

// 		for(int i=0; i<3; i++) {
// 			if(answer > dp[n-1][i]) answer = dp[n-1][i];
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution1149 {
	
}