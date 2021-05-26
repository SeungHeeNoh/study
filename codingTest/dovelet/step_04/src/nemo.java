/*
 * ===문제 출처===
 * nemo, <http://220.89.64.243/30stair/nemo/nemo.php?pname=nemo>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new nemo(parseInt(input.readLine().trim())).printNemo();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class nemo {
	private int n;

	public nemo() {}

	public nemo(int n) {
		this.n = n;
	}

	public void printNemo() {
		StringBuilder result = new StringBuilder();

		for(int i=1; i<=n; i++) {
			if(i == 1 || i == n) {
				for(int j=1; j<=n; j++) {
					result.append("*");
				}
			}else {
				for(int j=1; j<=n; j++) {
					if(j == 1 || j == n) {
						result.append("*");
					}else {
						result.append(" ");
					}
				}
			}
			result.append("\n");
		}

		System.out.println(result);
	}
}