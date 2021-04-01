/*
 * ===문제 출처===
 * 10950 A+B - 3, <https://www.acmicpc.net/problem/10950>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_02 {
	public void main() {
		try {
			int a, b, length;
			String arr[];
			String result = "";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			length = Integer.parseInt(br.readLine());

			for(int i=0; i<length; i++) {
				arr = br.readLine().split(" ");
				a = Integer.parseInt(arr[0]);
				b = Integer.parseInt(arr[1]);
				result += (a+b) + "\n";
			}

			br.close();
			System.out.print(result);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}