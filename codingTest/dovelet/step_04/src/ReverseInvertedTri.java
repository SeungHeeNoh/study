/*
 * ===문제 출처===
 * tri3, <http://220.89.64.243/30stair/tri3/tri3.php?pname=tri3>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new ReverseInvertedTri(parseInt(input.readLine().trim())).printReverseInvertedTri();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ReverseInvertedTri {
	private int n;

	public ReverseInvertedTri() {}

	public ReverseInvertedTri(int n) {
		this.n = n;
	}

	public void printReverseInvertedTri() {
		StringBuilder result = new StringBuilder();

		for(int i=n; i>0; i--) {
			for(int j=0; j<n; j++) {
				if(j < n-i) {
					result.append(" ");
				}else {
					result.append("*");
				}
			}
			result.append("\n");
		}

		System.out.println(result.toString());
	}
} 