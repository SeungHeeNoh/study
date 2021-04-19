/*
 * ===문제 출처===
 * triangle, <http://220.89.64.243/30stair/triangle/triangle.php?pname=triangle&stair=1>.
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

// 		Triangle run = new Triangle(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.printf("%.2f", run.getArea());
// 	}
// }

class Triangle {
	int bottom, height;

	Triangle() {}

	Triangle(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}

	float getArea() {
		return (int)(bottom/2f*height*100+0.5f)/100f;
	}
}
