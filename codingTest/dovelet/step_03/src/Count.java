/*
 * ===문제 출처===
 * count, <http://220.89.64.243/30stair/count/count.php?pname=count>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Count(parseInt(input.readLine().trim())).printResult();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Count {
	int n;

	public Count() {}

	public Count(int n) {
		this.n = n;
	}

	public void printResult() {
		int i = 0,
			sum = 0,
			k = 0;

		while(!(sum-i < n && n <= sum)) {
			sum += i++;
		}
		i--;
		k = sum-n;

		System.out.printf("%d IS %s", n, i%2 == 0 ? (i-k) + "/" + (k+1) : (k+1) + "/" + (i-k));
	}
}