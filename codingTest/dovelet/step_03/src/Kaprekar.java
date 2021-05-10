/*
 * ===문제 출처===
 * 6174, <http://220.89.64.243/30stair/6174/6174.php?pname=6174>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Kaprekar(parseInt(input.readLine().trim())).getStep());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Kaprekar {
	int n;

	final static int NUMBER = 6174;

	public Kaprekar() {}

	public Kaprekar(int n) {
		this.n = n;
	}

	public int makeMinValue(int arr[]) {
		int value = 0;

		for(int i=0; i<arr.length; i++) {
			value += (arr[i] * Math.pow(10, arr.length-1-i));
		}

		return value;
	}

	public int makeMaxValue(int arr[]) {
		int value = 0;

		for(int i=0; i<arr.length; i++) {
			value += (arr[i] * Math.pow(10, i));
		}
		return value;
	}

	public int getStep() {
		int step = 0,
			temp = n;
		

		while(temp != NUMBER) {
			int[] arr = new int[4];

			for(int i=0; i<arr.length; i++) {
				arr[i] = (temp % 10);
				temp = temp / 10;
			}

			Arrays.sort(arr);
			temp = makeMaxValue(arr) - makeMinValue(arr);
			step++;
		}

		return step;
	}
}