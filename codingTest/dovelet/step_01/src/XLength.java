/*
 * ===문제 출처===
 * x_length, <http://220.89.64.243/30stair/x_length/x_length.php?pname=x_length>.
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

// 		XLength run = new XLength(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%.3f", run.getXLength());
// 	}
// }

class XLength {
	int a, b;

	final double PI = 3.14159;

	public XLength() {}

	public XLength(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public double getXLength() {
		return (Math.sqrt(2)+PI) * (a+b);
	}
}