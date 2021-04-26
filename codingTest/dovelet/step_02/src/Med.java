/*
 * ===문제 출처===
 * med, <http://220.89.64.243/30stair/med/med.php?pname=med>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Med(br.readLine()).getMed());
// 		br.close();

// 	}
// }

class Med {
	String input;

	public Med() {}

	public Med(String input) {
		this.input = input;
	}

	public int getMed() {
		StringTokenizer st = new StringTokenizer(input);

		int arr[] = new int[st.countTokens()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		return arr[arr.length/2];
	}
}