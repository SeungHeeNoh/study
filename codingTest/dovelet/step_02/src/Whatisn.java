/*
 * ===문제 출처===
 * whatisn, <http://220.89.64.243/30stair/whatisn/whatisn.php?pname=whatisn&stair=2>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Whatisn(Integer.parseInt(br.readLine())).getCount());
// 		br.close();
// 	}
// }

class Whatisn {
	int n;

	public Whatisn() {}

	public Whatisn(int n) {
		this.n = n;
	}

	public int getCount() {
		int count = 0,
			i=0;

		if(n > 5) {
			i = n - 5;
			n -= i;
		}

		while(n >= i) {
			n--;
			i++;
			count++;
		}

		return count;
	}
}