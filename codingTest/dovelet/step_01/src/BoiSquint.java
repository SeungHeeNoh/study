/*
 * ===문제 출처===
 * boi_squint, <http://220.89.64.243/30stair/boi_squint/boi_squint.php?pname=boi_squint>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		System.out.println(new BoiSquint(Long.parseLong(br.readLine())).getSqrt());
// 		br.close();
// 	}
// }

class BoiSquint {
	long n;

	public BoiSquint() {}

	public BoiSquint(long n) {
		this.n = n;
	}

	public long getSqrt() {
		return (long) Math.ceil(Math.sqrt(n));
	}
}