/*
 * ===문제 출처===
 * 1008번 A/B, <https://www.acmicpc.net/problem/1008>.
 * */
package step_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_08 {
	public static void main() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String arr[] = br.readLine().split(" ");
			br.close();

			int a = Integer.parseInt(arr[0]),
				b = Integer.parseInt(arr[1]);

			System.out.println((double)a / b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
