/*
 * ===문제 출처===
 * cross, <http://220.89.64.243/30stair/cross/cross.php?pname=cross>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		new Cross().getResult();
// 	}
// }

class Cross {
	public void getResult() throws IOException{
		int x, y, count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = parseInt(st.nextToken());
		y = parseInt(st.nextToken());
		if(y < x) {
			int temp = x;
			x = y;
			y = temp;
		}

		st = new StringTokenizer(br.readLine());
		br.close();

		while(st.hasMoreTokens()) {
			int temp = parseInt(st.nextToken());
			if(x < temp && temp < y) count++;
		}
		
		if(count == 1) {
			System.out.println("cross");
		}else {
			System.out.println("not cross");
		}
	}
}