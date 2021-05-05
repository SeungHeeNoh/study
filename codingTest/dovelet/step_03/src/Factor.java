/*
 * ===문제 출처===
 * factor, <http://220.89.64.243/30stair/factor/factor.php?pname=factor>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Factor(parseInt(br.readLine())).printFactor());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Factor {
	int n;

	public Factor() {}

	public Factor(int n) {
		this.n = n;
	}

	public String printFactor() {
		StringBuilder sb  = new StringBuilder();

		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				sb.append(i).append("\n");
			}
		}
		return sb.toString();
	}
}