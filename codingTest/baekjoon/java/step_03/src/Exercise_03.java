/*
 * ===문제 출처===
 * 8393 합, <https://www.acmicpc.net/problem/8393>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_03 {
	public void main() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			br.close();

			System.out.println(n*(n+1)/2);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
