/*
 * ===문제 출처===
 * big_clock, <http://220.89.64.243/30stair/big_clock/big_clock.php?pname=big_clock>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine(), ":");

// 			System.out.println(new BigClock(parseInt(st.nextToken()), parseInt(st.nextToken())).getRingCount());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class BigClock {
	final static int CLOCK_STANDARD = 12;
	int hour, minute;

	public BigClock() {}

	public BigClock(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getRingCount() {
		int result = 0;

		if(minute == 0) {
			if(hour <= CLOCK_STANDARD) {
				result = hour + CLOCK_STANDARD;
			} else {
				result = hour - CLOCK_STANDARD;
			}
		}

		return result;
	}
}