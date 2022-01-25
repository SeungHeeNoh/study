/*
 * ===문제 출처===
 * 1655 가운데를 말해요, <https://www.acmicpc.net/problem/1655>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2-o1);
// 		Queue<Integer> minHeap = new PriorityQueue<>();
// 		StringBuilder answer = new StringBuilder();

// 		while(n-- > 0) {
// 			if(maxHeap.size() == minHeap.size()) {
// 				maxHeap.offer(Integer.parseInt(br.readLine()));
// 			} else {
// 				minHeap.offer(Integer.parseInt(br.readLine()));
// 			}

// 			if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
// 				int max = maxHeap.poll();
// 				int min = minHeap.poll();

// 				maxHeap.offer(min);
// 				minHeap.offer(max);
// 			}

// 			answer.append(maxHeap.peek() + "\n");
// 		}

// 		System.out.println(answer.toString());
// 	}
// }

class Solution1655 {

}