/*
 * ===문제 출처===
 * CtoF, <http://220.89.64.243/30stair/CtoF/CtoF.php?pname=CtoF>.
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

// 		CtoF run = new CtoF(Integer.parseInt(st.nextToken()));
// 		System.out.printf("%.1f", run.convertCtoF());
// 	}
// }

class CtoF {
	int c;

	CtoF() {}

	CtoF(int c) {
		this.c = c;
	}

	float convertCtoF() {
		return 9/5f * c + 32;
	}
}