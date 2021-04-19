/*
 * ===문제 출처===
 * q_r, <http://220.89.64.243/30stair/q_r/q_r.php?pname=q_r>.
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

// 		QandR run = new QandR(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		run.printQandR();
// 	}
// }

class QandR {
	int x, y;

	QandR() {}

	QandR(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printQandR() {
		System.out.printf("%d %d", x/y, x%y);
	}
}