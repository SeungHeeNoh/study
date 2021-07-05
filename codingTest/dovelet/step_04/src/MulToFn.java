/*
 * ===문제 출처===
 * multofn, <http://220.89.64.243/30stair/multofn/multofn.php?pname=multofn>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(MulToFn.getCount(parseInt(br.readLine().trim())));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class MulToFn {
	final static int START = 1;
	final static int LAST = 3;

	public static int getCount(int n) {
		int count = 0;

		for(int i=START; i<=LAST; i++) {
			for(int j=START; j<=LAST; j++) {
				for(int k=START; k<=LAST; k++) {
					for(int t=START; t<=LAST; t++) {
						int number = i*1000 + j*100+k*10+t;

						if(number % n == 0) count++;
					}
				}
			}
		}

		return count;
	}
}