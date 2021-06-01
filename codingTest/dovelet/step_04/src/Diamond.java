/*
 * ===문제 출처===
 * diamond, <http://220.89.64.243/30stair/diamond/diamond.php?pname=diamond>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			Diamond.printDiamond(parseInt(input.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Diamond {
	public Diamond() {}

	public static void printDiamond(int n) {
		StringBuilder result = new StringBuilder();

		int k = 1;
		for(int i=1; ; i++) {
			if (i < n) {
				for(int j=1; j<=Math.abs(n-i); j++) {
					result.append(" ");
				}
	
				for(int j=1; j<=k; j++) {
					result.append("*");
				}
				k+=2;
			}else {
				for(int j=1; j<=Math.abs(n-i); j++) {
					result.append(" ");
				}
	
				for(int j=1; j<=k; j++) {
					result.append("*");
				}

				k-=2;
				if(k < 0) break;
			}
			result.append("\n");
		}

		System.out.println(result);
	}
}