/*
 * ===문제 출처===
 * zorro, <http://220.89.64.243/30stair/zorro/zorro.php?pname=zorro>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			Zorro.printZorro(parseInt(input.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Zorro {
	public Zorro() {}

	public static void printZorro(int n) {
		StringBuilder result = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i == 0 || i == n-1) {
				for(int j=0; j<n; j++) {
					result.append("*");
				}
			}else {
				for(int j=0; j<n-i-1; j++) {
					result.append(" ");
				}
				result.append("*");
			}
			result.append("\n");
		}

		System.out.println(result);
	}
}