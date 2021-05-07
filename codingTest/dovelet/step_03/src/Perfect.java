/*
 * ===문제 출처===
 * perfect, <http://220.89.64.243/30stair/perfect/perfect.php?pname=perfect>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Perfect(parseInt(input.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Perfect {
	int n;

	public Perfect() {}

	public Perfect(int n) {
		this.n = n;
	}

	public String getResult() {
		StringBuilder result = new StringBuilder(String.format("%5d  ", n));
		int sum = 0;

		for(int i=1; i<n; i++) {
			if(n%i == 0) {
				sum+=i;
			}
		}

		if(sum < n) {
			result.append("DEFICIENT");
		}else if(sum == n) {
			result.append("PERFECT");
		}else {
			result.append("ABUNDANT");
		}

		return result.toString();
	}
}