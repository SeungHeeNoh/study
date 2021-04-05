/*
 * ===문제 출처===
 * 3052 나머지, <https://www.acmicpc.net/problem/3052>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_04 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result[] = new int[42],
			count = 0;

		for(int i=0; i<10; i++) {
			result[Integer.parseInt(br.readLine()) % 42]++;
		}
		br.close();

		for(int i=0; i<result.length; i++) {
			if (result[i] != 0) count++;
		}
		System.out.println(count);
	}
}