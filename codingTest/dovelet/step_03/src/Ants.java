/*
 * ===문제 출처===
 * ants, <http://220.89.64.243/30stair/ants/ants.php?pname=ants>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new Ants().getMaxMinTime());
// 	}
// }

class Ants {
	public Ants() {}

	public String getMaxMinTime() {
		int length = 0,
			antCount = 0,
			max = 0,
			mid = 0,
			min = Integer.MAX_VALUE,
			centerPoint = 0;

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			length = parseInt(st.nextToken());
			antCount = parseInt(st.nextToken());
			centerPoint = length/2;
			String line;

			while((line = input.readLine()) != null) {
				int point = parseInt(line);

				if(min > point) {
					min = point;
				}

				if(max < point) {
					max = point;
				}
	
				if(Math.abs(centerPoint-point) < Math.abs(centerPoint-mid)) {
					mid = point;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		return (mid > centerPoint ? length-mid : mid) + " " + (length-min > max ? length-min : max);
	}
}