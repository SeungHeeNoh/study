/*
 * ===문제 출처===
 * 2438 별 찍기 - 1, <https://www.acmicpc.net/problem/2438>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise_09 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer star = new StringBuffer();

		int length = Integer.parseInt(br.readLine());
		br.close();

		for(int i=1; i<=length; i++) {
			for(int j=0; j<i; j++) {
				star.append("*");
			}
			star.append("\n");
		}
		System.out.print(star);
	}
}