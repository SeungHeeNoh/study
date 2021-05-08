/*
 * ===문제 출처===
 * mmm, <http://220.89.64.243/30stair/mmm/mmm.php?pname=mmm>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new MMM(input.readLine()).getMMM());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MMM {
	String input;

	public MMM() {}

	public MMM(String input) {
		this.input = input;
	}

	public String getMMM() {
		StringBuffer result = new StringBuffer();
		StringTokenizer st = new StringTokenizer(input);
		int sum = 0,
			min = Integer.MAX_VALUE,
			max = Integer.MIN_VALUE;

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());
			sum += temp;

			if(min > temp) min = temp;
			if(max < temp) max = temp;
		}

		result.append(sum).append(" ").append(max).append(" ").append(min);
		return result.toString();
	}
}