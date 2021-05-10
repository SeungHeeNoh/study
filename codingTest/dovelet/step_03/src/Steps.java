/*
 * ===문제 출처===
 * steps, <http://220.89.64.243/30stair/steps/steps.php?pname=steps>.
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
// 			System.out.println(new Steps(parseInt(st.nextToken()), parseInt(st.nextToken())).getPointNumber());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Steps {
	int x, y;

	public Steps() {}

	public Steps(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getPointNumber() {
		String result = "No Number";

		if(x-y == 2) {
			if(x%2 == 0) {
				result = String.valueOf(x+y);
			}else {
				result = String.valueOf(x+y-1);
			}
		}else if(x == y) {
			if(x%2 == 0) {
				result = String.valueOf(x*2);
			}else {
				result = String.valueOf(x*2-1);
			}
		}

		return result;
	}
}