/*
 * ===문제 출처===
 * ms, <http://220.89.64.243/30stair/ms/ms.php?pname=ms>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int length = parseInt(br.readLine());
// 			int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// 			System.out.println(new MS(array).getMaxLength());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MS {
	private int[] array;

	public MS() {}

	public MS(int[] array) {
		this.array = array;
	}

	public int getMaxLength() {
		int maxAscendingLength = getMaxAscendingLength(),
			maxDescendingLength = getMaxDescendingLength();

		return maxAscendingLength > maxDescendingLength ? maxAscendingLength : maxDescendingLength;
	}

	private int getMaxAscendingLength() {
		int[] memoziationArray = new int[array.length];
		int max = 1;

		for(int i=0; i<array.length; i++) {
			if(i==0 || array[i-1] > array[i]) {
				memoziationArray[i] = 1;
			} else {
				memoziationArray[i] = memoziationArray[i-1]+1;

				if(max < memoziationArray[i]) max = memoziationArray[i];
			}
		}

		return max;
	}

	private int getMaxDescendingLength() {
		int[] memoziationArray = new int[array.length];
		int max = 1;

		for(int i=0; i<array.length; i++) {
			if(i==0 || array[i-1] <array[i]) {
				memoziationArray[i] = 1;
			} else {
				memoziationArray[i] = memoziationArray[i-1]+1;

				if(max < memoziationArray[i]) max = memoziationArray[i];
			}
		}

		return max;
	}
}