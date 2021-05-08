/*
 * ===문제 출처===
 * arith_seq, <http://220.89.64.243/30stair/arith_seq/arith_seq.php?pname=arith_seq>.
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
// 			System.out.println(new ArithSeq(parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).isInSequence());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ArithSeq {
	int a, d, an;

	public ArithSeq() {}

	public ArithSeq(int a, int d, int an) {
		this.a = a;
		this.d = d;
		this.an = an;
	}

	public String isInSequence() {
		String result = "X";

		if((an-a+d) % d == 0) {
			result = String.valueOf((an-a+d) / d);
		}

		return result;
	}
}