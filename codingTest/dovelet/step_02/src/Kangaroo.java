/*
 * ===문제 출처===
 * kangaroo, <http://220.89.64.243/30stair/kangaroo/kangaroo.php?pname=kangaroo>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		System.out.println(new Kangaroo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getJumpCount());
// 	}
// }

class Kangaroo {
	int a, b, c;

	public Kangaroo() {}

	public Kangaroo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getJumpCount() {
		int bw1 = b-a-1,
			bw2 = c-b-1;

		return bw1 > bw2 ? bw1 : bw2;
	}
}