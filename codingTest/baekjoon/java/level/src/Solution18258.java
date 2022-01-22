/*
 * ===문제 출처===
 * 18258 큐 2, <https://www.acmicpc.net/problem/18258>.
 * */ 
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = parseInt(br.readLine());
// 		StringBuffer answer = new StringBuffer();
// 		Solution18258 queue = new Solution18258(test);

// 		while(test-- > 0) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			String command = st.nextToken();

// 			if(command.equals("push")) {
// 				queue.push(parseInt(st.nextToken()));
// 			} else if(command.equals("pop")) {
// 				answer.append(queue.pop()).append("\n");
// 			} else if(command.equals("size")) {
// 				answer.append(queue.size()).append("\n");
// 			} else if(command.equals("empty")) {
// 				answer.append(queue.isEmpty()).append("\n");
// 			} else if(command.equals("front")) {
// 				answer.append(queue.front()).append("\n");
// 			} else if(command.equals("back")) {
// 				answer.append(queue.rear()).append("\n");
// 			}
// 		}
		
// 		System.out.println(answer);
// 	}
// }

class Solution18258 {
	private int[] queue;
	private int front=0;
	private int rear=0;

	public Solution18258(int size) {
		queue = new int[size];
	}

	public int isEmpty() {
		return rear == front ? 1 : 0;
	}

	public void push(int value) {
		queue[rear++] = value;
	}

	public int pop() {
		return isEmpty() > 0 ? -1 : queue[front++];
	}

	public int size() {
		return rear-front;
	}

	public int front() {
		return isEmpty() > 0 ? -1 : queue[front];
	}

	public int rear() {
		return isEmpty() > 0 ? -1 : queue[rear-1];
	}
}