/*
 * ===문제 출처===
 * 1011 Fly me to the Alpha Centauri, <https://www.acmicpc.net/problem/1011>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_09 {
	// ================== 시간초과 ==================
	// public void run() throws IOException{
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	StringBuffer sb = new StringBuffer();
	// 	int length = Integer.parseInt(br.readLine());

	// 	while(length > 0) {
	// 		StringTokenizer st = new StringTokenizer(br.readLine());
	// 		int x = Integer.parseInt(st.nextToken()),
	// 			y = Integer.parseInt(st.nextToken())-1,
	// 			count = 1;
	// 		int sum = 0, target = y-x;
		
	// 		for(int i=1;; i++) {
	// 			sum += i;
	// 			if(sum > target) break;
	// 			count++;
	// 		}
	// 		sb.append(count).append("\n");
	// 		length--;
	// 	}
	// 	br.close();
	// 	System.out.println(sb);
	// }
	// ================== 160ms ==================
	// public void run() throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	StringBuffer sb = new StringBuffer();
	// 	int length = Integer.parseInt(br.readLine());

	// 	while(length > 0) {
	// 		StringTokenizer st = new StringTokenizer(br.readLine());
	// 		int x = Integer.parseInt(st.nextToken()),
	// 			y = Integer.parseInt(st.nextToken()),
	// 			distance = y-x;
	// 		long n = 1L,
	// 			 count = 1;
				

	// 		while(true) {
	// 			if(n*n <= distance && distance < (n+1)*(n+1)) {
	// 				distance -= n*n;
	// 				count = 2*n-1;
	// 				break;
	// 			}
	// 			n++;
	// 		}
	// 		while(distance > 0){
	// 			if(distance<n) n--;
	// 			distance -= n;
	// 			count++;
	// 		}
			
	// 		sb.append(count).append("\n");
	// 		length--;
	// 	}
	// 	br.close();
	// 	System.out.println(sb);
	// }

	// ================== 128ms ==================
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int length = Integer.parseInt(br.readLine());

		while(length > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()),
				y = Integer.parseInt(st.nextToken()),
				distance = y-x,
				n = (int)Math.sqrt(distance),
				count = 0;
			
			if(n == Math.sqrt(distance)) {
				// Math.sqrt(distance) == Math.pow(n, 2) => count = 2*n-1;
				count = 2*n-1;
			}else if(distance <= n*n+n) {
				// Math.pow(n, 2) < Math.sqrt(distance) <= Math.pow(n, 2)+n => count = 2*n;
				count = 2*n;
			}else {
				//Math.pow(n, 2)+n < Math.sqrt(distance) < Math.pow(n+1, 2) => count = 2*n+1
				count = 2*n+1;
			}
			
			sb.append(count).append("\n");
			length--;
		}
		br.close();
		System.out.println(sb);
	}
}
