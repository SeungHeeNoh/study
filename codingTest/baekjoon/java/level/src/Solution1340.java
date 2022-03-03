/*
 * ===문제 출처===
 * 1340 연도 진행바, <https://www.acmicpc.net/problem/1340>.
 * */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());

// 		System.out.println(new Solution1340().getResult(st));
// 	}
// }

class Solution1340 {
	public double getResult(StringTokenizer st) {
		int month = 0;
		
		switch(st.nextToken()) {
			case "January" : month = 1; break;
			case "February" : month = 2; break;
			case "March" : month = 3; break;
			case "April" : month = 4; break;
			case "May" : month = 5; break;
			case "June" : month = 6; break;
			case "July" : month = 7; break;
			case "August" : month = 8; break;
			case "September" : month = 9; break;
			case "October" : month = 10; break;
			case "November" : month = 11; break;
			case "December" : month = 12; break;
		}

		int dayOfMonth = Integer.parseInt(st.nextToken().split(",")[0]);
		int year = Integer.parseInt(st.nextToken());
		String[] inputTime = st.nextToken().split(":");
		int hour = Integer.parseInt(inputTime[0]);
		int minute = Integer.parseInt(inputTime[1]);

		LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, 0);
		LocalDate targetDate = LocalDate.of(year, 1, 1);
		LocalDateTime targetDateTime = LocalDateTime.of(targetDate, LocalTime.of(0, 0, 0));

		return (double)(Duration.between(targetDateTime, dateTime).getSeconds())  / (targetDate.lengthOfYear()*24*60*60)  * 100.0;
	}
}