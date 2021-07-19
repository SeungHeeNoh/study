/*
 * ===문제 출처===
 * decomp, <http://220.89.64.243/30stair/decomp/decomp.php?pname=decomp>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new DeComp(parseInt(br.readLine().trim())).getFactorString());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class DeComp {
	int n;

	public DeComp() {}

	public DeComp(int n) {
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