/*
 * ===문제 출처===
 * dice, <http://220.89.64.243/30stair/dice/dice.php?pname=dice>.
 * */
import java.io.*;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Dice.printDiceSet(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Dice {
	static final int DICE = 6;
	public static void printDiceSet(int n) {
		for(int i=1; i <= DICE; i++) {
			for(int j=1; j<=DICE; j++) {
				if(i+j == n) System.out.println(i + " " + j);
			}
		}
	}
}