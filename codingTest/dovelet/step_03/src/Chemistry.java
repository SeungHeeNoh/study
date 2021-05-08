/*
 * ===문제 출처===
 * chemistry, <http://220.89.64.243/30stair/chemistry/chemistry.php?pname=chemistry>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;;

// public class Main {
// 	public static void main(String[] args) {
// 		new Chemistry().printResult();
// 	}
// }

class Chemistry {
	final static float FINAL_INPUT = 999;

	public Chemistry() {}

	public void printResult() {
		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			double prevTemearture = parseDouble(input.readLine()),
				   tempearture = 0d;

			while((tempearture = parseDouble(input.readLine()))  != FINAL_INPUT) {
				System.out.printf("%.2f%n", tempearture - prevTemearture);
				prevTemearture = tempearture;
			}
			System.out.println("End of Output");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}