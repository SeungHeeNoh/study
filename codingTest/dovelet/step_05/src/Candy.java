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
			candyCount = 0,
			count = 0;
		int[] resultArray = new int[array.length];
		boolean flag = false;

		for(int i=0; i<array.length; i++) {
			if(i == 0) {
				candyCount = array[i];
				count++;
			} else {
				if(candyCount != array[i]) {
					break;
				} else {
					count++;
				}
			}
		}

		if(count == array.length) {
			flag = true;
		}

		while(!flag) {
			processCount++;
			count = 0;

			for(int i=0; i<array.length; i++) {
				int now = array[i]/2,
					prev = array[i == 0 ? array.length-1 : i-1]/2;

				resultArray[i] = now+prev + (((now+prev)%2 == 0) ? 0 : 1);

				if(i == 0) {
					candyCount = resultArray[i];
					count++;
				} else {
					if(candyCount == resultArray[i]) {
						count++;
					}
				}
			}

			if(count == array.length) {
				flag = true;
			}

			array = Arrays.copyOf(resultArray, resultArray.length);
		}

		sb.append(processCount).append(" ").append(candyCount);

		return sb.toString();
	}
}
