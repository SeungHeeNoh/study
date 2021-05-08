/*
 * ===문제 출처===
 * nf, <http://220.89.64.243/30stair/nf/nf.php?pname=nf>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new NF(parseInt(input.readLine())).isSquareNumber());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class NF {
	int n;

	public NF() {}

	public NF(int n) {
		this.n = n;
	}

	public String isSquareNumber() {
		return (n%Math.sqrt(n) == 0) ? "yes" : "no";
	}
}