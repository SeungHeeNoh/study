/*
 * ===문제 출처===
 * butter, <http://220.89.64.243/30stair/butter/butter.php?pname=butter>.
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

// 		Butter run = new Butter(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getTime());
// 	}
// }

class Butter {
	int n, m;

	public Butter() {}

	public Butter(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public int getTime() {
		return n;
	}
}