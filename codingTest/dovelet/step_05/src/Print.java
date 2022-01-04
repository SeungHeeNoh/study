/*
 * ===문제 출처===
 * print, <http://220.89.64.243/30stair/print/print.php?pname=print>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			int length = parseInt(st.nextToken()),
// 				target = parseInt(st.nextToken());
// 			int[] printArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// 			System.out.println(new Print(length, target, printArray).getTime());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Print {
	private int length;
	private int target;
	private int[] printArray;

	public Print() {}

	public Print(int length, int target, int[] printArray) {
		this.length = length;
		this.target = target;
		this.printArray = printArray;
	}

	public int getTime() {
		int time = 0;
		int index = 0;

		do {
			int max = 0;
			int maxIndex = 0;

			for(int j=0; j<length; j++) {
				if(max < printArray[index]) {
					max = printArray[index];
					maxIndex = index;
				}

				index = index+1 == length ? 0 : index+1;
			}

			printArray[maxIndex] = -1;
			index = maxIndex;
			time++;
		}while(index != target);
	
		return time;
	}
}