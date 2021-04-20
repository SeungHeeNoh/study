/*
 * ===문제 출처===
 * coci_slatkisi, <http://220.89.64.243/30stair/coci_slatkisi/coci_slatkisi.php?pname=coci_slatkisi>.
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

// 		CociSlatkisi run = new CociSlatkisi(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getCandyPrice());
// 	}
// }

class CociSlatkisi {
	int c, k;

	public CociSlatkisi() {}

	public CociSlatkisi(int c, int k) {
		this.c = c;
		this.k = k;
	}

	public int getCandyPrice() {
		double haveMin = Math.pow(10, k);

		return ((int)(c / haveMin + 0.5) * (int)haveMin);
	}
}