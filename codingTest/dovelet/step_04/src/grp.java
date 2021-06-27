/*
 * ===문제 출처===
 * grp, <http://220.89.64.243/30stair/grp/grp.php?pname=grp>.
 * */
import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			System.out.println(grp.getCount(parseInt(st.nextToken()), parseInt(st.nextToken())));
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class grp {
	public static int getCount(int n, int k) {
		int count = 0;

		for(int i=1; i<=n-k+1; i++) {
			if((k*(2*i+k-1)/2) % 15 == 0) count++;
		}
		return count;
	}
}