/*
 * ===문제 출처===
 * min, <http://220.89.64.243/30stair/min/min.php?pname=min>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Min(br.readLine()).getMin());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Min {
	String input;

	public Min() {}

	public Min(String input) {
		this.input = input;
	}

	public int getMin() {
		int min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(input);

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());

			if(min > temp) min = temp;
		}

		return min;
	}
}