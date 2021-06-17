/*
 * ===문제 출처===
 * ate, <http://220.89.64.243/30stair/ate/ate.php?pname=ate>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(Ate.getCountLuckyNumber(parseInt(br.readLine().trim())));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ate {
	public Ate() {}

	public static int getCountLuckyNumber(int number) {
		int count = 0,
			mid = number/2+1;

		if(number % 2 == 0 && mid < 100) {
			count++;
		}

		count += (100 > mid ? 100-mid : 0)*2;

		return count;
	}
}