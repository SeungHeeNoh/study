/*
 * ===문제 출처===
 * herd, <http://220.89.64.243/30stair/herd/herd.php?pname=herd>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Herd(parseInt(br.readLine().trim())).getCountHerd());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Herd {
	int n;

	public Herd() {}

	public Herd(int n) {
		this.n = n;
	}

	public int getCountHerd() {
		int count=0;

		for(int i=1; i<=n/2; i++) {
			int sum = 0,
				start = i;

			while(sum <= n) {
				sum += start++;

				if(sum == n) {
					count++;
					break;
				}
			}
		}

		return count+1;
	}
}