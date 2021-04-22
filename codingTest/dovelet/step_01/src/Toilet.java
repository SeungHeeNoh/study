/*
 * ===문제 출처===
 * toilet, <http://220.89.64.243/30stair/toilet/toilet.php?pname=toilet>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		System.out.printf(new Toilet(Integer.parseInt(br.readLine().trim())).getMaxMin());
// 		br.close();
// 	}
// }

class Toilet {
	int n;

	public Toilet() {}

	public Toilet(int n) {
		this.n = n;
	}

	public String getMaxMin() {
		return (1+(n-1)/2) + " " + (1+(n-1)/3);
	}
}