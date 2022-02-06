/*
 * ===문제 출처===
 * 10830 행렬 제곱, <https://www.acmicpc.net/problem/10830>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int[][] a = new int[n][n];
// 		long b = Long.parseLong(st.nextToken());

// 		for(int i=0; i<n; i++) {
// 			st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<n; j++) {
// 				a[i][j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		System.out.println(new Solution10830().getResult(n, b, a));
// 	}
// }

class Solution10830 {
	public String getResult(int n, long b, int[][] a) {
		Map<Long, int[][]> map = new HashMap<>();
		StringBuilder answer = new StringBuilder(n*n*2);
		long count = 1;

		map.put(count, a);

		while(count*2 < b) {
			int[][] tempResult = new int[n][n];

			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					int result = 0;

					for(int k=0; k<n; k++) {
						result += (a[i][k] * a[k][j])%1000;
					}

					tempResult[i][j] = result%1000;
				}
			}

			a = tempResult;
			count *= 2;
			map.put(count, a);
		}

		b -= count;

		while(b != 0) {
			if(b - count < 0) {
				count /= 2;
			} else {
				b -= count;

				int[][] tempResult = new int[n][n];
				int[][] targetArray = map.get(count);

				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						int result = 0;

						for(int k=0; k<n; k++) {
							result += (a[i][k] * targetArray[k][j])%1000;
						}

						tempResult[i][j] = result%1000;
					}
				}

				a = tempResult;
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				answer.append(a[i][j]%1000);

				if(j != n-1) answer.append(" ");
			}
			answer.append("\n");
		}

		return answer.toString();
	}
}