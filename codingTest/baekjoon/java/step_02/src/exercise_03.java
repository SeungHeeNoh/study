/*
 * ===문제 출처===
 * 2753 윤년 , <https://www.acmicpc.net/problem/2753>.
 * */
import java.util.Scanner;

public class exercise_03 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		int result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
		System.out.println(result);
	}
}