/*
 * ===문제 출처===
 * vito, <http://220.89.64.243/30stair/vito/vito.php?pname=vito>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			List<Integer> place = new ArrayList<>(parseInt(br.readLine()));
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			while(st.hasMoreTokens()) {
// 				place.add(parseInt(st.nextToken()));
// 			}

// 			System.out.println(new Vito(place).getMinDistance());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Vito {
	List<Integer> place;

	public Vito() {}

	public Vito(List<Integer> place) {
		this.place = place;
	}

	public int getMinDistance() {
		int minDistance = 0;
		Collections.sort(place);

		if(place.size() % 2 == 0) {
			int tempMinPlace1 = place.get((place.size()-1)/2),
				tempMinPlace2 = place.get((place.size()-1)/2+1),
				tempDistance1 = 0,
				tempDistance2 = 0;

			for(int i=0; i<place.size(); i++) {
				tempDistance1 += Math.abs(place.get(i) - tempMinPlace1);
				tempDistance2 += Math.abs(place.get(i) - tempMinPlace2);
			}

			minDistance = tempDistance1 < tempDistance2 ? tempDistance1 : tempDistance2;
		} else {
			int minPlace = place.get((place.size()-1)/2);

			for(int i=0; i<place.size(); i++) {
				minDistance += Math.abs(place.get(i) - minPlace);
			}
		}
		
		return minDistance;
	}
}