/*
 * ===문제 출처===
 * d_game, <http://220.89.64.243/30stair/d_game/d_game.php?pname=d_game>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[][] inputDice = new int[parseInt(br.readLine().trim())][3];

// 			for(int i=0; i<inputDice.length; i++) {
// 				StringTokenizer st = new StringTokenizer(br.readLine());

// 				inputDice[i][0] = parseInt(st.nextToken());
// 				inputDice[i][1] = parseInt(st.nextToken());
// 				inputDice[i][2] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new DGame(inputDice).getMaxReward());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class DGame {
	int[][] inputDice;

	public DGame() {}

	public DGame(int[][] inputDice) {
		this.inputDice = inputDice;
	}

	public int getMaxReward() {
		int maxReward = 0;

		for(int i=0; i<inputDice.length; i++) {
			int maxDice = 0,
				reward = 0;
			int[] dice = new int[6];

			for(int j=0; j<dice.length; j++) {
				dice[j] = 0;
			}

			for(int j=0; j<inputDice[i].length; j++) {
				dice[inputDice[i][j]-1]++;
			}

			for(int j=0; j<dice.length; j++) {
				if(dice[j] == 3) {
					reward = 10000 + (j+1)*1000;
					break;
				} else if(dice[j] == 2) {
					reward = 1000 + (j+1)*100;
					break;
				}

				if(dice[j] != 0) {
					maxDice = j+1;
				}
			}

			if(reward == 0) {
				reward = maxDice*100;
			}

			if(reward > maxReward) {
				maxReward = reward;
			}
		}

		return maxReward;
	}
}