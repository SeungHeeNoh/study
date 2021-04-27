/*
 * ===문제 출처===
 * tri, <http://220.89.64.243/30stair/tri/tri.php?pname=tri>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Tri(br.readLine()).getResult());
// 		br.readLine()
// 	}
// }

class Tri {
	String input;

	public Tri() {}

	public Tri(String input) {
		this.input = input;
	}

	public String getResult() {
		int result = 0, max = 0;
		String arr[] = input.split(" ");

		for(int i=0; i<arr.length; i++) {
			int item = parseInt(arr[i]);

			result += item;
			if(max < item) max = item;
		}

		return result > 2*max ? "yes" : "no";
	}
}