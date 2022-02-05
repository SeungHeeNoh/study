/*
 * ===문제 출처===
 * 2740 행렬 곱셈, <https://www.acmicpc.net/problem/2740>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int[][] a = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

// 		for(int i=0; i<a.length; i++) {
// 			st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<a[i].length; j++) {
// 				a[i][j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		st = new StringTokenizer(br.readLine());
// 		int[][] b = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
// 		for(int i=0; i<b.length; i++) {
// 			st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<b[i].length; j++) {
// 				b[i][j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		System.out.println(new Solution2740().getResult(a, b));
// 	}
// }

class Solution2740 {

	public String getResult(int[][] a, int[][] b) {
		StringBuilder answer = new StringBuilder(a.length*b[0].length*2);

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				int result = 0;

				for(int k=0; k<a[0].length; k++) {
					result += a[i][k] * b[k][j];
				}

				answer.append(result);
				if(j == b[0].length-1) {
					answer.append("\n");
				} else {
					answer.append(" ");
				}
			}
		}

		return answer.toString();
	}
	
}