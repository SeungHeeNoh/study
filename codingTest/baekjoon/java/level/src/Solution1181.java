/*
 * ===문제 출처===
 * 1181 단어 정렬, <https://www.acmicpc.net/problem/1181>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		PriorityQueue<String> minHeap = new PriorityQueue<>((o1, o2) -> {
// 			if(o1.length() == o2.length()) {
// 				return o1.compareTo(o2);
// 			}
// 			return o1.length() - o2.length();
// 		});
// 		int n = Integer.parseInt(br.readLine());
// 		StringBuffer answer = new StringBuffer();
// 		String prev = "";

// 		for(int i=0; i<n; i++) {
// 			minHeap.offer(br.readLine());
// 		}

// 		while(!minHeap.isEmpty()) {
// 			String now = minHeap.poll();

// 			if(!now.equals(prev)) {
// 				answer.append(now+ "\n");
// 			}
// 			prev = now;
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution1181 {
	
}