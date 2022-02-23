/*
 * ===문제 출처===
 * 1764 듣보잡, <https://www.acmicpc.net/problem/1764>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken()),
// 			m = Integer.parseInt(st.nextToken());
// 		Queue<String> dontHear = new PriorityQueue<>();
// 		Queue<String> dontSee = new PriorityQueue<>();
// 		StringBuilder answer = new StringBuilder(Math.min(m, n)*22);
// 		int count = 0;
		
// 		while(n-- > 0) {
// 			dontHear.offer(br.readLine());
// 		}

// 		while(m-- > 0) {
// 			dontSee.offer(br.readLine());
// 		}

// 		while(!dontHear.isEmpty() && !dontSee.isEmpty()) {
// 			String dontHearString = dontHear.peek();
// 			String dontSeeString = dontSee.peek();

// 			if(dontHearString.compareTo(dontSeeString) < 0) {
// 				dontHear.poll();
// 			} else if(dontHearString.compareTo(dontSeeString) > 0) {
// 				dontSee.poll();
// 			} else {
// 				count++;
// 				answer.append(dontHear.poll() + "\n");
// 				dontSee.poll();
// 			}
// 		}

// 		System.out.println(count + "\n" + answer);
// 	}
// }

class Solution1764 {
	
}