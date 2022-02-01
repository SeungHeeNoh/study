/*
 * ===문제 출처===
 * 2578 빙고, <https://www.acmicpc.net/problem/2578>.
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
// 		Map<Integer, Point> bingo = new HashMap<>();
// 		int diagonal = 0,
// 			reverseDiagonal = 0;
// 		int[] vertical = new int[5];
// 		int[] horizontal = new int[5];
// 		int totalBingo = 0;
// 		int count = 0;

// 		for(int i=1; i<=5; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int j=1; j<=5; j++) {
// 				bingo.put(Integer.parseInt(st.nextToken()), new Point(j, i));
// 			}
// 		}

// 		outer : for(int i=0; i<5; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<5; j++) {
// 				count++;
// 				Point point = bingo.get(Integer.parseInt(st.nextToken()));

// 				if(point.x == point.y) {
// 					diagonal++;

// 					if(diagonal == 5) totalBingo++;
// 				}

// 				if(point.x + point.y == 6) {
// 					reverseDiagonal++;

// 					if(reverseDiagonal == 5) totalBingo++;
// 				} 

// 				if(++vertical[point.x-1] == 5) totalBingo++;
// 				if(++horizontal[point.y-1] == 5) totalBingo++;

// 				if(totalBingo >= 3) {
// 					System.out.println(count);
// 					break outer;
// 				}
// 			}

// 		}
// 	}
// }

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution2578 {
	
}