/*
 * ===문제 출처===
 * can, <http://220.89.64.243/30stair/can/can.php?pname=can>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new Can(parseInt(st.nextToken()), parseInt(st.nextToken())).getResult());
// 	}
// }

class Can {
	int b, w;

	public Can() {}

	public Can(int b, int w) {
		this.b = b;
		this.w = w;
	}

	public String getResult() {
		return w % 2 == 0 ? "black" : "white";
	}
}