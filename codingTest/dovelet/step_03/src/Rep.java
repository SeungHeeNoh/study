/*
 * ===문제 출처===
 * rep, <http://220.89.64.243/30stair/rep/rep.php?pname=rep>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Rep(parseInt(br.readLine())).printN());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Rep {
	int n;

	public Rep() {}

	public Rep(int n) {
		this.n = n;
	}

	public String printN() {
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<= n; i++) {
			sb.append(i).append(" ");
		}

		return sb.toString();
	}
}