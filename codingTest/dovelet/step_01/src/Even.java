/*
 * ===문제 출처===
 * even, <http://220.89.64.243/30stair/even/even.php?pname=even>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Even run = new Even(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%d", run.getResult());
// 	}
// }

class Even {
	long a, b;

	public Even() {}

	public Even(long a, long b) {
		this.a = a;
		this.b = b;
	}

	public long getResult() {
		return b-a+1-(long)(Math.sqrt(b))+(long)(Math.sqrt(a-1));
	}
}