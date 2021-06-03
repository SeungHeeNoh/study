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
			for(int j=0; j<RANGE; j++) {
				if(-n <= i && i <= n) {
					if((j%n == 0 && j%interval != 0)  || (i < 0 ? (interval - (j%interval) == -i) : j%interval == i)) {
						sb.append("*");
					}else {
						sb.append(" ");	
					}
				}else {
					sb.append(" ");
				}
			}

			sb.append(String.format("|%3dV%n", i));
		}

		System.out.println(sb);
	}
}
