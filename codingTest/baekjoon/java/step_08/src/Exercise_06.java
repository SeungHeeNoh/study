/*
 * ===문제 출처===
 * 2775 부녀회장이 될테야, <https://www.acmicpc.net/problem/2775>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_06 {
	// ================== 132ms ==================
	public void run() throws IOException{
		int apt[][] = new int[15][14];
		setPeople(apt);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		while(length != 0) {
			int k = Integer.parseInt(br.readLine()),
				n = Integer.parseInt(br.readLine());
			System.out.println(apt[k][n-1]);
			length--;
		}
		br.close();
	}

	public void setPeople(int apt[][]) {
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				if(i == 0) {
					apt[i][j] = j+1;
				}else if(j == 0) {
					apt[i][j] = 1;
				}else {
					apt[i][j] = apt[i][j-1] + apt[i-1][j];
				}
			}
		}
	}
	// ================== 140ms ==================
	// public void run() throws IOException{
	// 	int apt[][] = new int[15][14];
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	int length = Integer.parseInt(br.readLine());
	// 	while(length != 0) {
	// 		int k = Integer.parseInt(br.readLine()),
	// 			n = Integer.parseInt(br.readLine());
	// 		System.out.println(setPeople(apt, k, n-1));
	// 		length--;
	// 	}
	// 	br.close();
	// }

	// public int setPeople(int apt[][], int i, int j) {
	// 	int count = 0;

	// 	if(apt[i][j] != 0) {
	// 		count = apt[i][j];
	// 	}else {
	// 		if(i == 0) {
	// 			apt[i][j] = j+1;
	// 		}else if(j == 0) {
	// 			apt[i][j] = 1;
	// 		}else {
	// 			apt[i][j] = setPeople(apt, i, j-1) + setPeople(apt, i-1, j);
	// 		}
	// 		count = apt[i][j];
	// 	}
	// 	return count;
	// }
}
