/*
 * ===문제 출처===
 * ncpc_soda, <http://220.89.64.243/30stair/ncpc_soda/ncpc_soda.php?pname=ncpc_soda>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new Soda(parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).getMaxSoda());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Soda {
	int e, f, c;

	public Soda() {}

	public Soda(int e, int f, int c) {
		this.e = e;
		this.f = f;
		this.c = c;
	}

	public int getMaxSoda() {
		int count = 0,
			totalBottle = e + f;

		while(totalBottle >= c) {
			count += totalBottle / c;
			totalBottle = totalBottle % c + (totalBottle / c);
		}

		return count;
	}
}