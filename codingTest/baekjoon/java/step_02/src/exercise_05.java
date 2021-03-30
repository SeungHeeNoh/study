/*
 * ===문제 출처===
 * 2884 알람 시계, <https://www.acmicpc.net/problem/2884>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercise_05{
	public void main() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String arr[] = br.readLine().split(" ");
			br.close();

			int h = Integer.parseInt(arr[0]),
				m = Integer.parseInt(arr[1]);
			final int BUFFER = 45;

			if(m < BUFFER) {
				if(h == 0) h = 24;
				h--;
				m += 60 - BUFFER;
			}else {
				m -= BUFFER;
			}

			System.out.printf("%d %d", h, m);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}