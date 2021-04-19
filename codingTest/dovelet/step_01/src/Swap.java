/*
 * ===문제 출처===
 * swap, <http://220.89.64.243/30stair/swap/swap.php?pname=swap&stair=1>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Swap run = new Swap(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		run.printSwap();
// 	}
// }

class Swap {
	int x, y;

	Swap(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printSwap() {
		int temp = x;
		x = y;
		y = temp;

		System.out.println(x + " " + y);
	}
}