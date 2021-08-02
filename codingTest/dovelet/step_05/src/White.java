/*
 * ===문제 출처===
 * white, <http://220.89.64.243/30stair/white/white.php?pname=white>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[] exists = new int[6];

// 			for(int i=0; i<exists.length; i++) {
// 				exists[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new White(exists).changeSet());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class White {
	static final int[] SET = {1, 1, 2, 2, 2, 8};
	int[] exists;

	public White() {}

	public White(int[] exists) {
		this.exists = exists;
	}

	public String changeSet() {
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<SET.length; i++) {
			sb.append(SET[i] - exists[i]).append(" ");
		}

		return sb.toString();
	}
}