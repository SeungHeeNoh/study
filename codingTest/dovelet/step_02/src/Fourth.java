/*
 * ===문제 출처===
 * fourth, <http://220.89.64.243/30stair/fourth/fourth.php?pname=fourth>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		new Fourth().getFourthPint();
// 	}
// }

class Fourth {
	public Fourth() {}

	public int getIndex(int arr[], int target) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == target) return i;
		}

		return -1;
	}

	public void getFourthPint() throws IOException {
		int arrX[] = new int[2],
			arrY[] = new int[2],
			fourthX = 0, fourthY = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = parseInt(st.nextToken()),
				y = parseInt(st.nextToken());

			if(getIndex(arrX, x) < 0) {
				arrX[getIndex(arrX, 0)] = x;
			}else {
				arrX[getIndex(arrX, x)] = 0;
			}

			if(getIndex(arrY, y) < 0) {
				arrY[getIndex(arrY, 0)] = y;
			}else {
				arrY[getIndex(arrY, y)] = 0;
			}
		}
		br.close();

		for(int i=0; i<arrX.length; i++) {
			if(arrX[i] != 0) fourthX = arrX[i];
		}

		for(int i=0; i<arrY.length; i++) {
			if(arrY[i] != 0) fourthY = arrY[i];
		}

		System.out.println(fourthX + " " + fourthY);
	}
}