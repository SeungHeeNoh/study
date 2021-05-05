/*
 * ===문제 출처===
 * sb, <http://220.89.64.243/30stair/sb/sb.php?pname=sb>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Sb(br.readLine()).getDiligentFarmer());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Sb {
	String input;

	public Sb() {}

	public Sb(String input) {
		this.input = input;
	}

	public int getDiligentFarmer() {
		String farmer[] = input.split(" ");
		int max = 0,
			idx = -1;

		for(int i=0; i<farmer.length; i++) {
			if(max < parseInt(farmer[i])) {
				max = parseInt(farmer[i]);
				idx = i+1;
			}
		}

		return idx;
	}
}