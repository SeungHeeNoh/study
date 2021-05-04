/*
 * ===문제 출처===
 * star, <http://220.89.64.243/30stair/star/star.php?pname=star>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Star(parseInt(br.readLine())).printStar();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Star {
	int n;

	public Star() {}

	public Star(int n) {
		this.n = n;
	}

	public void printStar() {
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {
			sb.append("*");
		}

		System.out.println(sb);
	}
}