/*
 * ===문제 출처===
 * 10871 X보다 작은 수, <https://www.acmicpc.net/problem/10871>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_11 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		StringTokenizer codition = new StringTokenizer(br.readLine());
		StringTokenizer array = null;

		int length = Integer.parseInt(codition.nextToken()),
			x = Integer.parseInt(codition.nextToken()),
			temp = 0;
		array = new StringTokenizer(br.readLine());
		br.close();

		for(int i=0; i<length; i++) {
			temp = Integer.parseInt(array.nextToken());

			if (temp < x) {
				bf.append(temp).append(" ");
			}
		}
		System.out.println(bf);
	}
}