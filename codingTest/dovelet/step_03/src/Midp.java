/*
 * ===문제 출처===
 * midp, <http://220.89.64.243/30stair/midp/midp.php?pname=midp>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		Midp.getResult();
// 	}
// }

class Midp {
	public Midp() {}

	public static void getResult() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			int[] setCountArray = new int[4];
			int result = 0;

			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);

				int x = parseInt(st.nextToken());
				int y = parseInt(st.nextToken());

				if(x%2 == 0 && y%2 == 0) {
					setCountArray[0]++;
				} else if(x%2 == 0 && y%2 != 0) {
					setCountArray[1]++;
				} else if(x%2 != 0 && y%2 == 0) {
					setCountArray[2]++;
				} else {
					setCountArray[3]++;
				}
			}

			for(int i=0; i<setCountArray.length; i++) {
				if(setCountArray[i] <= 1) continue;

				int setCount = setCountArray[i],
					combinationCount = setCount * (setCount-1) / 2;

				result += combinationCount;
			}

			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}