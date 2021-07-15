/*
 * ===문제 출처===
 * 3nplusone, <http://220.89.64.243/30stair/3nplusone/3nplusone.php?pname=3nplusone>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			System.out.println(new NPlusOne(parseInt(st.nextToken()), parseInt(st.nextToken())).maxLength());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		} 
// 	}
// }

class NPlusOne {
	int start, end;

	public NPlusOne() {}

	public NPlusOne(int x, int y) {
		this.start = Math.min(x, y);
		this.end = Math.max(x, y);
	}

	public int maxLength() {
		int maxCount = 0;

		for(int i=start; i<=end; i++) {
			int n = i,
				count = 1;

			while(n != 1) {
				if(n%2 == 0) {
					n /= 2;
				} else {
					n = n*3+1;
				}
				count++;
			}
			if(maxCount < count) maxCount = count;
		}

		return maxCount;
	}
}