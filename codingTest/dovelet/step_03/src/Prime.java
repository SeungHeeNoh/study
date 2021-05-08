/*
 * ===문제 출처===
 * prime, <http://220.89.64.243/30stair/prime/prime.php?pname=prime>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Prime(parseInt(input.readLine())).isPrime());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Prime {
	int n;

	public Prime() {}

	public Prime(int n) {
		this.n = n;
	}

	public String isPrime() {
		String result = "prime";

		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				result = "not prime";
				break;
			}
		}

		return result;
	}
}