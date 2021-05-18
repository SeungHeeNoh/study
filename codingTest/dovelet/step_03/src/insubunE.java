/*
 * ===문제 출처===
 * insubunE, <http://220.89.64.243/30stair/insubunE/insubunE.php?pname=insubunE>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new insubunE(parseInt(st.nextToken()), parseInt(st.nextToken())).getFactorization());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class insubunE {
	int a, b;

	public insubunE() {}

	public insubunE(int a, int b) {
		this.a = -a;
		this.b = b;
	}

	public String getFactorization() {
		String result = "impossible";

		for(int i=1; i<=b/2+1; i++) {
			if(b%i == 0) {
				int p = i,
					q = b/i;
				if(a < 0 && b > 0) {
					if(-p-q == a) {
						result = "(x" + -p + ")(x" + -q + ")";
						break;
					}
				}else if(b > 0 && a > 0) {
					if(p+q == a) {
						result = "(x+" + p + ")(x+" + q + ")";
						break;
					}
				}else {
					if(-q+p == a) {
						result = "(x+" + p + ")(x" + -q + ")";
						break;
					}
				}
			}
		}

		return result;
	}
}