/*
 * ===문제 출처===
 * rpoly, <http://220.89.64.243/30stair/rpoly/rpoly.php?pname=rpoly>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Rpoly run = new Rpoly(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
// 		/*
// 		* printf를 통해 float와 double을 표현할 때는 동일하게 %f로 표현한다.
// 		* 관련 URL : https://stackoverflow.com/questions/3853185/double-formatting-question-for-printf-in-java
// 		* */
// 		System.out.printf("%.3f", run.getPolygonArea());
// 	}
// }

class Rpoly {
	Double r, n;

	public Rpoly() {}

	public Rpoly(Double r, Double n) {
		this.r = r;
		this.n = n;
	}

	public Double getPolygonArea() {
		return (0.5*r*r*Math.sin(Math.toRadians(360/n)))*n;
	}
}