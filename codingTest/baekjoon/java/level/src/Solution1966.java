/*
 * ===문제 출처===
 * 1966 프린터 큐, <https://www.acmicpc.net/problem/1966>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = Integer.parseInt(br.readLine());
// 		StringBuilder answer = new StringBuilder();

// 		while(test-- > 0) {
// 			Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> (o2-o1));
// 			List<Integer> list = new ArrayList<>();
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int n = Integer.parseInt(st.nextToken());
// 			int m = Integer.parseInt(st.nextToken());
// 			boolean[] isPrinted = new boolean[n];
// 			int count = 0;
// 			int index = 0;
// 			st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<n; i++) {
// 				int input = Integer.parseInt(st.nextToken());

// 				maxHeap.offer(input);
// 				list.add(input);
// 			}

// 			while(true) {
// 				count++;
				
// 				while(isPrinted[index] || list.get(index) < maxHeap.peek()) {
// 					index = (index+1)%n;
// 				}

// 				if(index == m) break;

// 				isPrinted[index] = true;
// 				maxHeap.poll();
// 				index = (index+1)%n;
// 			}

// 			answer.append(count + "\n");
// 		}

// 		System.out.println(answer.toString());
// 	}
// }

class Solution1966 {
	
}