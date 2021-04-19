/*
 * ===문제 출처===
 * change, <http://220.89.64.243/30stair/change/change.php?pname=change>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Change run = new Change(Integer.parseInt(st.nextToken()));
// 		run.printChange();
// 	}
// }

class Change {
	final int INPUT_MONEY = 1000;
	int coin[] = {100, 50, 10};
	int price;

	Change() {}

	Change(int price) {
		this.price = price;
	}

	void printChange() {
		StringBuilder sb = new StringBuilder();
		int change = INPUT_MONEY - price;

		for(int i=0; i<coin.length; i++) {
			sb.append(change/coin[i]).append(" ");
			change %= coin[i];
		}

		System.out.println(sb);
	}
}
