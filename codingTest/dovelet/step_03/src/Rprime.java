/*
 * ===문제 출처===
 * rprime, <http://220.89.64.243/30stair/rprime/rprime.php?pname=rprime>.
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
// 			System.out.println(Rprime.isRelativelyPrime(parseInt(st.nextToken()), parseInt(st.nextToken())));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Rprime {
	public static String isRelativelyPrime(int x, int y) {
		String result = "yes";

		for(int i=2; i<=x; i++) {
			if(x%i == 0 && y%i == 0) {
				result = "no";
				break;
			}
		}

		return result;
	}
}