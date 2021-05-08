/*
 * ===문제 출처===
 * oddddo, <http://220.89.64.243/30stair/oddddo/oddddo.php?pname=oddddo>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Oddddo(parseInt(input.readLine())).getSum());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Oddddo {
	int n;

	public Oddddo() {}

	public Oddddo(int n) {
		this.n = n;
	}

	public int getSum() {
		int sum = 0;

		for(int i=n, j=1; i>0; i--, j+=2) {
			sum += j*(2*i - 1);
		}

		return sum;
	}
}