/*
 * ===문제 출처===
 * 1193 분수찾기, <https://www.acmicpc.net/problem/1193>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_03 {
	public void run() throws IOException{
		int d, n, x;
		boolean upFlag = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		br.close();
		

		int i = 1;
		while(true) {
			if(1+i*(i-1)/2 <= x && x < 1+i*(i+1)/2) break;
			i++;
		}

		if(i%2 != 0) {
			upFlag = true;
			d = i;
			n = 1;
		}else {
			d = 1;
			n = i;
		}

		i = (int)(1+i/2f*(i-1));
		while(i != x) {
			if(upFlag) {
				d--;
				n++;
			}else {
				d++;
				n--;
			}
			i++;
		}
		System.out.printf("%d/%d", d, n);
	}
}