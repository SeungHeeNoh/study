/*
 * ===문제 출처===
 * triangular_sum, <http://220.89.64.243/30stair/triangular_sum/triangular_sum.php?pname=triangular_sum>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new TriangularSum(parseInt(input.readLine())).getW());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class TriangularSum {
	int n;
	int[] t = null;

	public TriangularSum() {}

	public TriangularSum(int n) {
		this.n = n;
		t = new int[n];
		setT();
	}

	public void setT() {
		t[0] = 3;

		for(int i=1; i<n; i++) {
			t[i] = t[i-1] + i + 2;
		}
	}

	public int getW() {
		int result = 0;

		for(int i=1; i<=n; i++) {
			result += i * t[i-1];
		}

		return result;
	}
}