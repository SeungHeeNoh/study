/*
 * ===문제 출처===
 * ambiguous, <http://220.89.64.243/30stair/ambiguous/ambiguous.php?pname=ambiguous>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int length = parseInt(br.readLine());
// 			int[] array = new int[length];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<length; i++) {
// 				array[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new AmbiguousPermutation(array).check());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}AmbiguousPermutation
// 	}
// }

class AmbiguousPermutation {
	private int[] array;

	public AmbiguousPermutation() {}

	public AmbiguousPermutation(int[] array) {
		this.array = array;
	}

	public String check() {
		String result = "ambiguous";
		boolean flag = false;

		for(int i=0; i<array.length; i++) {
			if(array[i] != array[array[array[i]-1]-1]) {
				flag = true;
				break;
			}
		}

		if(flag)  {
			result = "not " + result;
		}

		return result;
	}
}