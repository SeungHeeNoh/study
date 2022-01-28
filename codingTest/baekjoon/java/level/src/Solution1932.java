/*
 * ===문제 출처===
 * 1932 정수 삼각형, <https://www.acmicpc.net/problem/1932>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int answer = 0;
// 		int n = Integer.parseInt(br.readLine());
// 		int[][] dp = new int[n][];
		
// 		for(int i=0; i<n; i++) {
// 			dp[i] = new int[i+1];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			if(i == 0) {
// 				dp[i][0] = Integer.parseInt(st.nextToken());
// 			} else {
// 				for(int j=0; j<=i; j++) {
// 					int max = 0;

// 					if(0 <= j-1 && max < dp[i-1][j-1]) {
// 						max = dp[i-1][j-1];
// 					}

// 					if(j<i && max < dp[i-1][j]) {
// 						max = dp[i-1][j];
// 					}

// 					dp[i][j] = Integer.parseInt(st.nextToken()) + max;
// 				}
// 			}
// 		}

// 		for(int i=0; i<dp[n-1].length; i++) {
// 			if(answer < dp[n-1][i]) {
// 				answer = dp[n-1][i];
// 			}
// 		}
	
// 		System.out.println(answer);
// 	}
// }

class Solution1932 {

}