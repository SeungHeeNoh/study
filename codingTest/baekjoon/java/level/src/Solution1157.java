/*
 * ===문제 출처===
 * 1157 단어 공부, <https://www.acmicpc.net/problem/1157>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int[] frequency = new int[26];
// 		String input = br.readLine().toUpperCase();
// 		char answer = '?';
// 		int maxIndex = 0;
// 		boolean isSame = false;

// 		for(char c : input.toCharArray()) {
// 			frequency[c-'A'] += 1;
// 		}

// 		for(int i=1; i<frequency.length; i++) {
// 			if(frequency[maxIndex] < frequency[i]) {
// 				maxIndex = i;
// 				isSame = false;
// 			} else if(frequency[maxIndex] == frequency[i]) {
// 				isSame = true;
// 			}
// 		}

// 		if(isSame) answer = '?';
// 		else answer = (char)(maxIndex+'A');
	
// 		System.out.println(answer);
// 	}
// }

class Solution1157 {

}