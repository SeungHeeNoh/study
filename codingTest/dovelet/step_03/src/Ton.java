/*
 * ===문제 출처===
 * 1ton1, <http://220.89.64.243/30stair/1ton1/1ton1.php?pname=1ton1>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Ton(parseInt(br.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ton {
	int n;

	public Ton() {}

	public Ton(int n) {
		this.n = n;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		int sum = 0;

		for(int i=1; i<=n; i++) {
			sum += i;
			sb.append(i);
			if(i != n) sb.append("+");
		}

		sb.append("=").append(sum);

		return sb.toString();
	}
}