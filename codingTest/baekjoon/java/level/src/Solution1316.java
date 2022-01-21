/*
 * ===문제 출처===
 * 1316 그룹 단어 체커, <https://www.acmicpc.net/problem/1316>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = parseInt(br.readLine());
// 		int answer = test;

// 		while(test-- > 0) {
// 			boolean[] used = new boolean[26];
// 			String input = br.readLine();

// 			for(int i=0; i<input.length(); i++) {
// 				char c = input.charAt(i);
// 				int index = c-'a';
				
// 				if(used[index] && input.charAt(i-1) != c) {
// 					answer--;
// 					break;
// 				} else {
// 					used[index] = true;
// 				}
// 			}
// 		}
		
// 		System.out.println(answer);
// 	}
// }

class Solution1316 {

}