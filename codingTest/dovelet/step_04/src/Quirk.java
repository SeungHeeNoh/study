/*
 * ===문제 출처===
 * quirk, <http://220.89.64.243/30stair/quirk/quirk.php?pname=quirk>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Quirk(parseInt(br.readLine().trim())).printQuirksomes();
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Quirk {
	int n;

	public Quirk() {}

	public Quirk(int n) {
		this.n = n;
	}

	public void printQuirksomes() {
		int start = 0,
		 	end = (int)Math.pow(10, n/2);
		StringBuilder sb = new StringBuilder(100);

		for(int i=start; i<end; i++) {
			for(int j=start; j<end; j++) {
				if((int)Math.pow(i+j, 2) == i*end+j) {
					sb.append(String.format("%0"+(n/2)+"d", i)).append(String.format("%0"+(n/2)+"d", j)).append("\n");
				}
			}
		}

		System.out.println(sb.toString());
	}
}