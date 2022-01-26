/*
 * ===문제 출처===
 * 1021 회전하는 큐, <https://www.acmicpc.net/problem/1021>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int[] deleteArray = new int[Integer.parseInt(st.nextToken())];
// 		st = new StringTokenizer(br.readLine());
// 		int front = 1;
// 		int answer = 0;

// 		for(int i=0; i<deleteArray.length; i++) {
// 			deleteArray[i] = Integer.parseInt(st.nextToken());
// 		}

// 		for(int i=0; i<deleteArray.length; i++) {
// 			int rear = deleteArray[i];

// 			answer += Math.min(n-Math.max(front, rear)+Math.min(front, rear), Math.max(front, rear) - Math.min(front, rear));
// 			n--;

// 			for(int j=i+1; j<deleteArray.length; j++) {
// 				deleteArray[j] += deleteArray[j] > rear ? -1 : 0;
// 			}

// 			front = rear;
// 		}
	
// 		System.out.println(answer);
// 	}
// }

class Solution1021 {

}