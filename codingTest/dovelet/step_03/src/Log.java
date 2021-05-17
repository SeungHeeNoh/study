/*
 * ===문제 출처===
 * log, <http://220.89.64.243/30stair/log/log.php?pname=log>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Log(parseInt(input.readLine())).getBottomAndTop());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Log {
	int n;

	public Log() {}

	public Log(int n) {
		this.n = n;
	}

	public String getBottomAndTop() {
		int bottom = 0,
			top = n,
			tempN = n,
			i = 1;

		while(tempN > i) {
			tempN -= i++;
		}

		bottom = i;
		while(top-i > 0) {
			top -= i--;
		}

		return bottom + " " + top;
	}
}