/*
 * ===문제 출처===
 * lagrange, <http://220.89.64.243/30stair/lagrange/lagrange.php?pname=lagrange>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Lagrange(parseInt(br.readLine().trim())).getCountSquare());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Lagrange {
	int n;

	public Lagrange() {}

	public Lagrange(int n) {
		this.n = n;
	}

	public int getCountSquare() {
		int count = 0;
		int end = (int)Math.sqrt(n);

		for(int i=0; i<=end; i++) {
			for(int j=i; j<=end; j++) {
				for(int k=j; k<=end; k++) {
					int sum = i*i+j*j+k*k;
					double lastNumber = (Math.sqrt(n-sum));

					if((n-sum)%lastNumber == 0 && (i<=j) && (j<=k) && (k <= lastNumber)) {
						count++;
					}
				}
			}
		}

		return count;
	}	
}