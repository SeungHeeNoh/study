/*
 * ===문제 출처===
 * 2739 구구단, <https://www.acmicpc.net/problem/2739>.
 * */
import java.util.Scanner;

public class Exercise_01 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();

		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
}
