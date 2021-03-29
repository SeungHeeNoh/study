/*
 * ===문제 출처===
 * 2588번 사칙연산, <https://www.acmicpc.net/problem/2588>.
 * */
package step_01;

import java.util.Scanner;

public class exercise_11 {
	public static void main() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(),
			b = sc.nextInt();
		sc.close();

		System.out.println(a*(b%10));
		System.out.println(a*(b/10%10));
		System.out.println(a*(b/100));
		System.out.println((a*(b%10)) + (a*(b/10%10))*10 + (a*(b/100))*100);
	
	}
}
