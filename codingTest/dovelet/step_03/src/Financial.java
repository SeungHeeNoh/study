/*
 * ===문제 출처===
 * financial, <http://220.89.64.243/30stair/financial/financial.php?pname=financial>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;

// public class Main {
// 	public static void main(String[] args) {
// 		new Financial().printAverageIncome();
// 	}
// }

class Financial {
	public Financial() {}

	public void printAverageIncome() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			double sum = 0d;
			int month = 0;
			String line = "";

			while((line = br.readLine()) != null) {
				month++;
				sum += parseDouble(line);
			}
			System.out.printf("$%.2f", month != 0 ? sum/month : 0d);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}