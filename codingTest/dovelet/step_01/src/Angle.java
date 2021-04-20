/*
 * ===문제 출처===
 * angle, <http://220.89.64.243/30stair/angle/angle.php?pname=angle>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Angle run = new Angle(Integer.parseInt(br.readLine()));
		run.printResult();
	}
}

class Angle {
	int n;

	public Angle() {}

	public Angle(int n) {
		this.n = n;
	}

	public void printResult() {
		System.out.println((n-2)*180 + " " + 360);
	}
}