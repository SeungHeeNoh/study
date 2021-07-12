/*
 * ===문제 출처===
 * the_king, <http://220.89.64.243/30stair/the_king/the_king.php?pname=the_king>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int sonCount = parseInt(br.readLine().trim()),
// 				powNumber = parseInt(br.readLine().trim());
// 			int[] sons = new int[sonCount];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			int index = 0;
// 			while(st.hasMoreTokens()) {
// 				sons[index++] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new TheKing(powNumber, sons).getPowerSum());
// 		}catch(IOException e) {
// 			e.printStackTrace();;
// 		}
// 	}
// }

class TheKing {
	private int powNumber;
	private int[] sons;

	public TheKing() {}

	public TheKing(int powNumber, int[] sons) {
		this.powNumber = powNumber;
		this.sons = sons;
	}

	public int getPowerSum() {
		int sum = 0;

		for(int i : sons) {
			int power = (int)(Math.pow(i, powNumber));
			sum += power >= 0 ? power : 0;
		}

		return sum;
	}
}