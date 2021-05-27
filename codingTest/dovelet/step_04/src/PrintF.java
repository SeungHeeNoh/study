/*
 * ===문제 출처===
 * printF, <http://220.89.64.243/30stair/printF/printF.php?pname=printF>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String args[]) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			PrintF.printF(parseInt(input.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class PrintF {
	public PrintF() {}

	public static void printF(int n) {
		StringBuilder result = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i==0 || i == n/2) {
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