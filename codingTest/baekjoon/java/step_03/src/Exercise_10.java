/*
 * ===문제 출처===
 * 2439 별 찍기 - 2, <https://www.acmicpc.net/problem/2439>.
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercise_10 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();

		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				bw.write(" ");
			}
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
