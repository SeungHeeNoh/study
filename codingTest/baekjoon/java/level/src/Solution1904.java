/*
 * ===문제 출처===
 * 1904 01타일, <https://www.acmicpc.net/problem/1904>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args)	throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int input = Integer.parseInt(br.readLine());

// 		System.out.println(Solution1904.getCount(input));
// 	}
// }

class Solution1904 {
	public static int getCount(int length) {
		final int MOD = 15746;
		int[] dp = new int[length];
		dp[0] = 1;

		if(length > 1) {
			dp[1] = 2;
		}

		for(int i=2; i<length; i++) {
			dp[i] = (dp[i-1]%MOD + dp[i-2]%MOD)%MOD;
		}
		
		return dp[length-1]%MOD;
	}
}