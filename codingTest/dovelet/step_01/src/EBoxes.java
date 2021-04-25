/*
 * ===문제 출처===
 * eboxes, <http://220.89.64.243/30stair/eboxes/eboxes.php?pname=eboxes>.
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

// 		System.out.println(new EBoxes(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getBoxCount());
// 	}
// }

class EBoxes {
	int n, k, t, f;

	public EBoxes() {}

	public EBoxes(int n, int k, int t, int f) {
		this.n = n;
		this.k = k;
		this.t = t;
		this.f = f;
	}

	public long getBoxCount() {
		return n + (f-n)/(k-1)*k;
	}
}