/*
 * ===문제 출처===
 * 2630 색종이 만들기, <https://www.acmicpc.net/problem/2630>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		int[][] map = new int[n][n];

// 		for(int i=0; i<map.length; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			for(int j=0; j<map.length; j++) {
// 				map[i][j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		Map<Integer, Integer> answer = new HashMap<>();
// 		answer.put(0, 0);
// 		answer.put(1, 0);

// 		Solution2630.getCount(map, 0, n-1, 0, n-1, answer);

// 		System.out.println(answer.get(0) + "\n" + answer.get(1));
// 	}
// }

class Solution2630 {
	public static void getCount(int[][] map, int x1, int x2, int y1, int y2, Map<Integer, Integer> answer) {
		if(x1 > x2 || y1 > y2) return;
		int color = map[x1][y1];
		boolean isDifferent = false;

		for(int i=x1; i<=x2 && !isDifferent; i++) {
			for(int j=y1; j<=y2; j++) {
				if(map[i][j] != color) {
					isDifferent = true;
					break;
				}
			}
		}

		if(isDifferent) {
			getCount(map, x1, x1 + (x2-x1)/2, y1, y1 + (y2-y1)/2, answer);
			getCount(map, x1 + (x2-x1)/2+1, x2, y1, y1 + (y2-y1)/2, answer);
			getCount(map, x1, x1 + (x2-x1)/2, y1 + (y2-y1)/2+1, y2, answer);
			getCount(map, x1 + (x2-x1)/2+1, x2, y1 + (y2-y1)/2+1, y2, answer);
		} else {
			answer.put(color, answer.get(color)+1);
		}
	}
}