/*
 * ===문제 출처===
 * candy, <http://220.89.64.243/30stair/candy/candy.php?pname=candy>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int n = parseInt(br.readLine());
// 			int[] array = new int[n];

// 			for(int i=0; i<n; i++) {
// 				array[i] = parseInt(br.readLine());
// 			}

// 			System.out.println(new Candy(array).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Candy {
	private int[] array;

	public Candy() {}

	public Candy(int[] array) {
		this.array = array;
	}

	public String getResult() {
		StringBuffer sb = new StringBuffer();
		int processCount = 0,
			min = 0,
			max = 0;
		int[] resultArray = new int[array.length];

		for(int i=0; i<array.length; i++) {
			if(i == 0) {
				max = min = array[i];
			} else {
				if(max < array[i]) max = array[i];
				else if(min > array[i]) min = array[i];
			}
		}

		while(min < max) {
			processCount++;

			int temp = min;
			min = max;
			max = temp;

			for(int i=0; i<array.length; i++) {
				int now = array[i]/2,
					prev = array[i == 0 ? array.length-1 : i-1]/2;

				resultArray[i] = now+prev + (((now+prev)%2 == 0) ? 0 : 1);

				if(max < resultArray[i]) max = resultArray[i];
				else if(min > resultArray[i]) min = resultArray[i];
			}

			array = Arrays.copyOf(resultArray, resultArray.length);
		}

		sb.append(processCount).append(" ").append(array[0]);

		return sb.toString();
	}
}
