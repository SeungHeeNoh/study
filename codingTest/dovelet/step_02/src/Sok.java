/*
 * ===문제 출처===
 * coci_sok, <http://220.89.64.243/30stair/coci_sok/coci_sok.php?pname=coci_sok>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Float.parseFloat;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		new Sok(br.readLine(), br.readLine()).getResult();
// 		br.close();
// 	}
// }

class Sok {
	String arr[] = new String[2];

	public Sok() {}

	public Sok(String buyInput, String ratioInput) {
		this.arr[0] = buyInput;
		this.arr[1] = ratioInput;
	}

	public void getResult() {
		float inputArray[][] = new float[2][];
		StringTokenizer st;
		float min = Float.MAX_VALUE;
		String result = "";

		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(arr[i]);
			inputArray[i] = new float[st.countTokens()];

			for(int j=0; j<inputArray[i].length; j++) {
				inputArray[i][j] = parseFloat(st.nextToken());
			}
		}

		for(int i=0; i<inputArray[0].length; i++) {
			if(min > inputArray[0][i]/inputArray[1][i]) min = inputArray[0][i]/inputArray[1][i];
		}

		for(int i=0; i<inputArray[0].length; i++) {
			result += (i==0 ? "" : " ") + (inputArray[0][i] - inputArray[1][i] * min);
		}

		System.out.println(result);
	}
}