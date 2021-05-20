/*
 * ===문제 출처===
 * cfrac, <http://220.89.64.243/30stair/cfrac/cfrac.php?pname=cfrac>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());

// 			System.out.println(new Cfrac(parseInt(st.nextToken()), parseInt(st.nextToken())).getAnSequence());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Cfrac {
	int n, m;

	public Cfrac() {}

	public Cfrac(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public String getAnSequence() {
		StringBuilder result = new StringBuilder();

		while(n != 0) {
			int temp = n;
			n = m;
			m = temp;

			result.append(n/m).append(" ");
			n = n%m;
		}

		return result.toString();
	}
}