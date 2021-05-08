/*
 * ===문제 출처===
 * gcd_lcm, <http://220.89.64.243/30stair/gcd_lcm/gcd_lcm.php?pname=gcd_lcm>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new GcdLcm(parseInt(st.nextToken()), parseInt(st.nextToken())).getGcdLcm());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class GcdLcm {
	int x, y;

	public GcdLcm() {}

	public GcdLcm(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getGcdLcm() {
		int min = Math.min(x, y),
			gcd = 0,
			lcm = 0;

		for(int i=1; i<=min; i++) {
			if(x%i == 0 && y%i == 0) {
				gcd = i;
			}
		}

		lcm = x*y/gcd;
		return gcd + " " + lcm;
	}
}