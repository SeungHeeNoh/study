/*
 * ===문제 출처===
 * when_is_1231, <http://220.89.64.243/30stair/when_is_1231/when_is_1231.php?pname=when_is_1231>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			int month, week, sum;
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			month = parseInt(st.nextToken());
// 			week = parseInt(st.nextToken());
			
// 			st = new StringTokenizer(input.readLine());
// 			int[] days = new int[week];
// 			for(int i=0; i<days.length; i++) {
// 				days[i] = parseInt(st.nextToken());
// 			}

// 			sum = parseInt(input.readLine().trim());

// 			System.out.println(new WhenIS(month, days, sum).getDay());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class WhenIS {
	int month, sum;
	int[] days;
	final static int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	final static int[] dayArr = {0, 1, 2, 3, 4, 5, 6, 7};

	public WhenIS() {}

	public WhenIS(int month, int[] days, int sum) {
		this.month = month;
		this.days = days;
		this.sum = sum;
	}

	public int getDay() {
		int day = -1,
			rest = 0;

		for(int i=1; i<days.length; i++) {
			sum -= days[i] - days[0];
		}

		for(int i=month-1; i<monthArr.length; i++) {
			rest += monthArr[i];
		}

		rest -= sum / days.length - dayArr[days[0]];
		day = rest % 7;

		return day;
	}
}