/*
 * ===문제 출처===
 * printe, <http://220.89.64.243/30stair/printe/printe.php?pname=printe>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new PrintE(parseInt(input.readLine().trim())).printResult();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class PrintE {
	private int n;

	public PrintE() {}

	public PrintE(int n) {
		this.n = n;
	}

	public void printResult() {
		StringBuilder result = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i == 0 || i == n-1 || i == n/2) {
				for(int j=0; j<n; j++) {
					result.append("*");
				}
			}else {
				result.append("*");
			}
			result.append("\n");
		}

		System.out.println(result);
	}
}