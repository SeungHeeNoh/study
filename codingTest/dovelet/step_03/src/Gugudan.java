/*
 * ===문제 출처===
 * gugudan, <http://220.89.64.243/30stair/gugudan/gugudan.php?pname=gugudan>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Gugudan(parseInt(br.readLine())).printInputDan());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Gugudan {
	int dan;

	public Gugudan() {}

	public Gugudan(int dan) {
		this.dan = dan;
	}

	public String printInputDan() {
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<=9; i++) {
			sb.append(dan + "*" + i + "=" + dan*i).append("\n");
		}

		return sb.toString();
	}
}