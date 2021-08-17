/*
 * ===문제 출처===
 * coci_parking, <http://220.89.64.243/30stair/coci_parking/coci_parking.php?pname=coci_parking>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[] cost = new int[3];
// 			int[][] parkingTime = new int[3][2];

// 			for(int i=0; i<cost.length; i++) {
// 				cost[i] = parseInt(st.nextToken());
// 			}

// 			for(int i=0; i<parkingTime.length; i++) {
// 				st = new StringTokenizer(br.readLine());

// 				parkingTime[i][0] = parseInt(st.nextToken());
// 				parkingTime[i][1] = parseInt(st.nextToken());
// 			}
			
// 			System.out.println(new Parking(cost, parkingTime).getTotalCost());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Parking{
	int[] cost;
	int[][] parkingTime;

	public Parking() {}

	public Parking(int[] cost, int[][] parkingTime) {
		this.cost = cost;
		this.parkingTime = parkingTime;
	}

	public int getTotalCost() {
		int totalCost = 0;
		int min = parkingTime[0][0],
			max = parkingTime[0][1];

		for(int i=1; i<parkingTime.length; i++) {
			if(min > parkingTime[i][0]) {
				min = parkingTime[i][0];
			}

			if(max < parkingTime[i][1]) {
				max = parkingTime[i][1];
			}
		}

		for(int i=min; i<=max; i++) {
			int stay = 0;

			for(int j=0; j<parkingTime.length; j++) {
				if(parkingTime[j][0] <= i && i < parkingTime[j][1]) {
					stay++;
				}
			}

			if(stay > 0) {
				totalCost += cost[stay-1]*stay;
			}
		}

		return totalCost;
	}
}