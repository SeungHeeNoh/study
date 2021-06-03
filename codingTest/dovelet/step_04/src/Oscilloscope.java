/*
 * ===문제 출처===
 * oscilloscope, <http://220.89.64.243/30stair/oscilloscope/oscilloscope.php?pname=oscilloscope>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Oscilloscope.printOscilloscope(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Oscilloscope {
	public static int RANGE = 60;
	public Oscilloscope() {}

	public static void printOscilloscope(int n) {
		StringBuilder sb = new StringBuilder();
		int interval = 2*n;

		for(int i=10; i>=-10; i--) {
			if(-n <= i && i <= n) {
				int count = 0;

				outer : 
				while(true) {
					for(int j=0; j<interval; j++) {
						if(i >= 0 && (j == n || i == j)) {
							sb.append("*");
						}else if(i < 0 && (j == n || 2*n+i == j)) {
							sb.append("*");
						}else {
							sb.append(" ");
						}
						if(++count >= RANGE) break outer;
					}
				}
			}else {
				for(int j=0; j<RANGE; j++) {
					sb.append(" ");
				}
			}
			
			sb.append(String.format("|%3dV%n", i));
		}

		System.out.println(sb);
	}
}
