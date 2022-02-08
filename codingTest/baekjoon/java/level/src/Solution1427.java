/*
 * ===문제 출처===
 * 1427 소트인사이드, <https://www.acmicpc.net/problem/1427>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String input = br.readLine();

// 		System.out.println(new Solution1427().getResult(input));
// 	}
// }

class Solution1427 {
	public String getResult(String input) {
		StringBuilder answer = new StringBuilder(input.length());
		int[] number = new int[10];

		for(int i=0; i<input.length(); i++) {
			number[input.charAt(i)-'0']++;
		}

		for(int i=number.length-1; i>=0; i--) {
			for(int j=0; j<number[i]; j++) {
				answer.append(i);
			}
		}

		return answer.toString();
	}
}