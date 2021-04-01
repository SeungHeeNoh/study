/*
 * ===문제 출처===
 * 11021 A+B - 7, <https://www.acmicpc.net/problem/11021>.
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Exercise_07 {
	public void main()	throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		int sum = 0;

		for(int i=1; i<=length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " +  sum + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}