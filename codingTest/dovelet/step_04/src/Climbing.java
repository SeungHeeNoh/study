/*
 * ===문제 출처===
 * climbing, <http://220.89.64.243/30stair/climbing/climbing.php?pname=climbing>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			while(true) {
// 				StringTokenizer st = new StringTokenizer(br.readLine());

// 				int n = parseInt(st.nextToken()),
// 					u = parseInt(st.nextToken()),
// 					d = parseInt(st.nextToken());

// 				if(n+u+d == 0) break;

// 				Climbing.printEscapeTime(n, u, d);
// 			}
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Climbing {
	public static void printEscapeTime(int n, int u, int d) {
		int i = 0,
			height = 0;

		while(n>height) {
			if(i%2 == 0) {
				height+=u;
			}else {
				height-=d;
			}
			i++;
		}

		System.out.println(i);
	}
}