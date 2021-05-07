/*
 * ===문제 출처===
 * validate, <http://220.89.64.243/30stair/validate/validate.php?pname=validate>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Validate(input.readLine()).getVaildateNumber());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Validate {
	String number;

	public Validate() {}

	public Validate(String number) {
		this.number = number;
	}

	public int getVaildateNumber() {
		StringTokenizer st = new StringTokenizer(number);
		int sum = 0;

		while(st.hasMoreTokens()) {
			sum += Math.pow(parseInt(st.nextToken()), 2);
		}

		return sum%10;
	}
}