/*
 * ===문제 출처===
 * 10828 스택, <https://www.acmicpc.net/problem/10828>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = parseInt(br.readLine());
// 		Stack<Integer> stack = new Stack<>();
// 		StringBuffer result = new StringBuffer();
		
// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			String command = st.nextToken();

// 			switch(command) {
// 				case "push" :
// 					stack.push(parseInt(st.nextToken()));
// 					break;
// 				case "pop" : 
// 					if(stack.isEmpty()) {
// 						result.append("-1\n");
// 					} else {
// 						result.append(stack.pop()+"\n");
// 					}
// 					break;
// 				case "size" :
// 					result.append(stack.size() + "\n");
// 					break;
// 				case "empty" :
// 					result.append((stack.isEmpty() ? 1 : 0) + "\n");
// 					break;
// 				case "top" : 
// 					if(stack.isEmpty()) {
// 						result.append("-1\n");
// 					} else {
// 						result.append(stack.peek() + "\n");
// 					}
// 					break;
// 			}
// 		}

// 		System.out.println(result.toString());
// 	}
// }

class Soltion10828 {

}