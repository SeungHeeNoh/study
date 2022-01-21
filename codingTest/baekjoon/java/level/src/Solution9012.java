/*
 * ===문제 출처===
 * 9012 괄호, <https://www.acmicpc.net/problem/9012>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = parseInt(br.readLine());
// 		StringBuffer answer = new StringBuffer();
		
// 		for(int t=0; t<test; t++) {
// 			String input = br.readLine();
// 			Stack<Character> stack = new Stack<>();
// 			String result = "YES";

// 			for(int i=0; i<input.length(); i++) {
// 				char c = input.charAt(i);

// 				if(c == '(') {
// 					stack.push(c);
// 				} else {
// 					if(stack.isEmpty() || stack.peek() == ')') {
// 						result = "NO";
// 						break;
// 					} else {
// 						stack.pop();
// 					}
// 				}
// 			}

// 			if(!stack.isEmpty()) result = "NO";

// 			answer.append(result).append("\n");
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution9012 {
	
}