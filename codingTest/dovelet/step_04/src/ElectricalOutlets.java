/*
 * ===문제 출처===
 * electrical_outlets, <http://220.89.64.243/30stair/electrical_outlets/electrical_outlets.php?pname=electrical_outlets>.
 * */
import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int inputLength = parseInt(br.readLine());

// 			for(int i=0; i<inputLength; i++) {
// 				StringTokenizer st = new StringTokenizer(br.readLine());
// 				int[] arr = new int[parseInt(st.nextToken())];

// 				for(int j=0; j<arr.length; j++) {
// 					arr[j] = parseInt(st.nextToken());
// 				}

// 				System.out.println(ElectricalOutlets.getMaxAppliance(arr));
// 			}

// 		} catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ElectricalOutlets {

	public ElectricalOutlets() {}
	
	public static int getMaxAppliance(int[] arr) {
		int count = 0;

		for(int i=0; i<arr.length-1; i++) {
			count += arr[i]-1;
		}

		count += arr[arr.length-1];
		return count;
	}
}