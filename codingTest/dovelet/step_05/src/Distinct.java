/*
 * ===문제 출처===
 * distinct, <http://220.89.64.243/30stair/distinct/distinct.php?pname=distinct>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			br.readLine();
// 			System.out.println(new Distinct(br.readLine()).getDistinctCount());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Distinct {
	static int[] countArray = new int[10001];
	String input;

	public Distinct() {}

	public Distinct(String input) {
		this.input = input;
	}

	public int getDistinctCount() {
		StringTokenizer st = new StringTokenizer(input);
		int count = 0;

		while(st.hasMoreTokens()) {
			countArray[parseInt(st.nextToken())]++;
		}

		for(int i=1; i<countArray.length; i++) {
			if(countArray[i] != 0) count++;
		}

		return count;
	}
}