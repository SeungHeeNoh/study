/*
 * ===문제 출처===
 * sec, <http://220.89.64.243/30stair/sec/sec.php?pname=sec>.
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

// 		Sec run = new Sec(Integer.parseInt(st.nextToken()));
// 		run.changeSectoTime();
// 		run.printResult();
// 	}
// }

class Sec {
	int day, hour, minute, second;
	int temp;

	final int HOUR = 24;
	final int MINUTE = 60;
	final int SECOND = 60;

	Sec() {}

	Sec(int second) {
		this.temp = second;
	}

	void changeSectoTime() {
		day = temp / (SECOND * MINUTE * HOUR);
		hour = temp / (MINUTE * SECOND) % HOUR;
		minute = temp / MINUTE % MINUTE;
		second = temp % SECOND;
	}

	void printResult() {
		System.out.printf("%d %d %d %d", day, hour, minute, second);
	}
}