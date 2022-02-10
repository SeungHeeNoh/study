/*
 * ===문제 출처===
 * 11650 좌표 정렬하기, <https://www.acmicpc.net/problem/11650>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		PriorityQueue<Point11650> minHeap = new PriorityQueue<>((o1, o2) -> {
// 			if(o1.x == o2.x) {
// 				return o1.y - o2.y;
// 			}
// 			return o1.x - o2.x;
// 		});
// 		int n = Integer.parseInt(br.readLine());
// 		StringBuilder answer = new StringBuilder(n*3);

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			minHeap.offer(new Point11650(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
// 		}

// 		while(!minHeap.isEmpty()) {
// 			answer.append(minHeap.poll().toString() + "\n");
// 		}

// 		System.out.println(answer);
// 	}
// }

class Point11650 {
	int x;
	int y;

	public Point11650(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}