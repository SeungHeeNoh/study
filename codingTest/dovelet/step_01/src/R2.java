/*
 * ===문제 출처===
 * r2, <http://220.89.64.243/30stair/r2/r2.php?pname=r2>.
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

// 		R2 run = new R2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getR2());
// 	}
// }

class R2 {
	int m, r1;
	public R2() {}

	public R2(int r1, int m) {
		this.r1 = r1;
		this.m = m;
	}

	public int getR2() {
		return 2*m - r1;
	}
	
}