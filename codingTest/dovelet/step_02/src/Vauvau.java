/*
 * ===문제 출처===
 * vauvau, <http://220.89.64.243/30stair/vauvau/vauvau.php?pname=vauvau>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		new Vauvau().getResult();
// 	}
// }

class Vauvau {
	public Vauvau() {}

	public void getResult() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = parseInt(st.nextToken()),
			b = parseInt(st.nextToken()),
			c = parseInt(st.nextToken()),
			d = parseInt(st.nextToken());	
		String p[] = br.readLine().split(" ");
		br.close();

		for(int i=0; i<p.length; i++) {
			int time = parseInt(p[i]),
				dog1 = time % (a+b),
				dog2 = time % (c+d),
				count = 0;

			if(0 < dog1 && dog1 <= a) count++;
			if(0 < dog2 && dog2 <= c) count++;

			System.out.println(count == 2 ? "both" : (count == 1 ? "one" : "none"));
		}
	}
}