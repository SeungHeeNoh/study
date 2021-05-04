/*
 * ===문제 출처===
 * adigit, <http://220.89.64.243/30stair/adigit/adigit.php?pname=adigit>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Adigit(br.readLine()).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Adigit {
	String input;

	public Adigit() {}

	public Adigit(String input) {
		this.input = input;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(input);
		int[] arr = new int[3];

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());

			if(temp < 10) {
				arr[0] += temp;
			}else if(temp < 100) {
				arr[1] += temp;
			}else {
				arr[2] += temp;
			}
		}

		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}

		return sb.toString();
	}
}