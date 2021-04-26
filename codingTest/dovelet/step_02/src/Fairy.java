/*
 * ===문제 출처===
 * fairy, <http://220.89.64.243/30stair/fairy/fairy.php?pname=fairy>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Fairy(Integer.parseInt(br.readLine())).isPresent());
// 		br.close();

// 	}
// }

class Fairy {
	int y;

	final int BIRTH = 2000;

	public Fairy() {}

	public Fairy(int y) {
		this.y = y;
	}

	public char isPresent() {
		char result = 'X';

		if(y>=BIRTH && (y-BIRTH) % 8 == 0) result = 'O';

		return result;
	}
}