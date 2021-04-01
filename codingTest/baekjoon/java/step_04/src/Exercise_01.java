/*
 * ===문제 출처===
 * 10952 A+B - 5, <https://www.acmicpc.net/problem/10952>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_01 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		StringTokenizer st = null;

		int a, b;

		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			bf.append(a+b).append("\n");
		}
		br.close();
		System.out.print(bf);
	}
}