/*
 * ===문제 출처===
 * 10866 덱, <https://www.acmicpc.net/problem/10866>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder answer = new StringBuilder();
// 		int t = Integer.parseInt(br.readLine());
// 		Decue decue = new Decue(t);

// 		while(t-- > 0) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			switch(st.nextToken()) {
// 				case "push_front" : 
// 					decue.pushFront(Integer.parseInt(st.nextToken()));
// 					break;
// 				case "push_back" :
// 					decue.pushBack(Integer.parseInt(st.nextToken()));
// 					break;
// 				case "pop_front" :
// 					answer.append(decue.popFront() + "\n");
// 					break;
// 				case "pop_back" :
// 					answer.append(decue.popBack() + "\n");
// 					break;
// 				case "size" :
// 					answer.append(decue.size() + "\n");
// 					break;
// 				case "empty" :
// 					answer.append(decue.isEmpty() + "\n");
// 					break;
// 				case "front" : 
// 					answer.append(decue.front() + "\n");
// 					break;
// 				case "back" :
// 					answer.append(decue.back() + "\n");
// 					break;
// 			}
// 		}

// 		System.out.println(answer.toString());
// 	}
// }

class Decue {
	int[] decue;
	int front = 0;
	int rear = 1;
	int count = 0;

	public Decue(int size) {
		decue = new int[size];
	}

	public int isEmpty() {
		return count == 0 ? 1 : 0;
	}

	public int size() {
		return count;
	}

	public void pushFront(int x) {
		decue[front] = x;
		front = (front-1+decue.length)%decue.length;
		count++;
	}

	public void pushBack(int x) {
		decue[rear] = x;
		rear = (rear + 1) % decue.length;
		count++;
	}

	public int popFront() {
		int value = -1;

		if(!(isEmpty() > 0)) {
			count--;
			value = decue[(front+1)%decue.length];
			front = (front+1)%decue.length;
		}

		return value;
	}

	public int popBack() {
		int value = -1;

		if(!(isEmpty() > 0)) {
			count--;
			value = decue[(rear-1+decue.length)%decue.length];
			rear = (rear-1+decue.length)%decue.length;
		}

		return value;
	}

	public int front() {
		return isEmpty() > 0 ? -1 : decue[(front+1)%decue.length];
	}

	public int back() {
		return isEmpty() > 0 ? -1 : decue[(rear-1+decue.length)%decue.length];
	}
}