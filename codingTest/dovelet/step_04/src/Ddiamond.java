/*
 * ===문제 출처===
 * ddiamond, <http://220.89.64.243/30stair/ddiamond/ddiamond.php?pname=ddiamond>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Ddiamond.printDiamond(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Ddiamond {
	public Ddiamond() {}

	public static void printDiamond(int n) {
		int mid = n/2+1;
		StringBuilder sb = new StringBuilder();

		int t=1;
		for(int i=1; i<=n; i++) {
			if(i < mid) {
				int k=0;

				for(int j=1; j<=mid-i; j++) {
					sb.append(" ");
				}
				for(int j=1; j<=t; j++) {
					if(j<=i) {
						sb.append(++k);
					}else {
						sb.append(--k);
					}
				}
				t += 2;
			}else {
				int k=0;

				for(int j=i-mid; j>=1; j--) {
					sb.append(" ");
				}
				for(int j=1; j<=t; j++) {
					if(j<=t/2+1) {
						sb.append(++k);
					}else {
						sb.append(--k);
					}
				}

				t -= 2;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}