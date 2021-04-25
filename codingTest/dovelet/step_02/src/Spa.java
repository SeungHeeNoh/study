/*
 * ===문제 출처===
 * coci_spa, <http://220.89.64.243/30stair/coci_spa/coci_spa.php?pname=coci_spa>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		System.out.println(new Spa(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult());
// 	}
// }

class Spa {
	int h, m;

	final int HOUR = 24;
	final int BUFFER_TIME = 45;

	public Spa() {}

	public Spa(int h, int m) {
		this.h = h == 0 ? HOUR : h;
		this.m = m;
	}

	public String getResult() {

		if(m < BUFFER_TIME) {
			m += 60-BUFFER_TIME;
			h--;
		}else {
			m -= BUFFER_TIME;
		}

		return h + " " + m;
	}
}