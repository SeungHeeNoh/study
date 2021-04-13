/*
 * ===문제 출처===
 * 2292 벌집, <https://www.acmicpc.net/problem/2292>.
 * */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_02 {
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		br.close();

		if(input == 1) {
			System.out.println(1);
		}else {
			for(int i=1; ; i++) {
				if(2+3*i*(i-1) <= input && input < 2+3*(i+1)*(i)) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}