/*
 * ===문제 출처===
 * hay, <http://220.89.64.243/30stair/hay/hay.php?pname=hay>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[] cost = new int[parseInt(st.nextToken())];
// 			int[][] section = new int[parseInt(st.nextToken())][2];

// 			for(int i=0; i<cost.length; i++) {
// 				cost[i] = parseInt(br.readLine().trim());
// 			}

// 			for(int i=0; i<section.length; i++) {
// 				st = new StringTokenizer(br.readLine());

// 				section[i][0] = parseInt(st.nextToken());
// 				section[i][1] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new Hay(cost, section).getSectionSum());

// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Hay {
	int[] cost;
	int[][] section;

	public Hay() {}

	public Hay(int[] cost, int[][] section) {
		this.cost = cost;
		this.section = section;
	}

	public String getSectionSum() {
		StringBuilder sb = new StringBuilder(section.length*100);

		for(int i=0; i<section.length; i++) {
			int sum = 0;

			for(int j=section[i][0]-1; j<section[i][1]; j++) {
				sum += cost[j];
			}

			sb.append(sum).append("\n");
		}

		return sb.toString();
	}
}