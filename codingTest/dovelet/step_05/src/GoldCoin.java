/*
 * ===문제 출처===
 * gold_coin, <http://220.89.64.243/30stair/gold_coin/gold_coin.php?pname=gold_coin>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int days = parseInt(br.readLine());
// 			System.out.println(days + " " + GoldCoin.getCountGoldCoint(days));
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class GoldCoin {
	static int[] goldCoinArray = new int[10000];

	static {
		int i=0,
			goldCoin = 1,
			count = 1;

		do {
			goldCoinArray[i] = goldCoin;

			if(++count > goldCoin) {
				count = 1;
				goldCoin++;
			}
		}while(++i < goldCoinArray.length);
	}

	public static int getCountGoldCoint(int days) {
		int count = 0;

		for(int i=0; i<days; i++) {
			count += goldCoinArray[i];
		}

		return count;
	}
}