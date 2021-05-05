/*
 * ===문제 출처===
 * coci_tablica, <http://220.89.64.243/30stair/coci_tablica/coci_tablica.php?pname=coci_tablica>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Double.parseDouble;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st1 = new StringTokenizer(br.readLine());
// 			StringTokenizer st2 = new StringTokenizer(br.readLine());

// 			System.out.println(new Tablica(parseDouble(st1.nextToken()), parseDouble(st1.nextToken()), parseDouble(st2.nextToken()), parseDouble(st2.nextToken())).getMinRotation());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Tablica {
	double a, b, c, d;

	public Tablica() {}

	public Tablica(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getMinRotation() {
		int n = 0;
		double max = 0d;
		double result[] = new double[4];

		result[0] = a/c + b/d;
		result[1] = c/d + a/b;
		result[2] = d/b + c/a;
		result[3] = b/a + d/c;

		for(int i=0; i<result.length; i++) {
			if(max < result[i]) {
				max = result[i];
				n = i;
			}
		}
		return n;
	}
}