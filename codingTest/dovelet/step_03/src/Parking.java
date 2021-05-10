/*
 * ===문제 출처===
 * parking, <http://220.89.64.243/30stair/parking/parking.php?pname=parking>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Parking(parseInt(input.readLine()), input.readLine()).getOptimalWalk());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Parking {
	int n;
	String stores;

	public Parking() {}

	public Parking(int n, String stores) {
		this.n = n;
		this.stores = stores;
	}

	public int getOptimalWalk() {
		int result = 0,
			sum = 0,
			parkingPoint = 0;
		int[] storeArr = new int[n];
		StringTokenizer st = new StringTokenizer(stores);

		for(int i=0; i<storeArr.length; i++ ){
			storeArr[i] = parseInt(st.nextToken());
			sum += storeArr[i];
		}
		parkingPoint = (int)Math.ceil((double)(sum) / n);
		Arrays.sort(storeArr);

		for(int i=0; i<=storeArr.length; i++) {
			if(i == 0) {
				result += Math.abs(parkingPoint-storeArr[i]);
			}else if(i == storeArr.length) {
				result += Math.abs(parkingPoint-storeArr[i-1]);
			}else {
				result += storeArr[i] - storeArr[i-1];
			}
		}

		return result;
	}
}