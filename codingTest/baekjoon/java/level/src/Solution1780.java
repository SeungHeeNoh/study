/*
 * ===문제 출처===
 * 1780 종이의 개수, <https://www.acmicpc.net/problem/1780>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder answer = new StringBuilder();
// 		int n = Integer.parseInt(br.readLine());
// 		int[][] paper = new int[n][n];

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int j=0; j<n; j++) {
// 				paper[i][j] = Integer.parseInt(st.nextToken());
// 			}
// 		}

// 		int[] result = new int[3];
// 		new Solution1780().getResult(paper, 1, 1, n, n, result);

// 		for(int i=0; i<result.length; i++) {
// 			answer.append(result[i] + "\n");
// 		}

// 		System.out.print(answer.toString());
// 	}
// }

class Solution1780 {
	public void getResult(int[][] paper, int x1, int y1, int x2, int y2, int[] result) {
		if(x1 > x2 || y1 > y2) return;

		int value = paper[y1-1][x1-1];
		boolean isDifferent = false;

		for(int i=y1-1; i<y2 && !isDifferent; i++) {
			for(int j=x1-1; j<x2; j++) {
				if(value != paper[i][j]) {
					isDifferent = true;
					break;
				}
			}
		}

		if(isDifferent) {
			int xMid1 = x1 + (x2-x1)/3,
				xMid2 = x1 + (x2-x1)/3*2+1;
			int yMid1 = y1 + (y2-y1)/3,
				yMid2 = y1 + (y2-y1)/3*2+1;

			getResult(paper, x1, y1, xMid1, yMid1, result);
			getResult(paper, xMid1+1, y1, xMid2, yMid1, result);
			getResult(paper, xMid2+1, y1, x2, yMid1, result);
			getResult(paper, x1, yMid1+1, xMid1, yMid2, result);
			getResult(paper, xMid1+1, yMid1+1, xMid2, yMid2, result);
			getResult(paper, xMid2+1, yMid1+1, x2, yMid2, result);
			getResult(paper, x1, yMid2+1, xMid1, y2, result);
			getResult(paper, xMid1+1, yMid2+1, xMid2, y2, result);
			getResult(paper, xMid2+1, yMid2+1, x2, y2, result);
		} else {
			result[value+1]++;
		}
	}
}