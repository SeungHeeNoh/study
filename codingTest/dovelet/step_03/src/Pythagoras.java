/*
 * ===문제 출처===
 * pythagoras, <http://220.89.64.243/30stair/pythagoras/pythagoras.php?pname=pythagoras>.
 * */
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(new Pythagoras(parseInt(input.readLine().trim())).getAB());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

class Pythagoras {
	int c;

	public Pythagoras() {}

	public Pythagoras(int c) {
		this.c = c;
	}

	public String getAB() {
		String result = "impossible";
		long powC = (long)c * c;

		for(int i=1; i<c; i++) {
			long powA = (long)i * i;

			if((powC - powA) % Math.sqrt(powC - powA) == 0) {
				result = i + " " + (int)Math.sqrt(powC - powA);
				break;
			}
		}

		return result;
	}
}