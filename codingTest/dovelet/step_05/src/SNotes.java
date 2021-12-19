/*
 * ===문제 출처===
 * snotes, <http://220.89.64.243/30stair/snotes/snotes.php?pname=snotes>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		new SNotes().getResult();
// 	}
// }

class SNotes {

	public SNotes() {}

	public void getResult() {
		StringBuffer sb = new StringBuffer();

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<Integer> songSchedule = new ArrayList<>();

			int n = parseInt(st.nextToken()),
				q = parseInt(st.nextToken());

			for(int i=1; i<=n; i++) {
				int time = parseInt(br.readLine());

				for(int j=0; j<time; j++) {
					songSchedule.add(i);
				}
			}

			for(int i=0; i<q; i++) {
				int index = parseInt(br.readLine());
				sb.append(songSchedule.get(index)).append("\n");
			}

			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}