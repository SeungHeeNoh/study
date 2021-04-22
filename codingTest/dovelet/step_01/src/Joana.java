/*
 * ===문제 출처===
 * joana, <http://220.89.64.243/30stair/joana/joana.php?pname=joana>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		Joana run = new Joana(Integer.parseInt(br.readLine().trim()));
// 		br.close();
// 		System.out.printf("%d", run.getResult());
// 	}
// }

class Joana {
	long n;

	public Joana() {}

	public Joana(long n) {
		this.n = n;
	}

	public long getResult() {
		long line = (n+1)/2,
			 endnumber = 2*line*line-1;

		return 3*endnumber-6;
	}
}