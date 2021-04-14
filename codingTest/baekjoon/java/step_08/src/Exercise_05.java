/*
 * ===문제 출처===
 * 10250 ACM 호텔, <https://www.acmicpc.net/problem/10250>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_05 {
	public void run() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());

		for(int i=0; i<length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()),
				w = Integer.parseInt(st.nextToken()),
				n = Integer.parseInt(st.nextToken()),
				count = 0;
			
			for(count=1; h<n; count++) {
				n-=h;
			}
			System.out.printf("%d%02d%n", n, count);
		}
		br.close();
	}
}
