/*
 * ===문제 출처===
 * 1546 평균, <https://www.acmicpc.net/problem/1546>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_05 {
	public void main() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double score[] = new double[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		double max = -1d,
			   result = 0d;
		for(int i=0; i<score.length; i++) {
			score[i] = Double.parseDouble(st.nextToken());
			if (score[i] > max) max = score[i];
		}

		for(int i=0; i<score.length; i++) {
			result += score[i] / max * 100;
		}

		System.out.print(result/score.length);
	}
}
