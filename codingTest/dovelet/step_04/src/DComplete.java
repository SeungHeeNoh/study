/*
 * ===문제 출처===
 * dcomplete, <http://220.89.64.243/30stair/dcomplete/dcomplete.php?pname=dcomplete>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new DComplete(parseInt(br.readLine().trim())).printCompleteNumber();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class DComplete {
	private int n;

	public DComplete() {}

	public DComplete(int n) {
		this.n = n;
	}

	public void printCompleteNumber() {
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<=n; i++) {
			int sum = 0;

			for(int j=1; j<i; j++) {
				if(i%j == 0) sum += j;
			}

			if(sum == i) sb.append(i).append("\n");
		}

		System.out.println(sb.toString());
	}
}