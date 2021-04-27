/*
 * ===문제 출처===
 * equation, <http://220.89.64.243/30stair/equation/equation.php?pname=equation>.
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

// 		new Equation(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult();
// 	}
// }

class Equation {
	float a, b, c, d;

	public Equation() {}

	public Equation(float a, float b, float c, float d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void getResult() {
		if(a-c == 0 && d-b == 0) {
			System.out.println("many");
		}else if(a-c == 0) {
			System.out.println("none");
		}else {
			System.out.printf("%.3f", (d-b)/(a-c));
		}
	}
}