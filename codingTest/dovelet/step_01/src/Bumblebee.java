/*
 * ===문제 출처===
 * bumblebee, <http://220.89.64.243/30stair/bumblebee/bumblebee.php?pname=bumblebee>.
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

// 		Bumblebee run = new Bumblebee(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%.6f", run.getM());
// 	}
// }

class Bumblebee {
	int a, b, x, l;

	public Bumblebee() {}

	public Bumblebee(int a, int b, int x, int l) {
		this.a = a;
		this.b = b;
		this.x = x;
		this.l = l;
	}

	public double getM() {
		return l/(double)(a+b)*x;
	}
}