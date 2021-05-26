/*
 * ===문제 출처===
 * coci_pascal, <http://220.89.64.243/30stair/coci_pascal/coci_pascal.php?pname=coci_pascal>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Pascal(parseInt(input.readLine().trim())).getCounter());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Pascal {
	private int n;

	public Pascal() {}

	public Pascal(int n) {
		this.n = n;
	}

	public int getCounter() {
		int counter = 0,
			startNumber = 0;

		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				startNumber = n/i;
				break;
			}
		}

		if(startNumber == 0) startNumber = 1;

		// counter = n-1-startNumber+1;
		counter = n-startNumber;

		return counter;
	}
}