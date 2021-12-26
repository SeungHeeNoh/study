/*
 * ===문제 출처===
 * meat, <http://220.89.64.243/30stair/meat/meat.php?pname=meat>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[] order = new int[parseInt(st.nextToken())];

// 			for(int i=0; i<order.length; i++) {
// 				order[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new Meat(order).getResult());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Meat {
	private int[] order;

	public Meat() {}

	public Meat(int[] order) {
		this.order = order;
	}

	public String getResult() {
		String result = "No equal partitioning.";
		int total = 0;

		for(int i=0; i<order.length; i++) {
			total += order[i];
		}

		for(int i=1; i<order.length; i++) {
			int samCount = 0,
				ellaCount = 0;

			for(int sam=0; sam<i; sam++) {
				samCount += order[sam];
			}

			ellaCount = total - samCount;

			if(samCount == ellaCount) {
				result = "Sam stops at position " + (i) + " and Ella stops at position " + (i+1) + ".";
				break;
			}
		}

		return result;
	}
}