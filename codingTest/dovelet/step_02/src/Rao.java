/*
 * ===문제 출처===
 * rao, <http://220.89.64.243/30stair/rao/rao.php?pname=rao>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Rao(br.readLine()).getResult());
// 	}
// }

class Rao {
	String input;

	public Rao() {}

	public Rao(String input) {
		this.input = input;
	}

	public String getResult() {
		String result = "";
		StringTokenizer st = new StringTokenizer(input);
		int arr[] = new int[st.countTokens()],
			sum = 0;

		for(int i=0; i<arr.length; i++) {
			arr[i] = parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		for(int i=0; i<2; i++) {
			sum += arr[i] * arr[i];
		}

		if(sum < arr[2]*arr[2]) {
			result = "obtuse";
		}else if(sum > arr[2]*arr[2]) {
			result = "acute";
		}else {
			result = "right";
		}

		return result;
	}
}