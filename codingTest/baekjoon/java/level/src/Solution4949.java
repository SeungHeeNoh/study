/*
 * ===문제 출처===
 * 4949 균형잡힌 세상, <https://www.acmicpc.net/problem/4949>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		System.out.println(Solution4949.getAnswer());
// 	}
// }

class Solution4949 {
	public static String getAnswer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		StringBuilder answer = new StringBuilder();

		while(!(line = br.readLine()).equals(".")) {
			Stack<Character> stack = new Stack<>();
			String result = "yes";

			try {
				for(int i=0; i<line.length(); i++) {
					char ch = line.charAt(i);
	
					if(ch == '(' || ch == '[') {
						stack.push(ch);
					} else if(ch == ')') {
						char pop = stack.pop();
	
						if(pop != '(') {
							throw new Exception("not match");
						}
					} else if(ch == ']') {
						char pop = stack.pop();
	
						if(pop != '[') {
							throw new Exception("not match");
						}
					}
				}

				if(!stack.isEmpty()) {
					result = "no";
				}

			} catch(Exception e) {
				result = "no";
			}

			answer.append(result + "\n");
		}

		return answer.toString();
	}
}