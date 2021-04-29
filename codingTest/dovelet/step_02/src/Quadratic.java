/*
 * ===문제 출처===
 * quadratic, <http://220.89.64.243/30stair/quadratic/quadratic.php?pname=quadratic>.
 * */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Float.parseFloat;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		new Quadratic(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult();
// 	}
// }

class Quadratic {
	float a, b, c;

	public Quadratic() {}

	public Quadratic(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void getResult() {
		double denominator = Math.sqrt(b*b-4*a*c);

		if(Double.isNaN(denominator)) {
			System.out.println(0);
		}else if(denominator == b) {
			System.out.println(1);
			System.out.printf("%.3f%n", 0f);
		}else if(denominator == 0) {
			System.out.println(1);
			System.out.printf("%.3f%n", -b / (2*a));
		}else {
			System.out.println(2);
			System.out.printf("%.3f %.3f%n", (-b-denominator) / (2 * a), (-b+denominator) / (2 * a));
		}
	}
}