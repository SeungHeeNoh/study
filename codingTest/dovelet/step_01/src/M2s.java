/*
 * ===문제 출처===
 * m2s, <http://220.89.64.243/30stair/m2s/m2s.php?pname=m2s>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		M2s run = new M2s(Integer.parseInt(br.readLine()));
// 		br.close();

// 		run.printSecond();
// 	}
// }

class M2s {
	int minute;
	
	final int SEC = 60;

	M2s(int minute) {
		this.minute = minute;
	}

	void printSecond() {
		System.out.printf("%d minutes is %d seconds.%n", minute, SEC*minute);
	}
}