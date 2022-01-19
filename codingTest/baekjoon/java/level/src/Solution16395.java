/*
 * ===문제 출처===
 * 16395 파스칼의 삼각형, <https://www.acmicpc.net/problem/16395>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int[][] dp = new int[parseInt(st.nextToken())][parseInt(st.nextToken())];

// 		for(int i=0; i<dp.length; i++) {
// 			for(int j=0; j<dp[0].length; j++) {
// 				if(j == 0 | i == j || i == 0) {
// 					dp[i][j] = 1;
// 				} else {
// 					dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
// 				}
// 			}
// 		}

// 		System.out.println(dp[dp.length-1][dp[0].length-1]);
// 	}
// }

class Solution16395 {

}