/*
 * ===문제 출처===
 * meat, <http://220.89.64.243/30stair/meat/meat.php?pname=meat>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			String value = br.readLine();

// 			System.out.println(new Higher(value).getResult());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Higher {
	private String value;

	public Higher() {}

	public Higher(String value) {
		this.value = value;
	}

	public String getResult() {
		String result = "0";
		int[] valueArray = new int[value.length()];
		int targetIndex = -1;

		for(int i=0; i<valueArray.length; i++) {
			valueArray[i] = value.charAt(i) - '0';

			if(i != 0 && valueArray[i-1] < valueArray[i]) {
				targetIndex = i-1;
			}
		} 

		if(targetIndex != -1) {
			int temp = valueArray[targetIndex];
			int changeIndex = 0;
			int min = 10;

			for(int i=targetIndex+1; i<valueArray.length; i++) {
				if(valueArray[i] < min && valueArray[i] > temp) {
					min = valueArray[i];
					changeIndex = i;
				}
			}

			valueArray[targetIndex] = valueArray[changeIndex];
			valueArray[changeIndex] = temp;

			Arrays.sort(valueArray, targetIndex+1, valueArray.length);
			result = Arrays.stream(valueArray).mapToObj(String::valueOf).collect(Collectors.joining());
		}

		return result;
	}
}