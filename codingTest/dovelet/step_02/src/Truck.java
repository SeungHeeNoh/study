/*
 * ===문제 출처===
 * truck, <http://220.89.64.243/30stair/truck/truck.php?pname=truck>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Truck(br.readLine()).getResult());
// 		br.close();
// 	}
// }

class Truck {
	String input;
	final int STANDARD = 168;

	public Truck() {}

	public Truck(String input) {
		this.input = input;
	}

	public String getResult() {
		String result = "NO CRASH";

		StringTokenizer st = new StringTokenizer(input);

		for(int i=0; i<st.countTokens(); i++) {
			int height = Integer.parseInt(st.nextToken());

			if(height <= STANDARD) {
				result = "CRASH " + height;
				break;
			}
		}

		return result;
	}
}