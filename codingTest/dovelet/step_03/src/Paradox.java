/*
 * ===문제 출처===
 * paradox, <http://220.89.64.243/30stair/paradox/paradox.php?pname=paradox>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.printf("%f%n", new Paradox(parseInt(input.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Paradox {
	int n;

	final double YEAR = 365;

	public Paradox() {}

	public Paradox(int n) {
		this.n = n;
	}

	public double getResult() {
		double rest = 1;

		// 여집합 이용!!
		for(int i=0; i<n; i++) {
			rest *= (YEAR-i) / YEAR;
		}

		return 1.0 - rest;
	}
}