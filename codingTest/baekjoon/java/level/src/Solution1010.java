/*
 * ===문제 출처===
 * 1010 다리 놓기, <https://www.acmicpc.net/problem/1010>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuffer result = new StringBuffer();
// 		int test = parseInt(br.readLine());

// 		for(int t=0; t<test; t++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int n = parseInt(st.nextToken()),
// 				m = parseInt(st.nextToken());

// 			int[][] dp = new int[m+1][n+1];

// 			for(int i=0; i<dp.length; i++) {
// 				for(int j=0; j<dp[0].length; j++) {
// 					if(j == 0 || i == j || i == 0) {
// 						dp[i][j] = 1;
// 					} else {
// 						dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
// 					}
// 				}
// 			}

// 			result.append(dp[m][n]).append("\n");
// 		}

// 		System.out.println(result.toString());
// 	}
// }

class Solution1010 {

}