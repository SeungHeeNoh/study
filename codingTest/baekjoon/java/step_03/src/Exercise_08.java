/*
 * ===문제 출처===
 * 11022 A+B - 8, <https://www.acmicpc.net/problem/11022>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Exercise_08 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		int a, b;
		for(int i=1; i<=length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
