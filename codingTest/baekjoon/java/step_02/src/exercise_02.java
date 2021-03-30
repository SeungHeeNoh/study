/*
 * ===문제 출처===
 * 9498 시험 성적, <https://www.acmicpc.net/problem/9498>.
 * */
import java.util.Scanner;

public class exercise_02 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

		char grade = 'F';
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}

		System.out.println(grade);
	}
}
