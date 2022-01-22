/*
 * ===문제 출처===
 * 9184 신나는 함수 실행, <https://www.acmicpc.net/problem/9184>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
	
// 	public static void main(String[] args) throws IOException {	
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder result = new StringBuilder();
// 		String line = "";

// 		while(!(line=br.readLine()).equals("-1 -1 -1")) {
// 			StringTokenizer st = new StringTokenizer(line);
// 			int a = Integer.parseInt(st.nextToken()),
// 				b = Integer.parseInt(st.nextToken()),
// 				c = Integer.parseInt(st.nextToken());

// 			result.append("w(" + a + ", " +  b + ", " + c + ") = " + Solution9184.getResult(a, b, c)+"\n");
// 		}

// 		System.out.println(result);
// 	}
// }

class Solution9184 {
	private static final int DEFAULT = 20+1;
	private static int[][][] dp = new int[DEFAULT][DEFAULT][DEFAULT];

	public static int getResult(int a, int b, int c) {
		if(isRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
	 	} else if(a <= 0 || b <= 0 || c <= 0) {
			 return 1;
		} else if(a > 20 || b > 20 || c > 20) {
				return dp[20][20][20] = getResult(20, 20, 20);
		} else if(a < b && b < c) {
			return dp[a][b][c] = getResult(a, b, c-1) + getResult(a, b-1, c-1) - getResult(a, b-1, c);
		} else {
			return dp[a][b][c] = getResult(a-1, b, c) + getResult(a-1, b-1, c) + getResult(a-1, b, c-1) - getResult(a-1, b-1, c-1);
		}
	}

	private static boolean isRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <=20;
	}
}