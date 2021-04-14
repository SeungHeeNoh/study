/*
 * ===문제 출처===
 * 2869 달팽이는 올라가고 싶다, <https://www.acmicpc.net/problem/2869>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_04 {
	public void run() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int a = Integer.parseInt(st.nextToken()),
			b = Integer.parseInt(st.nextToken()),
			v = Integer.parseInt(st.nextToken());

		System.out.println(((v-a)/(a-b)) + 1 + ((v-a)%(a-b) != 0 ? 1 : 0));
	}
}
