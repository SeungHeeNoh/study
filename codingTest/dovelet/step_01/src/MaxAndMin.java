/*
 * ===문제 출처===
 * maxandmin, <http://220.89.64.243/30stair/maxandmin/maxandmin.php?pname=maxandmin>.
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

// 		MaxAndMin run = new MaxAndMin(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getresult());
// 	}
// }

class MaxAndMin {
	int x, y;

	public MaxAndMin() {}

	public MaxAndMin(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getresult() {
		return x;
	}
}