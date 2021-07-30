/*
 * ===문제 출처===
 * pmin, <http://220.89.64.243/30stair/pmin/pmin.php?pname=pmin>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new PMin(parseInt(br.readLine().trim()), br.readLine()).getMinIndex());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class PMin {
	int length;
	String inputs;

	public PMin() {}

	public PMin(int length, String inputs) {
		this.length = length;
		this.inputs = inputs;
	}

	public String getMinIndex() {
		StringBuilder sb = new StringBuilder(30);
		StringTokenizer st = new StringTokenizer(inputs);
		int[] array = new int[length];
		int min = Integer.MAX_VALUE;
		

		for(int i=0; i<array.length; i++) {
			array[i] = parseInt(st.nextToken());
			if(min > array[i]) min = array[i];
		}

		for(int i=0; i<array.length; i++) {
			if(array[i] == min) sb.append(i+1).append(" ");
		}

		return sb.toString();
	}
}