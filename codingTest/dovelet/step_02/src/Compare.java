/*
 * ===문제 출처===
 * compare, <http://220.89.64.243/30stair/compare/compare.php?pname=compare>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new Compare(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getCompareResult());
// 	}
// }

class Compare {
	int a, b;

	public Compare() {}

	public Compare(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public char getCompareResult() {
		char result = ' ';

		if(a == b) {
			result = '=';
		}else if(a > b) {
			result = '>';
		}else {
			result = '<';
		}

		return result; 
	}
}