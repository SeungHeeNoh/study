/*
 * ===문제 출처===
 * 1463 1로 만들기, <https://www.acmicpc.net/problem/1463>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		Queue<Solution1463> queue = new LinkedList<>();
// 		int answer = 0;
// 		int n = Integer.parseInt(br.readLine());
// 		boolean[] used = new boolean[n+1];
// 		int count = 0;
// 		int value = n;

// 		while(true) {
// 			if(!queue.isEmpty()) {
// 				Solution1463 sol = queue.poll();
// 				count = sol.count;
// 				value = sol.value;
// 			}

// 			if(value == 1) {
// 				answer = count;
// 				break;
// 			}

// 			if(!used[value]) {
// 				if(value - 1 > 1) {
// 					queue.offer(new Solution1463(count+1, value-1));
// 				}
	
// 				if(value%3 == 0) {
// 					queue.offer(new Solution1463(count+1, value/3));
// 				}
	
// 				if(value%2 == 0) {
// 					queue.offer(new Solution1463(count+1, value/2));
// 				}
// 			}
// 			used[value] = true;
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution1463 {
	int count = 0;
	int value = 0;

	public Solution1463(int count, int value) {
		this.count = count;
		this.value = value;
	}
}