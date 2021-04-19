/*
 * ===문제 출처===
 * koi_watch, <http://220.89.64.243/30stair/koi_watch/koi_watch.php?pname=koi_watch>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());

// 		KoiWatch run = new KoiWatch(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(br.readLine()));
// 		br.close();
// 		System.out.println(run.getEndTime());
// 	}
// }

class KoiWatch {
	int hour, minute, second;
	int timer;

	final int H = 24;
	final int M = 60;
	final int S = 60;

	KoiWatch() {}

	KoiWatch(int hour, int minute, int second, int timer) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.timer = timer;
	}

	String getEndTime() {
		int total = hour * M * S + minute * S + second + timer;
		hour = total / (M * S);
		minute = total / M % M;
		second = total % S;

		return hour%H + " " + minute + " " + second;
	}
}