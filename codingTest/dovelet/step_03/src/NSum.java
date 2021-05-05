/*
 * ===문제 출처===
 * Nsum, <http://220.89.64.243/30stair/Nsum/Nsum.php?pname=Nsum>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new NSum(parseInt(br.readLine())).getN());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class NSum {
	int m;

	public NSum() {}

	public NSum(int m) {
		this.m = m;
	}

	public int getN() {
		int n = 1;

		for(; n<100; n++) {
			if(n*(n+1) == 2*m) {
				break;
			}
		}

		return n;
	}
}