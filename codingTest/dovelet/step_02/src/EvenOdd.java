/*
 * ===문제 출처===
 * even_odd, <http://220.89.64.243/30stair/even_odd/even_odd.php?pname=even_odd>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		new EvenOdd(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult();
// 	}
// }

// ================== 1.07 sec ==================
class EvenOdd {
	int x, y;

	public EvenOdd() {}

	public EvenOdd(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getResult() {
		int oddCount = 0;
		String addResult = "", mulResult = "";

		if(x % 2 != 0) {
			addResult += "odd+";
			mulResult += "odd*";
			oddCount++;
		}else {
			addResult += "even+";
			mulResult += "even*";
		}

		if(y % 2 != 0) {
			addResult += "odd=";
			mulResult += "odd=";
			oddCount++;
		}else {
			addResult += "even=";
			mulResult += "even=";
		}

		return addResult + (oddCount == 1 ? "odd" : "even") + "\n" + mulResult + (oddCount == 2 ? "odd" : "even");
	}
}

// ================== 1.63 sec ==================
// class EvenOdd {
// 	int x, y;

// 	public EvenOdd() {}

// 	public EvenOdd(int x, int y) {
// 		this.x = x;
// 		this.y = y;
// 	}

// 	public void getResult() {
// 		int oddCount = 0;

// 		if(x % 2 != 0) {
// 			oddCount++;
// 		}

// 		if(y % 2 != 0) {
// 			oddCount++;
// 		}

// 		System.out.printf("%s+%s=%s%n", x % 2 == 0 ? "even" : "odd", y % 2 == 0 ? "even" : "odd", (oddCount == 1 ? "odd" : "even"));
// 		System.out.printf("%s*%s=%s%n", x % 2 == 0 ? "even" : "odd", y % 2 == 0 ? "even" : "odd", (oddCount == 2 ? "odd" : "even"));
// 	}
// }