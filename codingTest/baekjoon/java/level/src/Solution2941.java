/*
 * ===문제 출처===
 * 2941 크로아티아 알파벳, <https://www.acmicpc.net/problem/2941>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
	
// 	public static void main(String[] args) throws IOException {	
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String input = br.readLine();

// 		System.out.println(Solution2941.getCount(input));
// 	}
// }

class Solution2941 {
	final static String[] CROATIA = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

	public static int getCount(String input) {

		for(int i=0; i<CROATIA.length; i++) {
			input = input.replaceAll(CROATIA[i], "a");
		}

		return input.length();
	}
}