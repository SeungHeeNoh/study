/*
 * ===문제 출처===
 * box_brick, <http://220.89.64.243/30stair/box_brick/box_brick.php?pname=box_brick>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] bricks = new int[parseInt(br.readLine().trim())];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<bricks.length; i++) {
// 				bricks[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println("The minimum number of moves is "+ new BoxBrick(bricks).getMoveCount() + ".");
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class BoxBrick {
	int[] bricks;

	public BoxBrick() {}

	public BoxBrick(int[] bricks) {
		this.bricks = bricks;
	}

	public int getMoveCount() {
		int moveCount = 0,
			sum = 0,
			average = 0;

		for(int i=0; i<bricks.length; i++) {
			sum += bricks[i];
		}

		average = sum/bricks.length;

		for(int i=0; i<bricks.length; i++) {
			moveCount += bricks[i] - average > 0 ? bricks[i] - average : 0;
		}

		return moveCount;
	}
}