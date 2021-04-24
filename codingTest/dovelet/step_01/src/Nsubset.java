/*
 * ===문제 출처===
 * nsubset, <http://220.89.64.243/30stair/nsubset/nsubset.php?pname=nsubset>.
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

// 		System.out.println(new Nsubset(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getSubSetCount());
// 	}
// }

class Nsubset {
	long n, m;

	public Nsubset() {}

	public Nsubset(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public long getSubSetCount() {
		return (long)Math.pow(m, n);
	}
}