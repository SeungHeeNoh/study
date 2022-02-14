/*
 * ===문제 출처===
 * 2525 오븐 시계, <https://www.acmicpc.net/problem/2525>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int hour = Integer.parseInt(st.nextToken()),
// 			minute = Integer.parseInt(st.nextToken());
// 		int needTime = Integer.parseInt(br.readLine());

// 		System.out.println(new Solution2525().getResult(hour, minute, needTime));
// 	}
// }

class Solution2525 {
	public String getResult(int hour, int minute, int needTime) {

		int resultHour = (hour + (minute+needTime)/60)%24;
		int resultMinute = (minute + needTime)%60;

		return resultHour + " " + resultMinute;
	}
}