/*
 * ===문제 출처===
 * punch_game, <http://220.89.64.243/30stair/punch_game/punch_game.php?pname=punch_game>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new PunchGame(br.readLine()).getResult());
// 		br.close();
// 	}
// }

class PunchGame {
	String input;

	static int attackDamage[] = {10, 15, 30, 40, 45};
	final static int ATTACK_COUNT = 10;
	final static int HP = 100;

	public PunchGame() {}

	public PunchGame(String input) {
		this.input = input;
	}

	public String getResult() {
		StringTokenizer st = new StringTokenizer(input);
		String result = "time out";

		int count = 0, totalDamage = 0;
		for(int i=0; i<attackDamage.length; i++) {
			int attack = Integer.parseInt(st.nextToken());
			count += attack;
			totalDamage += attack*attackDamage[i];

			if(count > ATTACK_COUNT) {
				return result;
			}
		}

		if(totalDamage >= HP) {
			result = "you win";
		}else {
			result = "game over";
		}

		return result;
	}
}