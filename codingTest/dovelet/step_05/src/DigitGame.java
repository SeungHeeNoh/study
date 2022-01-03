/*
 * ===문제 출처===
 * digit_game, <http://220.89.64.243/30stair/digit_game/digit_game.php?pname=digit_game>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int n = parseInt(br.readLine());
// 			int[][] gameSet = new int[n][5];

// 			for(int i=0; i<n; i++) {
// 				gameSet[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
// 			}

// 			System.out.println(new DigitGame(gameSet).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class DigitGame {
	private int[][] gameSet;

	public DigitGame() {}

	public DigitGame(int[][] gameSet) {
		this.gameSet = gameSet;
	}

	public int getResult() {
		int result = 0,
			max = 0;

		for(int i=0; i<gameSet.length; i++) {
			int[] cardSet = gameSet[i];
			int sum = 0;

			for(int j=0; j<cardSet.length; j++) {
				sum += cardSet[j];
			}

			for(int j=0; j<cardSet.length-1; j++) {
				for(int k=j+1; k<cardSet.length; k++) {
					int subResult = sum - cardSet[j] - cardSet[k];

					if(max % 10 <= subResult % 10) {
						max = subResult; 
						result = i+1;
					}
				}
			}
		}

		return result;
	}
}