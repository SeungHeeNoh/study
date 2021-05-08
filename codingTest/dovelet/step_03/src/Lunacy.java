/*
 * ===문제 출처===
 * lunacy, <http://220.89.64.243/30stair/lunacy/lunacy.php?pname=lunacy>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			double x;

// 			while((x = parseDouble(input.readLine())) > 0) {
// 				new Lunacy(x).getResult();
// 			}
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Lunacy {
	double x;

	final static double MOON_WEIGHT = 0.167d;

	public Lunacy() {}

	public Lunacy(double x) {
		this.x = x;
	}

	public void getResult() {
		System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.%n", x, x*MOON_WEIGHT);
	}
}