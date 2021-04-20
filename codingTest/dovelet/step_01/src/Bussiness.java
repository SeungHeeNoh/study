/*
 * ===문제 출처===
 * business, <http://220.89.64.243/30stair/business/business.php?pname=business>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Business run = new Business(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getLoss());
// 	}
// }

class Business {
	int n, m, p, c;

	Business() {}

	Business(int n, int m, int p, int c) {
		this.n = n;
		this.m = m;
		this.p = p;
		this.c = c;
	}

	int getLoss() {
		return p+n-m;
	}
}