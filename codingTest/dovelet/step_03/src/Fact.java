/*
 * ===문제 출처===
 * fact, <http://220.89.64.243/30stair/fact/fact.php?pname=fact>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Fact().getResult(parseInt(br.readLine())));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Fact {
	public Fact() {}

	public int getResult(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * getResult(n-1);
		}
	}
}