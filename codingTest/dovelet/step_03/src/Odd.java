/*
 * ===문제 출처===
 * odd, <http://220.89.64.243/30stair/odd/odd.php?pname=odd>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new Odd().getResult());
// 	}
// }

class Odd {
	public Odd() {}

	public String getResult() {
		StringBuilder sb = new StringBuilder();

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int oddCount = 0,
				sum = 0,
				min = Integer.MAX_VALUE;
			String line;

			while((line = br.readLine()) != null) {
				int temp = parseInt(line);

				if(temp%2 == 1) {
					oddCount++;
					if(temp < min) min = temp;
					sum += temp;
				}
			}

			if(oddCount == 0) {
				sb.append(-1);
			}else {
				sb.append(sum).append("\n").append(min);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
}