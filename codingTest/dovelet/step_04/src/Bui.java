/*
 * ===문제 출처===
 * bui, <http://220.89.64.243/30stair/bui/bui.php?pname=bui>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Bui.printV(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Bui {
	public Bui() {}

	public static void printV(int n) {
		StringBuilder sb = new StringBuilder();

		final int COL = 3*2+n;
		int blank = 2;
		for(int i=1; blank <= COL; i++) {
			if(i==1) {
				sb.append(" **");
				for(int j=0; j<n; j++) {
					sb.append(" ");
				}
				sb.append("**");
			}else {
				int half = blank/2,
					midL = half+3,
					midR = COL-half-2;

					if(midL > midR) {
						midL = midR = 0;
					}

				for(int j=1; j<=COL; j++) {
					if(j<=half-1) {
						sb.append(" ");
					}else if(j == half || j == midL || j == midR || j == COL-half+1) {
						sb.append("*");
					}else {
						sb.append(" ");
					}
				}

				blank += 2;
			}

			sb.append("\n");
		}

		if(n%2 == 1) {
			for(int i=0; i<COL/2; i++)  {
				sb.append(" ");
			}
			sb.append("*");
		}

		System.out.println(sb);
	}
}