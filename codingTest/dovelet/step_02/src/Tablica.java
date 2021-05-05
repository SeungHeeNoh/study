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

		for(int i=0; i<4; i++) {
			double temp;

			if(max < (a/c + b/d)) {
				max = a/c + b/d;
				n = i;
			}

			temp = a;
			a = c;
			c = d;
			d = b;
			b = temp;
		}
		return n;
	}
}