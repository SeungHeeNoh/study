/*
 * ===문제 출처===
 * 1000번 A+B, <https://www.acmicpc.net/problem/1000>.
 * */
package step_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_05 {
	public static void main() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int a, b;
			String[] arr;
			
			arr = br.readLine().split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			br.close();
			
			System.out.println(a+b);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
