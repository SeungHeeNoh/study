/*
 * ===문제 출처===
 * sum, <http://220.89.64.243/30stair/sum/sum.php?pname=sum>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Sum(br.readLine()).getSum());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Sum {
	String input;

	public Sum() {}

	public Sum(String input) {
		this.input = input;
	}

	public int getSum() {
		int sum = 0;
		String[] arr = input.split(" ");

		for(int i=0; i<arr.length; i++) {
			sum += parseInt(arr[i]);
		}

		return sum;
	}
}