/*
 * ===문제 출처===
 * 11399 ATM, <https://www.acmicpc.net/problem/11399>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		String input = br.readLine();

// 		System.out.println(new Solution11399().getResult(input));
// 	}
// }

class Solution11399 {
	public int getResult(String input) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		StringTokenizer st = new StringTokenizer(input);
		int sum = 0;
		int answer = 0;
	
		while(st.hasMoreTokens()) {
			minHeap.offer(Integer.parseInt(st.nextToken()));
		}
		
		while(!minHeap.isEmpty()) {
			sum += minHeap.poll();
			answer += sum;
		}

		return answer;
	}
}