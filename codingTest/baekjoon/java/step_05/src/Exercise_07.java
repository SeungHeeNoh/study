/*
 * ===문제 출처===
 * 4344 평균은 넘겠지, <https://www.acmicpc.net/problem/4344>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_07 {
	public void main() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int length = Integer.parseInt(br.readLine());

		for(int i=0; i<length; i++) {
			st = new StringTokenizer(br.readLine());

			int score[] = new int[Integer.parseInt(st.nextToken())],
				average = 0;
			for(int j=0; j<score.length; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				average += score[j];
			}
			average /= score.length;

			int count = 0;
			for(int j=0; j<score.length; j++) {
				if (average < score[j]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (float)count/score.length * 100);
		}
		br.close();
	}
}
