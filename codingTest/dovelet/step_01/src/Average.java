/*
 * ===문제 출처===
 * average, <http://220.89.64.243/30stair/average/average.php?pname=average>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Average run = new Average(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%.2f", run.getAverage());
// 	}
// }

class Average {
	int num1, num2, num3, num4;
	final float SIZE = 4f;
	final float DECIMAL_POINT = 100f;

	Average() {}

	Average(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	float getAverage() {
		return (int)((num1 + num2 + num3 + num4) / SIZE * DECIMAL_POINT + 0.5f) / DECIMAL_POINT;
	}
}