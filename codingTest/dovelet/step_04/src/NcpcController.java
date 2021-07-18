/*
 * ===문제 출처===
 * ncpc_event, <http://220.89.64.243/30stair/ncpc_event/ncpc_event.php?pname=ncpc_event>.
 * */
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int number = parseInt(st.nextToken()),
// 				budget = parseInt(st.nextToken()),
// 				hotelCount = parseInt(st.nextToken()),
// 				weekend = parseInt(st.nextToken());
// 			String[][] hotelInfo = new String[hotelCount][2];

// 			for(int i=0; i<hotelCount; i++) {
// 				hotelInfo[i][0] = br.readLine().trim();
// 				hotelInfo[i][1] = br.readLine().trim();
// 			}

// 			new NcpcController(number, budget, hotelInfo).calcMinimumCost();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }


class NcpcController {
	NcpcModel nm = new NcpcModel();
	NcpcView nv = new NcpcView();
	int number, budget;
	String[][] hotelInfo;

	public NcpcController() {}

	public NcpcController(int number, int budget, String[][] hotelInfo) {
		this.number = number;
		this.budget = budget;
		this.hotelInfo = hotelInfo;
	}

	public void calcMinimumCost() {
		int result = nm.calcMinimumCost(number, budget, hotelInfo);

		if(result == 0) {
			nv.displayImpossible();
		} else {
			nv.displayPosssible(result);
		}
	}
}

class NcpcModel {

	public int calcMinimumCost(int number, int budget, String[][] hotelInfo) {
		int result = 0;

		for(int i=0; i<hotelInfo.length; i++) {
			int totalCost = parseInt(hotelInfo[i][0])*number;
			StringTokenizer st = new StringTokenizer(hotelInfo[i][1]);

			if(totalCost <= budget) {
				while(st.hasMoreTokens()) {
					if (parseInt(st.nextToken()) >= number) {
						if(result == 0) {
							result = totalCost;
							break;
						} else if(result > totalCost) {
							result = totalCost;
							break;
						}
					}
				}
			}
		}

		return result;
	}

}

class NcpcView {

	public void displayImpossible() {
		System.out.println("stay home");
	}

	public void displayPosssible(int result) {
		System.out.println(result);
	}

}