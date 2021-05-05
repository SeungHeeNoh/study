/*
 * ===문제 출처===
 * mM, <http://220.89.64.243/30stair/mM/mM.php?pname=mM>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new MM(br.readLine()).getMaxAndMin());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MM {
	String input;

	public MM() {}

	public MM(String input) {
		this.input = input;
	}

	public String getMaxAndMin() {
		int min = Integer.MAX_VALUE,
			max = 0;
		StringTokenizer st = new StringTokenizer(input);

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());

			if(max < temp) max = temp;
			if(min > temp) min = temp;
		}

		return max + " " + min;
	}
}