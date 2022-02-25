/*
 * ===문제 출처===
 * 2606 바이러스, <https://www.acmicpc.net/problem/2606>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		Computer2606[] computerList = new Computer2606[n+1];
		
// 		int input = Integer.parseInt(br.readLine());

// 		for(int i=1; i<=n; i++) {
// 			computerList[i] = new Computer2606();
// 		}

// 		while(input-- > 0) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int start = Integer.parseInt(st.nextToken());
// 			int end = Integer.parseInt(st.nextToken());
// 			Computer2606 startComputer = computerList[start];
// 			Computer2606 endComputer = computerList[end];

// 			startComputer.list[startComputer.size++] = end;
// 			endComputer.list[endComputer.size++] = start;
// 		}

// 		System.out.println(new Solution2606().getResult(computerList));
// 	}
// }

class Computer2606 {
	int size;
	int[] list = new int[100];
}

class Solution2606 {
	int front = 0;
	int[] queue = new int[101];
	int rear = 0;

	public int getResult(Computer2606[] computerList) {
		int answer = 0;
		boolean[] isSelected = new boolean[computerList.length];

		push(1);
		isSelected[1] = true;
		while(!isEmpty()) {
			int index = poll();
			Computer2606 target = computerList[index];

			answer++;

			for(int i=0; i<target.size; i++) {
				if(!isSelected[target.list[i]]) {
					push(target.list[i]);
					isSelected[target.list[i]] = true;
				}
			}
		}

		return answer-1;
	}

	public void push(int value) {
		queue[rear++] = value;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public int poll() {
		return queue[front++];
	}
}