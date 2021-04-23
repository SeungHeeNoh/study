/*
 * ===문제 출처===
 * d_f, <http://220.89.64.243/30stair/d_f/d_f.php?pname=d_f>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		new DF(Float.parseFloat(br.readLine())).getDandF();
// 		br.close();
// 	}
// }

class DF {
	float input;

	public DF() {}

	public DF(Float input) {
		this.input = input;
	}

	public void getDandF() {
		int n = 0;

		n = (int)input + (input < 0 ? -1 : 0);

		System.out.printf("%d %.2f", n, input - n);
	}
}