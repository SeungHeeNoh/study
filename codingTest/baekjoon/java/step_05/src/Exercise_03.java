/*
 * ===문제 출처===
 * 2577 숫자의 개수, <https://www.acmicpc.net/problem/2577>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercise_03 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int digit[] = new int[10],
			temp = 0;
		long result = 1L;

		for(int i=0; i<3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		br.close();

		do{
			temp = (int)(result % 10);
			digit[temp]++;
			result /= 10;
		}while(result != 0);
		

		for(int i=0; i<digit.length; i++) {
			sb.append(digit[i] + "\n");
		}
		System.out.print(sb);
	}
}