/*
 * ===문제 출처===
 * 10430번 나머지, <https://www.acmicpc.net/problem/10430>.
 * */
package step_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_10 {
	public static void main() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String arr[] = br.readLine().split(" ");
			int A = Integer.parseInt(arr[0]),
				B = Integer.parseInt(arr[1]),
				C = Integer.parseInt(arr[2]);
			
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
