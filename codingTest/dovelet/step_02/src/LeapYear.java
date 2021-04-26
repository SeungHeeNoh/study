/*
 * ===문제 출처===
 * leap_year, <http://220.89.64.243/30stair/leap_year/leap_year.php?pname=leap_year>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new LeapYear(Integer.parseInt(br.readLine())).getResult());
// 		br.close();
// 	}
// }

class LeapYear {
	int x;

	public LeapYear() {}

	public LeapYear(int x) {
		this.x = x;
	}

	public String getResult() {
		return (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0) ? "YES" : "NO";
	}
}