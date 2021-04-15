/*
 * ===문제 출처===
 * 2839 설탕 배달, <https://www.acmicpc.net/problem/2839>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_07 {
	public void run() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		br.close();

		int min=Integer.MAX_VALUE;
		for(int i=0; 5*i<= sugar; i++) {
			for(int j=0; 3*j <= sugar; j++) {
				if(5*i + 3*j == sugar && min > (i+j)) {
					min = i+j;
				}
			}
		}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
	}
}
