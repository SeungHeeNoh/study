/*
 * ===문제 출처===
 * squ, <http://220.89.64.243/30stair/squ/squ.php?pname=squ>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			System.out.println(new Squ(parseInt(st.nextToken()), parseInt(st.nextToken())).getCountSquare());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Squ {
	long w, l;

	public Squ() {}

	public Squ(long w, long l) {
		this.w = w;
		this.l = l;
	}

	private long gcd(long a, long b) {
		if(a%b == 0) return b;
		else return gcd(b, a%b);
	}

	public long getCountSquare() {
		return w*l/(long)Math.pow(gcd(w, l), 2);
	}
}