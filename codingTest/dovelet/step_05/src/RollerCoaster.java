/*
 * ===문제 출처===
 * roller_coaster, <http://220.89.64.243/30stair/roller_coaster/roller_coaster.php?pname=roller_coaster>.
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
// 			StringBuffer sb = new StringBuffer();
// 			int testCount = parseInt(br.readLine());
// 			RollerCoaster rollerCoaster = new RollerCoaster();

// 			for(int i=0; i<testCount; i++) {
// 				StringTokenizer st = new StringTokenizer(br.readLine());
// 				int r = parseInt(st.nextToken()),
// 					k = parseInt(st.nextToken());
// 				int[] groupArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// 				sb.append("Case #").append(i+1).append(": ").append(rollerCoaster.getBenefitResult(k, r, groupArray)).append("\n");
// 			}

// 			System.out.println(sb.toString());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class RollerCoaster {
	private static final int PRICE = 1;

	public RollerCoaster() {}

	public int getBenefitResult(int k, int r, int[] groupArray) {
		int benefit = 0,
			count = 0,
			i = 0;

		while(count++ < r) {
			int personnel = 0,
				start = i;

			while(true) {
				personnel += groupArray[i];

				i = i+1 == groupArray.length ? 0 : i+1;
				if(personnel + groupArray[i] > k || start == i) break;
			}

			benefit += personnel * PRICE;
		}

		return benefit;
	}
}