/*
 * ===문제 출처===
 * ctu_stock, <http://220.89.64.243/30stair/ctu_stock/ctu_stock.php?pname=ctu_stock>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[] stocks = new int[parseInt(st.nextToken())];
// 			int money = parseInt(st.nextToken());
// 			st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<stocks.length; i++) {
// 				stocks[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new CtuStock(money, stocks).getMaxProfit());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class CtuStock {
	int money;
	int[] stocks;

	public CtuStock() {}

	public CtuStock(int money, int[] stocks) {
		this.money = money;
		this.stocks = stocks;
	}

	public int getMaxProfit() {
		int result = Integer.MIN_VALUE,
			minimum = Integer.MAX_VALUE,
			min = minimum,
			max = Integer.MIN_VALUE;

		for(int i=0; i<stocks.length; i++) {
			if(stocks[i] < min) {
				min = stocks[i];
				max = stocks[i];
			} else if(stocks[i] > max) {
				max = stocks[i];

				if(minimum > min) minimum = min;
				result = result < money/minimum*max - money/minimum*minimum ? money/minimum*max - money/minimum*minimum : result;
			}
		}

		return result < 0 ? 0 : result;
	}
}