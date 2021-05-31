/*
 * ===문제 출처===
 * tri4, <http://220.89.64.243/30stair/tri4/tri4.php?pname=tri4>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			Tri4.printTri(parseInt(input.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Tri4 {
	public Tri4() {}

	public static void printTri(int n) {
		StringBuilder result = new StringBuilder();
		int i = 1;

		while(i <= n) {
			for(int j=1; j<=(n-i)/2; j++) {
				result.append(" ");
			}

			for(int j=1; j<=i; j++) {
				result.append("*");
			}

			i+=2;
			result.append("\n");
		}

		System.out.println(result);
	}
}