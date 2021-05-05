/*
 * ===문제 출처===
 * yaksu, <http://220.89.64.243/30stair/yaksu/yaksu.php?pname=yaksu>.
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
// 			System.out.println(new Yaksu(parseInt(st.nextToken()), parseInt(st.nextToken())).getKthYaksu());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Yaksu {
	int n, k;

	public Yaksu() {}

	public Yaksu(int n, int k) {
		this.n = n;
		this.k = k;
	}

	public int getKthYaksu() {
		int number = 0,
			count = 0;

		for(int i=1; i<=n; i++) {
			if(n % i == 0 && ++count == k) {
				number = i;
				break;
			}
		}

		return number;
	}
}