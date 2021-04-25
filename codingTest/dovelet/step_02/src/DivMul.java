/*
 * ===문제 출처===
 * div_mul, <http://220.89.64.243/30stair/div_mul/div_mul.php?pname=div_mul>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new DivMul(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult());
// 		br.close();
// 	}
}

class DivMul {
	int m, n;

	public DivMul() {}

	public DivMul(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public String getResult() {
		String result = "";

		if(m == 0) {
			result = m + " !| " + n;
		} else if(n == 0) {
			result = m + " | " + n;
		} else if(n%m == 0) {
			result = m + " | " + n;
		}else {
			result = m + " !| " + n;
		}

		return result;
	}
}