/*
 * ===문제 출처===
 * pfactor, <http://220.89.64.243/30stair/pfactor/pfactor.php?pname=pfactor>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new PFactor(parseInt(br.readLine().trim())).getFactorString());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class PFactor {
	int n;

	public PFactor() {}

	public PFactor(int n) {
		this.n = n;
	}

	public String getFactorString() {
		StringBuffer sb = new StringBuffer();

		for(int i=2; n!=1; i++) {
			while(n%i == 0) {
				n /= i;
				sb.append(i).append(" ");
			}
		}

		return sb.toString();
	}
}