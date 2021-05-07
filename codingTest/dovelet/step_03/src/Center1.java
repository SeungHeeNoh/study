/*
 * ===문제 출처===
 * center1, <http://220.89.64.243/30stair/center1/center1.php?pname=center1>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Center1(parseInt(input.readLine())).isCenterNumber());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Center1 {
	int n;

	public Center1() {}

	public Center1(int n) {
		this.n = n;
	}

	public char isCenterNumber() {
		int left = 0, right = 0;
		char result = 'X';

		for(int i=1; i<n; i++) {
			left += i;
		}

		while(right <= left) {
			if((right += ++n) == left) {
				result = 'O';
			}
		}

		return result;
	}
}