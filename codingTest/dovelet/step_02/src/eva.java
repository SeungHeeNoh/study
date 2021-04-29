/*
 * ===문제 출처===
 * eva, <http://220.89.64.243/30stair/eva/eva.php?pname=eva>.
 * */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new eva(parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).getResult());
// 	}
// }

class eva {
	int a1, a2, a3, a4;

	public eva() {}

	public eva(int a1, int a2, int a3, int a4) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}

	public String getResult() {
		int a5, d;

		if(a2-a1 == a4-a3) {
			d = a2-a1;
			a5 = a1+4*d;
		}else {
			d = a2/a1;
			a5 = a4*d;
		}

		return a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5;
	}
}