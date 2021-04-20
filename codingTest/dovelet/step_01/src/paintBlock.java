/*
 * ===문제 출처===
 * paintblock, <http://220.89.64.243/30stair/paintblock/paintblock.php?pname=paintblock&stair=1>.
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

// 		paintBlock run = new paintBlock(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getTwicePaintBlock());
// 	}
// }

class paintBlock {
	int a, b, c;

	public paintBlock() {}

	public paintBlock(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getTwicePaintBlock() {
		return 4 * (a+b+c-6);
	}
}