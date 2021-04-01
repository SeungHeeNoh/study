/*
 * ===문제 출처===
 * 10951 A+B - 4, <https://www.acmicpc.net/problem/10951>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Exercise_02 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		StringTokenizer st = null;
		String input;
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			bf.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		br.close();
		System.out.print(bf);
	}
}