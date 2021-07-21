/*
 * ===문제 출처===
 * mchain, <http://220.89.64.243/30stair/mchain/mchain.php?pname=mchain>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Machain(parseInt(br.readLine().trim())).getMaxLength());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Machain {
	int n;

	public Machain() {}

	public Machain(int n) {
		this.n = n;
	}

	public int getMaxLength() {
		int maxCount = 0;

		for(int i=1; i<=n; i++) {
			int count = 1,
				tempN = n,
				t=i;
			while(t >= 0) {
				int tempT = tempN-t;
				tempN = t;
				t = tempT;
				count++;
			}
			if(maxCount < count) {
				maxCount = count;
			}
		}

		return maxCount;
	}
}