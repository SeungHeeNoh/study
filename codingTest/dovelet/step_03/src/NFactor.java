/*
 * ===문제 출처===
 * nfactor, <http://220.89.64.243/30stair/nfactor/nfactor.php?pname=nfactor>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new NFactor(parseInt(br.readLine())).getFactorCount());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class NFactor {
	int n;

	public NFactor() {}

	public NFactor(int n) {
		this.n = n;
	}

	public int getFactorCount() {
		int count = 0;
		for(int i=1; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				count++;
			}
		}

		count = count*2 + (n%Math.sqrt(n) == 0 ? 1 : 0);
		return count;
	}
}