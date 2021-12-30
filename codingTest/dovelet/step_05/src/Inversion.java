/*
 * ===문제 출처===
 * inversion, <http://220.89.64.243/30stair/inversion/inversion.php?pname=inversion&stair=5>.
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
// 			int count = parseInt(br.readLine());
// 			int[] inversionSequence = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// 			System.out.println(new Inversion(inversionSequence).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Inversion {
	private int[] inversionSequence;

	public Inversion() {}

	public Inversion(int[] inversionSequence) {
		this.inversionSequence = inversionSequence;
	}

	public String getResult() {
		int[] result = new int[inversionSequence.length];

		for(int i=0; i<inversionSequence.length; i++) {
			int index = 0,
				count = 0;

			while(count<inversionSequence[i] || result[index] != 0) {
				if(result[index] == 0) count++;
				index++;
			}

			result[index] = i+1;
		}

		return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}