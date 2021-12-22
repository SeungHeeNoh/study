/*
 * ===문제 출처===
 * dfreq, <http://220.89.64.243/30stair/dfreq/dfreq.php?pname=dfreq>.
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
// 			System.out.println(new DFreq(parseInt(st.nextToken()), parseInt(st.nextToken())).getFrequency());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class DFreq {
	int n;
	int target;

	public DFreq() {}

	public DFreq(int n, int target) {
		this.n = n;
		this.target = target;
	}

	public int getFrequency() {
		int total = 0,
			digit = 1;
		int s, m, e;

		while(digit < n) {
			s = n / (digit*10);
			m = n / digit%10;
			e = n % digit;

			if(m<target) {
				total += s * digit;
			} else if(m>target) {
				total += (s+1) * digit;
			} else {
				total += s * digit + e + 1;
			}

			if(target==0) {
				total -= digit;
			}

			digit *= 10;
		}

		return total;
	}
}