/*
 * ===문제 출처===
 * ccc_bridgetrans, <http://220.89.64.243/30stair/ccc_bridgetrans/ccc_bridgetrans.php?pname=ccc_bridgetrans>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			final int MAX_TRAINT_COUNT = 4;
// 			int weight = parseInt(br.readLine()); 
// 			int[] train = new int[parseInt(br.readLine())]; 
// 			int result = 0,
// 				sum = 0;

// 			for(int i=0; i<train.length; i++) {
// 				train[i] = parseInt(br.readLine());

// 				if(i >= MAX_TRAINT_COUNT) {
// 					sum -= train[i-MAX_TRAINT_COUNT];
// 				}

// 				sum += train[i];

// 				if(sum > weight) {
// 					break;
// 				}

// 				result++;
// 			}

// 			System.out.println(result);
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }