/*
 * ===문제 출처===
 * hack, <http://220.89.64.243/30stair/hack/hack.php?pname=hack>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		System.out.println(new Hack(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult());
// 	}
// }

class Hack {
	int r, e, c;

	public Hack() {}

	public Hack(int r, int e, int c) {
		this.r = r;
		this.e = e;
		this.c = c;
	}

	public String getResult() {
		return r > (e - c) ? "do not advertise" : r == (e - c) ? "does not matter" : "advertise";
	}
}