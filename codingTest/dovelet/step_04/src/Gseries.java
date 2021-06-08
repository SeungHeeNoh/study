/*
 * ===문제 출처===
 * gseries, <http://220.89.64.243/30stair/gseries/gseries.php?pname=gseries>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Gseries(parseInt(br.readLine().trim())).getSum());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Gseries {
	int n;
	int[] memoArr;

	public Gseries() {}

	public Gseries(int n) {
		this.n = n;
		memoArr = new int[n];
		memoization();
	}

	public void memoization() {
		for(int i=1; i<=n; i++) {
			if(i == 1) {
				memoArr[i-1] = i;
			}else {
				memoArr[i-1] = memoArr[i-2]+i;
			}
		}
	}

	public int getSum() {
		int sum = 0;

		for(int i=0; i<n; i++) {
			sum += memoArr[i];
		}

		return sum;
	}
}