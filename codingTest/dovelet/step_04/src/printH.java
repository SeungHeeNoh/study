/*
 * ===문제 출처===
 * printH, <http://220.89.64.243/30stair/printH/printH.php?pname=printH>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			printH.printH(parseInt(input.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class printH {
	public printH() {}

	public static void printH(int n) {
		StringBuilder result = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i == n/2) {
				for(int j=0; j<n; j++) {
					result.append("*");
				}
			}else {
				for(int j=0; j<n; j++) {
					if(j == 0 || j == n-1) {
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