/*
 * ===문제 출처===
 * 8958 OX퀴즈, <https://www.acmicpc.net/problem/8958>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_06 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int length = Integer.parseInt(br.readLine());

		for(int i=0; i<length; i++) {
			String quiz[] = br.readLine().split("");

			int sum = 0, score = 0;
			for(int j=0; j<quiz.length; j++) {
				if(quiz[j].equals("O")) {
					score++;
				} else {
					score = 0;
				}
				sum += score;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}