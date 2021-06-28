/*
 * ===문제 출처===
 * sugar, <http://220.89.64.243/30stair/sugar/sugar.php?pname=sugar>.
 * */
import java.io.*;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(Sugar.getMinBag(parseInt(br.readLine())));
// 		} catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Sugar {
	public static int getMinBag(int weight) {
		int min = Integer.MAX_VALUE;

		for(int x=0; ; x++) {
			for(int y=0; ;y++) {
				int sum = 3*x+5*y;

				if (sum == weight) {
					if(min > x+y) min = x+y;
				}else if(sum > weight){
					break;
				}
			}

			if(3*x > weight) break;
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}
}