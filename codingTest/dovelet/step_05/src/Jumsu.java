/*
 * ===문제 출처===
 * jumsu, <http://220.89.64.243/30stair/jumsu/jumsu.php?pname=jumsu>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] mark = new int[parseInt(br.readLine().trim())];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<mark.length; i++) {
// 				mark[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new Jumsu(mark).getScore());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Jumsu {
	int[] mark;

	public Jumsu() {}

	public Jumsu(int[] mark) {
		this.mark = mark;
	}

	public int getScore() {
		int result = 0,
			score = 0;

		for(int i=0; i<mark.length; i++) {
			if(mark[i] == 1) {
				result += ++score;
			} else {
				score = 0;
			}
		}

		return result;
	}
}