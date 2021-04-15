/*
 * ===문제 출처===
 * 10757 큰 수 A+B, <https://www.acmicpc.net/problem/10757>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_08 {
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		char a[] = st.nextToken().toCharArray(),
			 b[] = st.nextToken().toCharArray();
		
		int temp = 0, sum = 0;
		String result = "";
		int aIdx=a.length-1, bIdx=b.length-1;

		for(; aIdx>=0 && bIdx>=0; aIdx--, bIdx--) {
			sum = a[aIdx]-'0' + b[bIdx]-'0' + temp;
			temp = sum/10;
			sum %= 10;
			result = sum + result;
		}

		for(; aIdx>=0; aIdx--) {
			sum = a[aIdx]-'0' + temp;
			temp = sum/10;
			sum %= 10;
			result = sum + result;
		}

		for(; bIdx>=0; bIdx--) {
			sum = b[bIdx]-'0' + temp;
			temp = sum/10;
			sum %= 10;
			result = sum + result;
		}

		if(temp != 0) result = temp + result;
		System.out.println(result);
	}
}
