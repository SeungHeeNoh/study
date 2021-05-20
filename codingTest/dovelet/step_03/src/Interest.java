/*
 * ===문제 출처===
 * interest, <http://220.89.64.243/30stair/interest/interest.php?pname=interest>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());

// 			System.out.println(new Interest(parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).getBanlance());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Interest {
	double r;
	int m, y;

	public Interest() {}

	public Interest(double r, int m, int y) {
		this.r = 1 + r/100;
		this.m = m;
		this.y = y;
	}

	public int getBanlance() {
		return (int)(m * Math.pow(r, y));
	}
}