/*
 * ===문제 출처===
 * 1715 카드 정렬하기, <https://www.acmicpc.net/problem/1715>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int n = Integer.parseInt(br.readLine());
// 			PriorityQueue<Integer> heap = new PriorityQueue<>();

// 			for(int i=0; i<n; i++) {
// 				heap.offer(Integer.parseInt(br.readLine()));
// 			}

// 			System.out.println(Solution1715.getResult(heap));
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Solution1715 {
	public static int getResult(PriorityQueue<Integer> heap) {
		int result = 0;

		while(heap.size() > 1) {
			int temp = heap.poll() + heap.poll();
			result += temp;
			heap.offer(temp);
		}
		return result;
	}
}