/*
 * ===문제 출처===
 * 54321, <http://220.89.64.243/30stair/54321/54321.php?pname=54321>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Print54321.printResult(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Print54321 {
	public Print54321() {}

	public static void printResult(int n) {
		StringBuilder sb = new StringBuilder();

		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) {
				sb.append(j);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}