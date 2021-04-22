/*
 * ===문제 출처===
 * nuclear, <http://220.89.64.243/30stair/nuclear/nuclear.php?pname=nuclear>.
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

// 		Nuclear run = new Nuclear(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%d", run.getEnergy());
// 	}
// }

class Nuclear {
	int k, n;

	public Nuclear() {}

	public Nuclear(int k, int n) {
		this.k = k;
		this.n = n;
	}

	public int getEnergy() {
		return (n-1) / (k-1) * 100;
	}
}