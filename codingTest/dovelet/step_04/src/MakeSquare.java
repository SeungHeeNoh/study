/*
 * ===문제 출처===
 * make_square, <http://220.89.64.243/30stair/make_square/make_square.php?pname=make_square>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new MakeSquare(parseInt(br.readLine().trim())).getFirstMakeSquare());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MakeSquare {
	int n;

	public MakeSquare() {}

	public MakeSquare(int n) {
		this.n = n;
	}

	public int getFirstMakeSquare() {
		int firstMakeSquare = 1;

		while(((n*firstMakeSquare)%Math.sqrt(n*firstMakeSquare) != 0)) {
			firstMakeSquare++;
		}

		return firstMakeSquare;
	}
}