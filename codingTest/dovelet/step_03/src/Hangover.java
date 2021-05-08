/*
 * ===문제 출처===
 * hangover, <http://220.89.64.243/30stair/hangover/hangover.php?pname=hangover>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Hangover(parseDouble(input.readLine())).getCardCount());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Hangover {
	double length;

	public Hangover() {}

	public Hangover(double length) {
		this.length = length;
	}

	public String getCardCount() {
		int count = 0,
			i = 2;
		double sum = 0;

		while(sum <= length) {
			sum += 1 / (double)i++;
			count++;
		}

		return count + " card(s)";
	}
}