/*
 * ===문제 출처===
 * penta, <http://220.89.64.243/30stair/penta/penta.php?pname=penta>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int n = parseInt(br.readLine());
// 			int[] inputArray = new int[n];

// 			for(int i=0; i<n; i++) {
// 				inputArray[i] = parseInt(br.readLine());
// 			}

// 			System.out.println(new Penta(inputArray).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Penta {
	public static final int MAX_RANAGE = 10000;
	public static List<Integer> pentaList = new ArrayList<>();
	private int[] inputArray;

	static {
		for(int i=1; i<=MAX_RANAGE; i++) {
			pentaList.add(1 + (3 * i * i - i - 2)/2);
		}
	}

	public Penta() {}

	public Penta(int[] inputArray) {
		this.inputArray = inputArray;
	}

	public String getResult() {
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<inputArray.length; i++) {
			int target = inputArray[i];
			boolean flag = pentaList.contains(target);

			sb.append(target).append(" ").append(flag ? "Y" : "N").append("\n");
		}

		return sb.toString();
	}
}