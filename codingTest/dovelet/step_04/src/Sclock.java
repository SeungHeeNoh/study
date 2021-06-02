/*
 * ===문제 출처===
 * sclock, <http://220.89.64.243/30stair/sclock/sclock.php?pname=sclock>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Sclock.printSclock(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Sclock {

	public Sclock() {}

	public static void printSclock(int n) {
		StringBuilder sb = new StringBuilder();

		int k = n;
		for(int i=1; i<=n; i++) {
			if(i <= n/2) {
				for(int j=1; j<=(n-k)/2; j++) {
					sb.append(" ");
				}
				for(int j=1; j<k; j++) {
					sb.append("*");
				}
				sb.append("$");
				k -= 2;
			}else {
				for(int j=1; j<=(n-k)/2; j++) {
					sb.append(" ");
				}
				sb.append("$");
				for(int j=1; j<k; j++) {
					sb.append("*");
				}
				k += 2;
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}