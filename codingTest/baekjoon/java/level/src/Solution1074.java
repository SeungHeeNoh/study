/*
 * ===문제 출처===
 * 1074 Z, <https://www.acmicpc.net/problem/1074>.
 * */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int width = (int)Math.pow(2, n);
// 		int r = Integer.parseInt(st.nextToken())+1;
// 		int c = Integer.parseInt(st.nextToken())+1;
// 		int answer = new Solution1074(c, r).getAnswer(1, width, 1, width)-1;

// 		System.out.println(answer);
// 	}
// }

class Solution1074 {
	private int c;
	private int r;

	public Solution1074(int c, int r) {
		this.c = c;
		this.r = r;
	}

	public int getAnswer(int columnStart, int columnEnd, int rowStart, int rowEnd) {
		int answer = 0;
		int blockSize = (columnEnd-columnStart+1)*(columnEnd-columnStart+1)/4;

		answer += getTotalCount(blockSize, 0, columnStart, (columnStart+columnEnd)/2, rowStart, (rowStart+rowEnd)/2);
		answer += getTotalCount(blockSize, 1, (columnStart+columnEnd)/2+1, columnEnd, rowStart, (rowStart+rowEnd)/2);
		answer += getTotalCount(blockSize, 2, columnStart, (columnStart+columnEnd)/2, (rowStart+rowEnd)/2+1, rowEnd);
		answer += getTotalCount(blockSize, 3, (columnStart+columnEnd)/2+1, columnEnd, (rowStart+rowEnd)/2+1, rowEnd);

		return answer;
	}

	public int getTotalCount(int blockSize, int blockCount, int columnStart, int columnEnd, int rowStart, int rowEnd) {
		int count = getCount(columnStart, columnEnd, rowStart, rowEnd);

		return count != 0 ? blockSize * blockCount + count : 0;
	}

	public int getCount(int columnStart, int columnEnd, int rowStart, int rowEnd) {
		int count = 0;

		if(columnStart <= c && c <= columnEnd && rowStart <= r && r <= rowEnd) {
			if(columnEnd == columnStart) {
				count = 1;
			} else {
				count = getAnswer(columnStart, columnEnd, rowStart, rowEnd);
			}
		}

		return count;
	}
}