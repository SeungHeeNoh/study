/*
 * ===문제 출처===
 * ft, <http://220.89.64.243/30stair/ft/ft.php?pname=ft>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Ft(parseInt(br.readLine())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ft {
	int n;

	public Ft() {}

	public Ft(int n) {
		this.n = n;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		int count = 0,
			sum = 0,
			mul = 1;

		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sb.append(i).append(" ");
				count++;
				sum += i;
				mul = (mul * i) % 10;
			}
		}
		sb.append("\n").append(count).append("\n").append(sum).append("\n").append(mul);

		return sb.toString();
	}
}