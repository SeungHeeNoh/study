/*
 * ===문제 출처===
 * 12865 평범한 배낭, <https://www.acmicpc.net/problem/12865>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int n = Integer.parseInt(st.nextToken()),
// 				k = Integer.parseInt(st.nextToken());
// 			int[][] inputs = new int[n][2];

// 			for(int i=0; i<inputs.length; i++) {
// 				st = new StringTokenizer(br.readLine());

// 				inputs[i][0] = Integer.parseInt(st.nextToken());
// 				inputs[i][1] = Integer.parseInt(st.nextToken());
// 			}
			
// 			System.out.println(Solution12865.solution(n, k, inputs));
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Solution12865 {
	public static int solution(int n, int k, int[][] inputs) {
		int[][] v = new int[inputs.length+1][k+1];

		for(int i=1; i<v.length; i++) {
			for(int j=1; j<v[i].length; j++) {
				int weight = inputs[i-1][0],
					value = inputs[i-1][1];

				if(weight > k || j-weight < 0) {
					v[i][j] = v[i-1][j];
				} else {
					v[i][j] = Math.max(value + v[i-1][j-weight], v[i-1][j]);
				}
			}
		}

		return v[v.length-1][v[0].length-1];
	}
}