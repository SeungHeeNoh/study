/*
 * ===문제 출처===
 * etnirp, <http://220.89.64.243/30stair/etnirp/etnirp.php?pname=etnirp>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Etnirp(parseInt(input.readLine().trim())).printEtnirp();;

// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Etnirp {
	private int n;

	public Etnirp() {}

	public Etnirp(int n) {
		this.n = n;
	}

	public void printEtnirp() {
		StringBuilder result = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i == 0 || i == n/2 ||i == n-1) {
				for(int j=0; j<n; j++) {
					result.append("*");
				}
			}else {
				for(int j=0; j<n-1; j++) {
					result.append(" ");
				}
				result.append("*");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}