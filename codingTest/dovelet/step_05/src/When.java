/*
 * ===문제 출처===
 * when, <http://220.89.64.243/30stair/when/when.php?pname=when>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int people = parseInt(st.nextToken());
// 			int minCount = parseInt(st.nextToken());
// 			int[][] possibleDays = new int[people][];

// 			for(int i=0; i<possibleDays.length; i++) {
// 				st = new StringTokenizer(br.readLine());
// 				possibleDays[i] = new int[parseInt(st.nextToken())];

// 				for(int j=0; j<possibleDays[i].length; j++) {
// 					possibleDays[i][j] = parseInt(st.nextToken());
// 				}
// 			}

// 			System.out.println(new When(minCount, possibleDays).getPossibleDay());

// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class When {
	int minCount;
	int[][] possibleDays;
	int[] calendar = new int[101];

	public When() {}

	public When(int minCount, int[][] possibleDays) {
		this.minCount = minCount;
		this.possibleDays = possibleDays;
	}

	public int getPossibleDay() {
		int possibleDay = 0;

		for(int i=0; i<possibleDays.length; i++) {
			for(int j=0; j<possibleDays[i].length; j++) {
				calendar[possibleDays[i][j]-1]++;
			}
		}

		outer : for(int i=possibleDays.length; i>=minCount; i--) {
			for(int j=0; j<calendar.length; j++) {
				if(calendar[j] == i) {
					possibleDay = j+1;
					break outer;
				}
			}
		}

		return possibleDay;
	}
}