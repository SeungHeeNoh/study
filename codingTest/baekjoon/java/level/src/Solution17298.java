/*
 * ===문제 출처===
 * 17298 오큰수, <https://www.acmicpc.net/problem/17298>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int[] array = new int[n];

// 		for(int i=0; i<n; i++) {
// 			array[i] = Integer.parseInt(st.nextToken());
// 		}

// 		System.out.println(new Solution17298().getResult(array, n));
// 	}
// }

class Solution17298 {
	public String getResult(int[] array, int n) {
		int[] result = new int[n];
		int[] bigNumberStack = new int[n];
		int stackIndex = -1;
		StringBuilder answer = new StringBuilder(n*2);

		for(int i=n-1; i>=0; i--) {
			int target = array[i];

			while(stackIndex >= 0 && bigNumberStack[stackIndex] <= target) {
				stackIndex--;
			}

			if(stackIndex == -1) {
				result[i] = -1;
			} else {
				result[i] = bigNumberStack[stackIndex];
			}

			bigNumberStack[++stackIndex] = target;
		}

		for(int i=0; i<n; i++) {
			answer.append(result[i]);

			if(i != n-1) answer.append(" ");
		}

		return answer.toString();
	}
}