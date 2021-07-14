/*
 * ===문제 출처===
 * luckynum, <http://220.89.64.243/30stair/luckynum/luckynum.php?pname=luckynum>.
 * */
import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new LuckyNum(parseInt(br.readLine().trim())).getLuckyNum());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class LuckyNum {
	private int k;

	public LuckyNum() {}

	public LuckyNum(int k) {
		this.k = k;
	}

	public String getLuckyNum() {
		int digit = 0;
		char[] binaryArray = toBinaryString(k).toCharArray();
		StringBuilder luckyNum = new StringBuilder();

		for(int i=0; i<binaryArray.length; i++) {
			if(binaryArray[i] == '1') digit++;
		}

		if(digit == binaryArray.length) {
			for(int i=0; i<binaryArray.length; i++) {
				luckyNum.append("4");
			}
		} else {
			int breakPoint = 0,
				difference = 0,
				count = binaryArray.length-2,
				lastNum = 0;
			StringBuilder sb = new StringBuilder();

			for(int i=0; i<binaryArray.length-1; i++) {
				sb.append("1");
			}

			breakPoint = parseInt(sb.toString(), 2);
			difference = k - breakPoint;

			if(difference % 2 == 0) {
				lastNum = 4;
			} else {
				lastNum = 7;
				difference -= 1;
			}

			for(int i=0; i <sb.length()-1; i++) {
				int diff = 0;

				if((diff = difference - (int)(Math.pow(2, count))) >= 0) {
					difference = diff;
					luckyNum.append("7");
				} else {
					luckyNum.append("4");
				}
				count--;
			}
			luckyNum.append(lastNum);
		}

		return luckyNum.toString();
	}
}