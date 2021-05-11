/*
 * ===문제 출처===
 * cha, <http://220.89.64.243/30stair/cha/cha.php?pname=cha>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new Cha(parseInt(st.nextToken()), parseInt(st.nextToken())).printList());
// 		} catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Cha {
	int a, b;

	public Cha() {}

	public Cha(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String printList() {
		StringBuilder sb = new StringBuilder();

		sb.append(a).append(" ").append(b).append(" ");

		while(a-b >= 0) {
			int temp = a-b;
			a = b;
			b = temp;

			sb.append(b).append(" ");
		}

		return sb.toString();
	}
}