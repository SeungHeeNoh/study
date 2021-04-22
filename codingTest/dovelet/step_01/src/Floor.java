/*
 * ===문제 출처===
 * flr, <http://220.89.64.243/30stair/flr/flr.php?pname=flr&stair=1>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		Floor run = new Floor(Integer.parseInt(br.readLine().trim()));
// 		br.close();
// 		System.out.printf("%d", run.getFloor());
// 	}
// }

class Floor {
	int x;

	public Floor() {}

	public Floor(int x) {
		this.x = x;
	}

	public int getFloor() {
		return (int)(Math.log(x)/Math.log(2)) + 1;
	}
}