/*
 * ===문제 출처===
 * coci_faktor, <http://220.89.64.243/30stair/coci_faktor/coci_faktor.php?pname=coci_faktor>.
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

// 		CociFaktor run = new CociFaktor(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getX());
// 	}
// }

class CociFaktor {
	int y, z;
	public CociFaktor() {}

	public CociFaktor(int y, int z) {
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return y * (z-1) + 1;
	}
}