/*
 * ===문제 출처===
 * above_average, <http://220.89.64.243/30stair/above_average/above_average.php?pname=above_average>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] score = new int[parseInt(br.readLine().trim())];
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			for(int i=0; i<score.length; i++) {
// 				score[i] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new AboveAverage(score).getPercent());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class AboveAverage {
	int[] score;

	public AboveAverage() {}

	public AboveAverage(int[] score) {
		this.score = score;
	}

	public String getPercent() {
		double average = 0d;
		int sum = 0,
			count = 0;

		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}

		average = sum/(double)score.length;

		for(int i=0; i<score.length; i++) {
			if(score[i] > average) count++;
		}
		
		return String.format("%.3f%%", count/(double)score.length*100);
	}
}