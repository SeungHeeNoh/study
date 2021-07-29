/*
 * ===문제 출처===
 * rprint, <http://220.89.64.243/30stair/rprint/rprint.php?pname=rprint>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new RPrint(Integer.parseInt(br.readLine().trim()), br.readLine()).reverseString());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class RPrint {
	int n;
	String input;

	public RPrint() {}

	public RPrint(int n, String input) {
		this.n = n;
		this.input = input;
	}

	public String reverseString() {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(input);
		int[] array = new int[n];

		for(int i=1; i<=array.length; i++) {
			array[array.length-i] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<array.length; i++) {
			sb.append(array[i]).append(" ");
		}

		return sb.toString();
	}
}