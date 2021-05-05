/*
 * ===문제 출처===
 * complete, <http://220.89.64.243/30stair/complete/complete.php?pname=complete>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Complete(parseInt(br.readLine())).isCompleteNumber());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Complete {
	int n;

	public Complete() {}

	public Complete(int n) {
		this.n = n;
	}

	public String isCompleteNumber() {
		String result = "no";
		int sum = 0;

		for(int i=1; i<n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}

		if(sum == n) result = "yes";

		return result;
	}
}