/*
 * ===문제 출처===
 * slant, <http://220.89.64.243/30stair/slant/slant.php?pname=slant>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		Slant.run();
// 	}
// }

class Slant {
	public static void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()),
			y = Integer.parseInt(st.nextToken()),
			originX = x,
			originY = y;

		st = new StringTokenizer(br.readLine());
		x -= Integer.parseInt(st.nextToken());
		y -= Integer.parseInt(st.nextToken());
		br.close();

		int mul = Math.abs(y) / Math.abs(x);
		System.out.println(mul + " " + (originY-originX*mul));
	}
}