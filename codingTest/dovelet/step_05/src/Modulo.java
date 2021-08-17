/*
 * ===문제 출처===
 * coci_modulo, <http://220.89.64.243/30stair/coci_modulo/coci_modulo.php?pname=coci_modulo>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] input = new int[10];

// 			for(int i=0; i<input.length; i++) {
// 				input[i] = parseInt(br.readLine().trim());
// 			}

// 			System.out.println(new Modulo(input).getCountDifferent());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Modulo {
	static final int TARGET = 42;
	int[] countArray = new int[TARGET];
	int[] input;

	public Modulo() {}

	public Modulo(int[] input) {
		this.input = input;
	}

	public int getCountDifferent() {
		int count = 0;

		for(int i=0; i<input.length; i++) {
			countArray[input[i]%TARGET]++;
		}

		for(int i=0; i<countArray.length; i++) {
			if(countArray[i] > 0) {
				count++;
			}
		}

		return count;
	}
}