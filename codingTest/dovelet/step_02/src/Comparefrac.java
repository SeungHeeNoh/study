/*
 * ===문제 출처===
 * comparefrac, <http://220.89.64.243/30stair/comparefrac/comparefrac.php?pname=comparefrac>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new Comparefrac(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken()),  Integer.parseInt(st.nextToken())).getCompareResult());
// 	}
// }

class Comparefrac {
	int a, b, c, d;

	public Comparefrac() {}

	public Comparefrac(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getCompareResult() {
		int result = 0;

		if(a*d == c*b) {
			result = 0;
		}else if(a*d > c*b) {
			result = 1;
		}else {
			result = -1;
		}

		return result; 
	}
}