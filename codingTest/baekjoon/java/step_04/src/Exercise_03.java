/*
 * ===문제 출처===
 * 1110 더하기 사이클, <https://www.acmicpc.net/problem/1110>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_03 {
	public static void main() throws IOException {
		int cycle = 0, temp = 0,
			origin =0, change = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		change = origin = Integer.parseInt(br.readLine());

		do {
			temp = ((change/10 == 0 ? 0 : change/10) + change % 10) % 10;
			change = change % 10 * 10 + temp;
			cycle++;
		}while(change != origin);
			
		br.close();
		System.out.println(cycle);
	}
}
