/*
 * ===문제 출처===
 * 7569 토마토, <https://www.acmicpc.net/problem/7569>.
 * */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int m = Integer.parseInt(st.nextToken());
// 		int n = Integer.parseInt(st.nextToken());
// 		int h = Integer.parseInt(st.nextToken());
// 		int[][][] box = new int[h][n][m];
// 		boolean[][][] selectedPoint = new boolean[h][n][m];
// 		Queue<BoxPoint7569> queue = new LinkedList<>();
// 		int totalCount = 0;
// 		int count = 0;
// 		int day = 0;

// 		for(int i=0; i<box.length; i++) {
// 			for(int j=0; j<n; j++) {
// 				st = new StringTokenizer(br.readLine());
// 				for(int k=0; k<m; k++) {
// 					box[i][j][k] = Integer.parseInt(st.nextToken());

// 					if(box[i][j][k] == 1) {
// 						selectedPoint[i][j][k] = true;
// 						queue.offer(new BoxPoint7569(k, j, i));
// 						totalCount++;
// 						count++;
// 					}

// 					if(box[i][j][k] == 0) {
// 						totalCount++;
// 					}
// 				}
// 			}
// 		}

		
// 		while(!queue.isEmpty() && totalCount != count) {
// 			Queue<BoxPoint7569> tommarowBox = new LinkedList<>();

// 			while(!queue.isEmpty()) {
// 				BoxPoint7569 boxPoint = queue.poll();
// 				int x = boxPoint.x;
// 				int y = boxPoint.y;
// 				int z = boxPoint.z;

// 				if(z+1 < h && box[z+1][y][x] == 0 && !selectedPoint[z+1][y][x]) {
// 					tommarowBox.offer(new BoxPoint7569(x, y, z+1));
// 					selectedPoint[z+1][y][x] = true;
// 					count++;
// 				}

// 				if(z-1 >= 0 && box[z-1][y][x] == 0 && !selectedPoint[z-1][y][x]) {
// 					tommarowBox.offer(new BoxPoint7569(x, y, z-1));
// 					selectedPoint[z-1][y][x] = true;
// 					count++;
// 				}

// 				if(x+1 < m && box[z][y][x+1] == 0 && !selectedPoint[z][y][x+1]) {
// 					tommarowBox.offer(new BoxPoint7569(x+1, y, z));
// 					selectedPoint[z][y][x+1] = true;
// 					count++;
// 				}

// 				if(x-1 >= 0 && box[z][y][x-1] == 0 && !selectedPoint[z][y][x-1]) {
// 					tommarowBox.offer(new BoxPoint7569(x-1, y, z));
// 					selectedPoint[z][y][x-1] = true;
// 					count++;
// 				}
				 
// 				if(y+1 < n && box[z][y+1][x] == 0 && !selectedPoint[z][y+1][x]) {
// 					tommarowBox.offer(new BoxPoint7569(x, y+1, z));
// 					selectedPoint[z][y+1][x] = true;
// 					count++;
// 				}

// 				if(y-1 >= 0 && box[z][y-1][x] == 0 && !selectedPoint[z][y-1][x]) {
// 					tommarowBox.offer(new BoxPoint7569(x, y-1, z));
// 					selectedPoint[z][y-1][x] = true;
// 					count++;
// 				}
// 			}

// 			queue = tommarowBox;
// 			day++;
// 		}

// 		if(totalCount != count) {
// 			day = -1;
// 		}

// 		System.out.println(day);
// 	}
// }


class BoxPoint7569 {
	int x;
	int y;
	int z;

	public BoxPoint7569(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}