/*
 * ===문제 출처===
 * reduction, <http://220.89.64.243/30stair/reduction/reduction.php?pname=reduction>.
 * */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Float.parseFloat;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new Reduction(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult());
// 	}
// }

class Reduction {
	float x1, y1, x2, y2;

	public Reduction() {}

	public Reduction(float x1, float y1, float x2, float y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public String getResult() {
		String result = "";
		float max1, min1, max2, min2;
		int ratio = 0;

		if(x1 > y1) {
			max1 = x1;
			min1 = y1;
		}else {
			max1 = y1;
			min1 = x1;
		}

		if(x2 > y2) {
			max2 = x2;
			min2 = y2;
		}else {
			max2 = y2;
			min2 = x2;
		}

		ratio = (int)((max2/max1 < min2/min1 ? max2/max1 : min2/min1)*100);
		result = (ratio > 100 ? 100 : ratio) + "%";

		return result;
	}
}