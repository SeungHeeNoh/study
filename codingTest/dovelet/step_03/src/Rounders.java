/*
 * ===문제 출처===
 * rounders, <http://220.89.64.243/30stair/rounders/rounders.php?pname=rounders>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Rounders(parseInt(input.readLine())).getRoundResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Rounders {
	int x;

	final double ROUND_NUMBER = 0.5d;

	public Rounders() {}

	public Rounders(int x) {
		this.x = x;
	}

	public int getRoundResult() {
		int length = String.valueOf(x).length();

		if(length > 1) {
			for(int i=1; i<length; i++) {
				x = (int)((int)(x / Math.pow(10, i) + ROUND_NUMBER) * Math.pow(10, i));
			}
		}

		return x;
	}
}