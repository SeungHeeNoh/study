/*
 * ===문제 출처===
 * fou, <http://220.89.64.243/30stair/fou/fou.php?pname=fou>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Fou(input.readLine()).getAN());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Fou {
	String input;

	public Fou() {}

	public Fou(String input) {
		this.input = input;
	}

	public int getAN() {
		StringTokenizer st = new StringTokenizer(input);
		int[] arr = new int[st.countTokens()];
		int d, an = 0;

		for(int i=0; i<arr.length; i++) {
			arr[i] = parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		if(arr[1]-arr[0] > arr[2] - arr[1]) {
			d = arr[2] - arr[1];
			an = arr[0] + d;
		}else if(arr[1]-arr[0] < arr[2] - arr[1]){
			d = arr[1] - arr[0];
			an = arr[1] + d;
		}else {
			d = arr[1] - arr[0];
			an = arr[0] - d;
		}

		return an;
	}
}