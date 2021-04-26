/*
 * ===문제 출처===
 * coci_kornislav, <http://220.89.64.243/30stair/coci_kornislav/coci_kornislav.php?pname=coci_kornislav>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Kornislav(br.readLine()).getArea());
// 		br.close();
// 	}
// }

class Kornislav {
	String input;

	public Kornislav() {}

	public Kornislav(String input) {
		this.input = input;
	}

	public int getArea() {
		StringTokenizer st = new StringTokenizer(input);
		int arr[] = new int[st.countTokens()];

		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		return arr[2]*arr[0];
	}
}