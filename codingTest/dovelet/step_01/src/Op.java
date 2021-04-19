/*
 * ===문제 출처===
 * op, <http://220.89.64.243/30stair/op/op.php?pname=op>.
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

// 		Op run = new Op(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		run.printOp();
// 	}
// }

class Op {
	int a, b;

	Op() {}

	Op(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void printOp() {
		System.out.printf("%d+%d=%d%n", a, b, a+b);
		System.out.printf("%d-%d=%d%n", a, b, a-b);
		System.out.printf("%d*%d=%d%n", a, b, a*b);
		System.out.printf("%d/%d=%d%n", a, b, a/b);
		System.out.printf("%d%%%d=%d%n", a, b, a%b);
	}
}