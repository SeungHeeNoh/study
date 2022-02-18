/*
 * ===문제 출처===
 * 18111 마인크래프트, <https://www.acmicpc.net/problem/18111>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int m = Integer.parseInt(st.nextToken());
// 		int b = Integer.parseInt(st.nextToken());
// 		int[] list = new int[n*m];

// 		for(int i=0; i<n; i++) {
// 			st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<m; j++) {
// 				list[i*m+j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		Arrays.sort(list);
// 		System.out.println(new Solution18111().getResult(list, b));
// 	}
// }

class Solution18111 {
	public String getResult(int[] list, int b) {
		int min = list[0],
			max = list[list.length-1];
		int resultTime = Integer.MAX_VALUE;
		int prevHeight = -1;

		for(int i=min; i<=max; i++) {
			int tempB = b;
			int time = 0;

			for(int j=list.length-1; j>=0 && tempB >= 0; j--) {
				if(i < list[j]) {
					time += (list[j] - i)*2;
					tempB += (list[j] - i);
				} else if(i > list[j]) {
					time += (i - list[j]);
					tempB -= (i - list[j]);
				}
			}

			if(tempB >= 0 && resultTime >= time && prevHeight < i) {
				resultTime = time;
				prevHeight = i;
			}
		}

		return resultTime + " " + prevHeight;
	}
}