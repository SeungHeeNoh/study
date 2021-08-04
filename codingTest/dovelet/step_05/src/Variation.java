/*
 * ===문제 출처===
 * variation, <http://220.89.64.243/30stair/variation/variation.php?pname=variation>.
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

// 			System.out.println(new Variation(score).getVariation());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Variation {
	int[] score;

	public Variation() {}

	public Variation(int[] score) {
		this.score = score;
	}

	public String getVariation() {
		int sum = 0;
		float average = 0f,
			  variation = 0f;

		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}

		average = sum/(float)score.length;

		for(int i=0; i<score.length; i++) {
			variation += (score[i]-average)*(score[i]-average);
		}
		
		return String.format("%.2f", variation/score.length);
	}
}