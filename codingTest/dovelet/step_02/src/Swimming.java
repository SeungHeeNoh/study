/*
 * ===문제 출처===
 * swimming, <http://220.89.64.243/30stair/swimming/swimming.php?pname=swimming>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Swimming(Integer.parseInt(br.readLine())).getResult());
// 		br.close();
// 	}
// }

class Swimming {
	int input;

	public Swimming() {}

	public Swimming(int input) {
		this.input = input;
	}

	public String getResult() {
		return (input == 1 || input == 3 || input == 5) ? "enjoy" : "oops";
	}
}