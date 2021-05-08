/*
 * ===문제 출처===
 * ftod, <http://220.89.64.243/30stair/ftod/ftod.php?pname=ftod>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new Ftod(parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).changeDecimal());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ftod {
	int numerator, denominator,k;

	public Ftod() {}

	public Ftod(int numerator, int denominator, int k) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.k = k;
	}

	public String changeDecimal() {
		int quotient = numerator/denominator,
			mod = numerator%denominator;
		StringBuffer result = new StringBuffer(String.valueOf(quotient) + ".");

		for(int i=0; i<k; i++) {
			mod *= 10;
			quotient = mod/denominator;
			mod = mod%denominator;
			result.append(quotient);
		}

		return result.toString();
	}
}