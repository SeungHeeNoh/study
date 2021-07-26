/*
 * ===문제 출처===
 * beer, <http://220.89.64.243/30stair/beer/beer.php?pname=beer>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Beer(Integer.parseInt(br.readLine().trim())).getProperSize());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Beer {
	int n;
	Set divisors = new HashSet();

	public Beer() {}

	public Beer(int n) {
		this.n = n;
		updateDivisors();
	}

	public void updateDivisors() {
		for(int i=1; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				divisors.add(i);
				divisors.add(n/i);
			}
		}
	}

	public String getProperSize() {
		Iterator iterator = divisors.iterator();
		long[] arr = new long[divisors.size()];
		StringBuilder sb = new StringBuilder();
		long min = Long.MAX_VALUE;

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)iterator.next();
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					if(arr[i]*arr[j]*arr[k] == n && arr[i]*arr[j]*2 + arr[i]*arr[k]*2 + arr[j]*arr[k]*2 < min) {
						sb = new StringBuilder();
						sb.append(arr[i]).append(" ").append(arr[j]).append(" ").append(arr[k]);
						min = arr[i]*arr[j]*2 + arr[i]*arr[k]*2 + arr[j]*arr[k]*2;
					}
				}
			}
		}

		return sb.toString();
	}
}