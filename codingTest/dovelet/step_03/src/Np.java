/*
 * ===문제 출처===
 * 3np1, <http://220.89.64.243/30stair/3np1/3np1.php?pname=3np1>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Np(parseInt(br.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Np {
	int n;

	public Np() {}

	public Np(int n) {
		this.n = n;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		sb.append(n).append(" ");

		while(n != 1) {
			n = n%2 == 0 ? n/2 : n*3+1;
			sb.append(n).append(" ");
		}

		return sb.toString();
	}
}