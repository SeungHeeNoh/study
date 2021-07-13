/*
 * ===문제 출처===
 * lock, <http://220.89.64.243/30stair/lock/lock.php?pname=lock>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			String line = "";

// 			while((line = br.readLine()) != null) {
// 				StringTokenizer st = new StringTokenizer(line);
// 				int initPosition = parseInt(st.nextToken());
// 				int first = parseInt(st.nextToken());
// 				int second = parseInt(st.nextToken());
// 				int third = parseInt(st.nextToken());

// 				if(initPosition == 0 && first == 0 && second == 0 && third == 0) break;
// 				System.out.println(new Lock(initPosition, first, second, third).getTotalDegree());
// 			}
// 		} catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Lock {
	private static final int TOTAL_NUMBER = 40;
	private int initPosition;
	private int first;
	private int second;
	private int third;

	public Lock() {}

	public Lock(int initPosition, int first, int second, int third) {
		this.initPosition = initPosition;
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public int getMove(int x, int y) {
		return x < y ? (TOTAL_NUMBER-y+x) : x-y;
	}

	public int getTotalDegree() {
		int totalDegree = 0;
		if(initPosition == first && first == second && second == third) {
			totalDegree = 1080;
		}else {
			totalDegree = 1080 + getMove(initPosition, first) * 9 + getMove(second, first) * 9 + getMove(second, third) * 9;
		}

		return totalDegree;
	}
}