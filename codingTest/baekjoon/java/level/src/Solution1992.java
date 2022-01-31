/*
 * ===문제 출처===
 * 1992 쿼드트리, <https://www.acmicpc.net/problem/1992>.
 * */ 
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		int[][] map = new int[n][n];
// 		for(int i=0; i<n; i++) {
// 			String input = br.readLine();

// 			for(int j=0; j<n; j++) {
// 				map[i][j] = input.charAt(j) - '0';
// 			}
// 		}

// 		System.out.println(getPoint(0, n-1, 0, n-1, map));
// 	}

// 	public static String getPoint(int y1, int y2, int x1, int x2, int[][] map) {
// 		if(y1 > y2 && x1 > x2) return "";
// 		StringBuilder result = new StringBuilder();

// 		int value = map[y1][x1];
// 		boolean flag = false;

// 		for(int i=y1; i<=y2 && !flag; i++) {
// 			for(int j=x1; j<=x2; j++) {
// 				if(value != map[i][j]) {
// 					flag = true;
// 					break;
// 				}
// 			}
// 		}

// 		if(!flag) {
// 			result.append(value);
// 			return result.toString();
// 		} else {
// 			result.append("(");
// 			result.append(getPoint(y1, (y1+y2)/2, x1, (x1+x2)/2, map));
// 			result.append(getPoint(y1, (y1+y2)/2, (x1+x2)/2+1, x2, map));
// 			result.append(getPoint((y1+y2)/2+1, y2, x1, (x1+x2)/2, map));
// 			result.append(getPoint((y1+y2)/2+1, y2, (x1+x2)/2+1, x2, map));
// 			result.append(")");
// 			return result.toString();
// 		}
// 	}
// }

class Solution1992 {

}