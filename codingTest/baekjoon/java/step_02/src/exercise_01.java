/*
 * ===문제 출처===
 * 1330 두 수 비교하기, <https://www.acmicpc.net/problem/1330>.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_01 {
	public void main() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String arr[] = br.readLine().split(" ");
			br.close();
			int a = Integer.parseInt(arr[0]),
				b = Integer.parseInt(arr[1]);

			String result = a == b ? "==" : (a > b ? ">" : "<");
			System.out.println(result);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
