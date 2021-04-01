/*
 * ===문제 출처===
 * 2742 기찍 N, <https://www.acmicpc.net/problem/2742>.
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercise_06 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		for(int i=length; i>0; i--) {
			bw.write(i+"\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}