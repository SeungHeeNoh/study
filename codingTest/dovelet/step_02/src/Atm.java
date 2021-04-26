/*
 * ===문제 출처===
 * ATM, <http://220.89.64.243/30stair/ATM/ATM.php?pname=ATM>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.printf("%.2f%n", new Atm(Integer.parseInt(st.nextToken()), Float.parseFloat(st.nextToken())).getRemain());
// 		br.close();
// 	}
// }

class Atm {
	int x;
	float total;

	final int MUL = 5;
	final Float FEE = 0.5f;

	public Atm() {}

	public Atm(int x, float total) {
		this.x = x;
		this.total = total;
	}

	public float getRemain() {
		float result = 0f;

		if(x % MUL != 0 || total < x+FEE) {
			result = total;
		}else {
			result = total - x - FEE;
		}

		return result;
	}
}