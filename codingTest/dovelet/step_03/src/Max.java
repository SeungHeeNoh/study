/*
 * ===문제 출처===
 * max, <http://220.89.64.243/30stair/max/max.php?pname=max>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Max(br.readLine()).getMax());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Max {
	String input;

	public Max() {}

	public Max(String input) {
		this.input = input;
	}

	public int getMax() {
		int max = 0;
		StringTokenizer st = new StringTokenizer(input);

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());

			if(max < temp) max = temp;
		}

		return max;
	}
}