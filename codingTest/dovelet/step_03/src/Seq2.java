/*
 * ===문제 출처===
 * seq2, <http://220.89.64.243/30stair/seq2/seq2.php?pname=seq2>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Seq2(parseInt(br.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Seq2 {
	int n;

	public Seq2() {}

	public Seq2(int n) {
		this.n = n;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		int s = 1,
			l = 1,
			sum = 1;

		while(l <= n) {
			sb.append(s).append("..").append(l).append(" ").append(sum).append("\n");
			sum += ++l;
		}

		return sb.toString();
	}
}