/*
 * ===문제 출처===
 * usa_skidesign, <http://220.89.64.243/30stair/usa_skidesign/usa_skidesign.php?pname=usa_skidesign>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new SkiDesign().getResult());
// 	}
// }

class SkiDesign {
	final static int DIFF = 17;
	public SkiDesign() {}

	public int getResult() {
		int cost = Integer.MAX_VALUE;
		int[] hills = null;

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			int length = parseInt(input.readLine());
			hills = new int[length];

			for(int i=0; i<length; i++) {
				hills[i] = parseInt(input.readLine());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		Arrays.sort(hills);

		for(int i=1; i+DIFF<=hills[hills.length-1]; i++) {
			int min = i,
				max = i+DIFF,
				tempCost = 0;
			for(int j=0; j<hills.length; j++) {
				if(hills[j] < min) {
					tempCost += (hills[j]-min) * (hills[j]-min);
				}else if(hills[j] > max) {
					tempCost += (hills[j]-max) * (hills[j]-max);
				}
			}

			if(tempCost < cost) cost = tempCost;
		}

		return cost;
	}
}