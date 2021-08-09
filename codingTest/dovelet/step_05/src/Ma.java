/*
 * ===문제 출처===
 * ma, <http://220.89.64.243/30stair/ma/ma.php?pname=ma>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Ma(br.readLine()).printHistogram();
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ma {
	String input;

	public Ma() {}

	public Ma(String input) {
		this.input = input;
	}

	public void printHistogram() {
		StringTokenizer st = new StringTokenizer(input);
		StringBuilder sb = new StringBuilder();
		int[] inputArray = new int[st.countTokens()-1];
		int max = 0;

		for(int i=0; i<inputArray.length; i++) {
			inputArray[i] = parseInt(st.nextToken());

			if(max < inputArray[i]) {
				max = inputArray[i];
			}
		}

		for(int i=max; i>0; i--) {
			for(int j=0; j<inputArray.length; j++) {
				if(inputArray[j] >= i) {
					sb.append(" *");
				} else {
					sb.append("  ");
				}
			}
			sb.append("\n");
		}

		for(int i=0; i<inputArray.length; i++) {
			sb.append(" ").append(inputArray[i]);
		}

		System.out.println(sb.toString());
	}
}