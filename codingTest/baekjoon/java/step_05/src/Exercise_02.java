/*
 * ===문제 출처===
 * 2562 최댓값, <https://www.acmicpc.net/problem/2562>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_02 {
	public void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = 9;
		int arr[] = new int[length];

		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		int idx=0, max=arr[0];
		for(int i=1; i<length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.printf("%d\n%d", max, idx+1);
	}
}
