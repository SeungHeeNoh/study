/*
 * ===문제 출처===
 * speed_reading, <http://220.89.64.243/30stair/speed_reading/speed_reading.php?pname=speed_reading>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			int n = parseInt(st.nextToken()),
// 				k = parseInt(st.nextToken());

// 			for(int i=0; i<k; i++) {
// 				st = new StringTokenizer(br.readLine());

// 				SpeedReading.printReadlingTime(n, parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken()));
// 			}
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class SpeedReading {
	public static void printReadlingTime(int n, int s, int t, int r) {
		int time = 0;

		while(n > 0) {
			if(time % (t+r) < t) {
				n -= s;
				time++;
			} else {
				time += r;
			}
			
		}

		System.out.println(time);
	}
}