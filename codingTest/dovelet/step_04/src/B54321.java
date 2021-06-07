/*
 * ===문제 출처===
 * b54321, <http://220.89.64.243/30stair/b54321/b54321.php?pname=b54321>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			B54321.printResult(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class B54321 {
	public B54321() {}

	public static void printResult(int n) {
		StringBuilder sb = new StringBuilder();

		for(int i=n; i>0; i--) {
			for(int j=i; j<n; j++) {
				sb.append(" ");
			}
			for(int j=i; j>0; j--) {
				sb.append(j);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}