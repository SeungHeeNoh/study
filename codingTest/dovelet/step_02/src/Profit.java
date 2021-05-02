/*
 * ===문제 출처===
 * profit, <http://220.89.64.243/30stair/profit/profit.php?pname=profit>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Float.parseFloat;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		new Profit(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult();
// 	}
// }

class Profit {
	float a, b, c;

	public Profit() {}

	public Profit(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void getResult() {
		float p = (a + a * (b / 100)) * ((100 - c) / 100) - a;
		if(p < 0) {
			System.out.println("loss");
		}else {
			System.out.printf("%.0f%n", p);
		}
	}
}