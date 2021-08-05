/*
 * ===문제 출처===
 * cont_prime, <http://220.89.64.243/30stair/cont_prime/cont_prime.php?pname=cont_prime>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			System.out.println(new ContPrime(parseInt(st.nextToken()), parseInt(st.nextToken())).isKthContiguousPrime());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ContPrime {
	int n, k;

	public ContPrime() {}

	public ContPrime(int n, int k) {
		this.n = n;
		this.k = k;
	}

	public String isKthContiguousPrime() {
		String result = "no";
		List<Integer> prime = new ArrayList<>(n);
		boolean[] primeArray = new boolean[n+1];

		for(int i=2; i<=n; i++) {
			if(primeArray[i]) continue;

			prime.add(i);

			for(int j=i*2; j<=n; j+=i) {
				primeArray[j] = true;
			}
		}

		if(prime.size() >= k) {
			outer : for(int i=0; i<=prime.size()-k; i++) {
				int sum = 0;

				for(int j=0; j<k; j++) {
					sum += prime.get(i+j);
				}

				if(sum >= n) {
					if(sum == n) result = "yes";
					break outer;
				}
			}
		}

		return result;
	}
}