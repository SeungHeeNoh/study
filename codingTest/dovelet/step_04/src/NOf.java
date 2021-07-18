/*
 * ===문제 출처===
 * nOf, <http://220.89.64.243/30stair/nOf/nOf.php?pname=nOf>.
 * */
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			System.out.println(new NOf(parseInt(st.nextToken()), parseInt(st.nextToken())).getMCount());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class NOf {
	int n, m;

	public NOf() {}

	public NOf(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public int getMCount() {
		int count = 0;

		for(int i=1; i<=n; i++) {
			if(i%m == 0) {
				int k = i;

				while(k%m == 0) {
					k /=m;
					count++;
				}
			}
		}

		return count;
	}
}