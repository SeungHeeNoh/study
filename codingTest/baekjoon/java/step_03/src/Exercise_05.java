/*
 * ===문제 출처===
 * 2741 N 찍기, <https://www.acmicpc.net/problem/2741>.
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercise_05 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		for(int i=1; i<=length; i++) {
			bw.write(i+"\n");
		}
	
		bw.flush();
		br.close();
		bw.close();
	}
}
