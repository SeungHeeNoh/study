/*
 * ===문제 출처===
 * area, <http://220.89.64.243/30stair/area/area.php?pname=area>.
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

// 		Area run = new Area(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getSize());
// 	}
// }

class Area {
	int x, y;

	Area(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getSize() {
		return x*y;
	}
}