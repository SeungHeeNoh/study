/*
 * ===문제 출처===
 * 5086 배수와 약수, <https://www.acmicpc.net/problem/5086>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuffer result = new StringBuffer();
// 		String line = "";
		
// 		while(!(line = br.readLine()).equals("0 0")) {
// 			StringTokenizer st = new StringTokenizer(line);
// 			int a = parseInt(st.nextToken()),
// 				b= parseInt(st.nextToken());

// 			if(a > b) {
// 				result.append(Soltion5086.isMultiple(a, b) ? "multiple" : "neither").append("\n");
// 			} else {
// 				result.append(Soltion5086.isFactor(a, b) ? "factor" : "neither").append("\n");
// 			}
// 		}

// 		System.out.println(result.toString());
// 	}
// }

class Soltion5086 {
	public static boolean isFactor(int a, int b) {
		return b%a == 0;
	}

	public static boolean isMultiple(int a, int b) {
		return a%b == 0;
	}
}