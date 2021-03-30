/*
 * ===문제 출처===
 * 14681 사분면 고르기, <https://www.acmicpc.net/problem/14681>.
 * */
import java.util.Scanner;

public class exercise_04 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),
			y = sc.nextInt();
		sc.close();

		int result = 0;
		if(x > 0 && y > 0) {
			result = 1;
		}else if(x > 0 && y < 0) {
			result = 4;
		}else if(x < 0 && y < 0) {
			result = 3;
		}else {
			result = 2;
		}
		System.out.println(result);
	}
}
