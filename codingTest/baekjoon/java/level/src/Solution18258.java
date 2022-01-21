/*
 * ===문제 출처===
 * 18258 큐 2, <https://www.acmicpc.net/problem/18258>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = parseInt(br.readLine());
// 		StringBuffer answer = new StringBuffer();
// 		LinkedList<Integer> queue = new LinkedList<>();

// 		while(test-- > 0) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			String command = st.nextToken();

// 			if(command.equals("push")) {
// 				queue.add(parseInt(st.nextToken()));
// 			} else if(command.equals("pop")) {
// 				answer.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
// 			} else if(command.equals("size")) {
// 				answer.append(queue.size()).append("\n");
// 			} else if(command.equals("empty")) {
// 				answer.append(queue.isEmpty() ? 1 : 0).append("\n");
// 			} else if(command.equals("front")) {
// 				answer.append(queue.isEmpty() ? -1 : queue.getFirst()).append("\n");
// 			} else if(command.equals("back")) {
// 				answer.append(queue.isEmpty() ? -1 : queue.getLast()).append("\n");
// 			}
// 		}
		
// 		System.out.println(answer);
// 	}
// }

class Solution18258 {

}