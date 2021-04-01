/*
 * ===문제 출처===
 * 11022 A+B - 8, <https://www.acmicpc.net/problem/11022>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_08 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int length = Integer.parseInt(br.readLine());
		int a, b;
		for(int i=1; i<=length; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
