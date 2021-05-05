/*
 * ===문제 출처===
 * 1ton, <http://220.89.64.243/30stair/1ton/1ton.php?pname=1ton>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new ToN2(parseInt(br.readLine())).get1ToN());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ToN2 {
	int n;

	public ToN2() {}

	public ToN2(int n) {
		this.n = n;
	}

	public int get1ToN() {
		return n*(n+1)/2;
	}
}