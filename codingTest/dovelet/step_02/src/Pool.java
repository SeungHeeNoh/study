/*
 * ===문제 출처===
 * pool, <http://220.89.64.243/30stair/pool/pool.php?pname=pool>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new Pool().getResult());
// 	}
// }

class Pool {
	public int getArea(int x1, int y1, int x2, int y2) {
		int b = x1 >= 0 && x2 <= 0 || x1 <= 0 && x2 >= 0 ? (Math.abs(x1) + Math.abs(x2)) : (Math.max(Math.abs(x1), Math.abs(x2)) - Math.min(Math.abs(x1), Math.abs(x2))),
			h = y1 >= 0 && y2 <= 0 || y1 <= 0 && y2 >= 0 ? (Math.abs(y1) + Math.abs(y2)) : (Math.max(Math.abs(y1), Math.abs(y2)) - Math.min(Math.abs(y1), Math.abs(y2)));

		return b*h;
	}
	public int getResult(){
		int result = -1;
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = parseInt(br.readLine());
			
			if(n != 1) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x1 = parseInt(st.nextToken()),
					y1 = parseInt(st.nextToken()),
					x2 = 1001,
					y2 = 1001;
	
				for(int i=0; i<n-1; i++) {
					st = new StringTokenizer(br.readLine());
					int tempX = parseInt(st.nextToken()),
						tempY = parseInt(st.nextToken());

					x2 = x1 == tempX ? x2 : tempX;
					y2 = y1 == tempY ? y2 : tempY;
				}

				if(x2 != 1001 && y2 != 1001) {
					result = getArea(x1, y1, x2, y2);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}