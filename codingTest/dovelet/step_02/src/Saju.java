/*
 * ===문제 출처===
 * saju, <http://220.89.64.243/30stair/saju/saju.php?pname=saju>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();
// 		System.out.println(new Saju(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult());
// 	}
// }

class Saju {
	int y, m, d;

	public Saju() {}

	public Saju(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public String getResult() {
		return (y + m + d) % 10 == 0 ? "운수대통!" : "노력하세요!";
	}
}