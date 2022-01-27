/*
 * ===문제 출처===
 * 5430 AC, <https://www.acmicpc.net/problem/5430>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder answer = new StringBuilder();
// 		int test = Integer.parseInt(br.readLine());

// 		while(test-- > 0) {
// 			String input = br.readLine();
// 			int n = Integer.parseInt(br.readLine());
// 			int[] array = new int[n];
// 			StringTokenizer st = new StringTokenizer(br.readLine().replace("[", "").replace("]", ""), ",");
// 			int front = 0;
// 			int rear = n-1;
// 			boolean isReverse = false;
// 			boolean isError = false;

// 			for(int i=0; i<n; i++) {
// 				array[i] = Integer.parseInt(st.nextToken());
// 			}

// 			for(int i=0; i<input.length(); i++) {
// 				if(input.charAt(i) == 'R') {
// 					int temp = front;
// 					front = rear;
// 					rear = temp;
// 					isReverse = !isReverse;
// 				} else {
// 					if(isReverse) {
// 						if(front < rear) {
// 							isError = true;
// 							break;
// 						}

// 						front--;
// 					} else {
// 						if(rear < front) {
// 							isError = true;
// 							break;
// 						}

// 						front++;
// 					}
// 				}
// 			}

// 			if(isError) {
// 				answer.append("error\n");
// 			} else {
// 				answer.append("[");

// 				if(isReverse) {
// 					for(int i = front; i >= rear; i--) {
// 						answer.append(array[i]);
// 						if(i != rear) answer.append(",");
// 					}
// 				} else {
// 					for(int i=front; i<=rear; i++) {
// 						answer.append(array[i]);
// 						if(i!=rear) answer.append(",");
// 					}
// 				}

// 				answer.append("]\n");
// 			}
// 		}
	
// 		System.out.println(answer.toString());
// 	}
// }

class Solution5430 {

}