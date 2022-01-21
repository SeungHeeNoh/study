/*
 * ===문제 출처===
 * 1003 피보나치 함수, <https://www.acmicpc.net/problem/1003>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	private final static int N = 40;
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = parseInt(br.readLine());
// 		StringBuffer answer = new StringBuffer();

// 		int[][] dp = new int[N+1][2];
// 		dp[0][0] = 1;
// 		dp[0][1] = 0;
// 		for(int i=0; i<N; i++) {
// 			dp[i+1][0] = dp[i][1];
// 			dp[i+1][1] = dp[i][0] + dp[i][1];
// 		}

// 		while(test-- > 0) {
// 			int index = parseInt(br.readLine());

// 			answer.append(dp[index][0] + " " + dp[index][1]).append("\n");
// 		}
		
// 		System.out.println(answer);
// 	}
// }

class Solution1003 {
	
}