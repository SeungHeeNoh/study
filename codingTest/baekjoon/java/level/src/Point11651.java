/*
 * ===문제 출처===
 * 11651 좌표 정렬하기 2, <https://www.acmicpc.net/problem/11651>.
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
// 		PriorityQueue<Point11651> minHeap = new PriorityQueue<>((o1, o2) -> {
// 			if(o1.y == o2.y) {
// 				return o1.x - o2.x;
// 			}

// 			return o1.y - o2.y;
// 		});
// 		StringBuilder answer = new StringBuilder(n*5);

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			minHeap.offer(new Point11651(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
// 		}

// 		while(!minHeap.isEmpty()) {
// 			answer.append(minHeap.poll().toString() + "\n");
// 		}

// 		System.out.println(answer);
// 	}
// }

class Point11651 {
	int x;
	int y;

	public Point11651(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}