/*
 * ===문제 출처===
 * up_down, <http://220.89.64.243/30stair/up_down/up_down.php?pname=up_down>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		System.out.println(new UpDown(parseInt(br.readLine()), parseInt(br.readLine()), parseInt(br.readLine()), parseInt(br.readLine()), parseInt(br.readLine())).getResult());
// 	}
// }

class UpDown {
	int a, b, c, d, s;

	public UpDown() {}

	public UpDown(int a, int b, int c, int d, int s) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.s = s;
	}

	public String getResult() {
		int rest = 0;
		int nikky = s/(a+b) * (a-b) + ((rest = s%(a+b)) > a ? a-rest : rest),
			byron = s/(c+d) * (c-d) + ((rest = s%(c+d)) > c ? c-rest : rest);

		return nikky > byron ? "Nikky" : nikky < byron ? "Byron" : "Tied";
	}
}