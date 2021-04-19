/*
 * ===문제 출처===
 * three, <http://220.89.64.243/30stair/three/three.php?pname=three>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		Three run = new Three(br.readLine(), br.readLine());
// 		br.close();
// 		run.printProcess();
// 	}
// }

class Three {
	String x, y;

	Three() {}

	Three(String x, String y) {
		this.x = x;
		this.y = y;
	}

	void printProcess() {
		int numberX = Integer.parseInt(x),
			numberY = Integer.parseInt(y);

		for(int i=y.length()-1; i>=0; i--) {
			System.out.println((y.charAt(i)-'0') * numberX);
		}

		System.out.println(numberX*numberY);
	}
}