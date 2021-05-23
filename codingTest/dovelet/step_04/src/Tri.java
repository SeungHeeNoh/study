/*
 * ===문제 출처===
 * tri1, <http://220.89.64.243/30stair/tri1/tri1.php?pname=tri1>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Tri(parseInt(input.readLine().trim())).printTriangle();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Tri {
	private int n;

	public Tri() {}

	public Tri(int n) {
		this.n = n;
	}

	public void printTriangle() {
		StringBuilder triangle = new StringBuilder();

		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				triangle.append("*");
			}
			triangle.append("\n");
		}
		System.out.println(triangle.toString());
	}
}