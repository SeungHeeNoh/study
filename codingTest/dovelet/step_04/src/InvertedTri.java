/*
 * ===문제 출처===
 * tri2, <http://220.89.64.243/30stair/tri2/tri2.php?pname=tri2>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new InvertedTri(parseInt(input.readLine().trim())).printInvertedTriangle();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class InvertedTri {
	private int n;

	public InvertedTri() {}

	public InvertedTri(int n) {
		this.n = n;
	}

	public void printInvertedTriangle() {
		StringBuilder result = new StringBuilder();

		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				result.append("*");
			}
			result.append("\n");
		}

		System.out.println(result.toString());
	}
}