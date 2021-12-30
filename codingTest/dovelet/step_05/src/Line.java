/*
 * ===문제 출처===
 * line, <http://220.89.64.243/30stair/line/line.php?pname=line>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int length = parseInt(br.readLine());
// 			int[] selecedNumberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// 			System.out.println(new Line(selecedNumberArray).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Line {
	private int[] selectedNumberArray;

	public Line() {}

	public Line(int[] selectedNumberArray) {
		this.selectedNumberArray = selectedNumberArray;
	}

	public String getResult() {
		int[] result = new int[selectedNumberArray.length];

		for(int i=0; i<selectedNumberArray.length; i++) {
			int j = i-selectedNumberArray[i];

			for(int k=i; k>j; k--) {
				result[k] = result[k-1];
			}
			result[j] = i+1;
		}

		return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}