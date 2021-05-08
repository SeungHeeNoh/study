/*
 * ===문제 출처===
 * tf, <http://220.89.64.243/30stair/tf/tf.php?pname=tf>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new TF(parseInt(input.readLine())).getOP());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class TF {
	int n;

	public TF() {}

	public TF(int n) {
		this.n = n;
	}

	public String getOP() {
		int o = 0,
			p = 0;

		while(n%2 == 0) {
			n /= 2;
			p++;
		}
		o = n;

		return o + " " + p;
	}
}