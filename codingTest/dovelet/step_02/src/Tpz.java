/*
 * ===문제 출처===
 * tpz, <http://220.89.64.243/30stair/tpz/tpz.php?pname=tpz>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String person = br.readLine();
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new Tpz(parseInt(person), parseInt(st.nextToken()), parseInt(st.nextToken()), parseInt(st.nextToken())).getResult());
// 	}
// }

class Tpz {
	int person;
	int t, p, z;

	public Tpz() {}

	public Tpz(int person, int t, int p, int z) {
		this.person = person;
		this.t = t;
		this.p = p;
		this.z = z;
	}

	public String getResult() {
		int min = person - (person*3 - t - p - z),
			max = Math.min(Math.min(t, p), z);

		min = min < 0 ? 0 : min;
		return max + " " + min;
	}
}