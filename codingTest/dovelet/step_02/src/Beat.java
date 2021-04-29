/*
 * ===문제 출처===
 * beat, <http://220.89.64.243/30stair/beat/beat.php?pname=beat>.
 * */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new Beat(parseInt(st.nextToken()), parseInt(st.nextToken())).getResult());
// 	}
// }

class Beat {
	int s, d;

	public Beat() {}

	public Beat(int s, int d) {
		this.s = s;
		this.d = d;
	}

	public String getResult() {
		int x = (s+d) / 2,
			y = s-x; 

		return ((s+d)%2 != 0 || x < 0 || y < 0) ? "impossible" : (x + " " + y);
	}
}