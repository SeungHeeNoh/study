/*
 * ===문제 출처===
 * chessboard, <http://220.89.64.243/30stair/chessboard/chessboard.php?pname=chessboard>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Chessboard(parseInt(input.readLine().trim())).printPoint();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Chessboard {
	int n;

	public Chessboard() {}

	public Chessboard(int n) {
		this.n = n;
	}

	public void printPoint() {
		int x = 0,
			y = 0;
		int i = (int)Math.ceil(Math.sqrt(n)),
			mid = (i*i + (i-1)*(i-1)+1)/2;

		if(i % 2 == 0) {
			if(n < mid) {
				x = i-(mid-n);
				y = i;
			}else {
				x = i;
				y = i*i-n+1;
			}
		}else {
			if(n < mid) {
				x = i;
				y = i-(mid-n);
			}else {
				x = i*i-n+1;
				y = i;
			}
		}

		System.out.printf("%d %d", x, y);
	}
}