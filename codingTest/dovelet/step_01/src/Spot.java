/*
 * ===문제 출처===
 * spot, <http://220.89.64.243/30stair/spot/spot.php?pname=spot>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		double d = Double.parseDouble(br.readLine()), p = Double.parseDouble(br.readLine());

// 		Spot run = new Spot(d, p);
// 		br.close();
// 		/*
// 		* java.util.Formatter API에 의해 노출되는 소숫점 바로 아래 자리에서 반올림이 된다.
// 		* 관련 URL : https://stackoverflow.com/questions/26856148/java-system-out-printf-rounding-floats
// 		* */
// 		System.out.printf("%.3f", run.getNewD());
// 	}
// }

class Spot {
	double d, p;

	public Spot() {}

	public Spot(double d, double p) {
		this.d = d;
		this.p = p;
	}

	public double getNewD() {
		return -(d/(100/p));
	}
}