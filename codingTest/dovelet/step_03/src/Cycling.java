/*
 * ===문제 출처===
 * cycling, <http://220.89.64.243/30stair/cycling/cycling.php?pname=cycling>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Cycling(parseInt(input.readLine()), input.readLine()).getMaxDistance());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Cycling {
	int length;
	String input;

	public Cycling() {}

	public Cycling(int length, String input) {
		this.length = length;
		this.input = input;
	}

	public int getMaxDistance() {
		int distance = 0,
			low = Integer.MAX_VALUE,
			high = 0,
			prevHeight = 0;
		StringTokenizer st = new StringTokenizer(input);

		while(st.hasMoreTokens()) {
			int height = parseInt(st.nextToken());

			if(low > height || prevHeight == height) {
				low = height;
			}else if(prevHeight < height) {
				high = height;
				distance = distance > high - low ? distance : high - low;
			}else {
				low = height;
			}
			prevHeight = height;
		}

		return distance;
	}
}