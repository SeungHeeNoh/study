/*
 * ===문제 출처===
 * 10814 나이순 정렬, <https://www.acmicpc.net/problem/10814>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder answer = new StringBuilder();
// 		int n = Integer.parseInt(br.readLine());
// 		Map<Integer, String> map = new HashMap<>();
// 		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int age = Integer.parseInt(st.nextToken());
// 			String name = st.nextToken();

// 			map.put(age, map.getOrDefault(age, "") + name + " " );
// 		}

// 		for(int i : map.keySet()) {
// 			minHeap.offer(i);
// 		}

// 		while(!minHeap.isEmpty()) {
// 			int age = minHeap.poll();
// 			StringTokenizer st = new StringTokenizer(map.get(age));

// 			while(st.hasMoreTokens()) {
// 				answer.append(age + " " + st.nextToken()+"\n");
// 			}
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution10814 {

}