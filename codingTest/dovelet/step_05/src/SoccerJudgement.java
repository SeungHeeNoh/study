/*
 * ===문제 출처===
 * soccer_judgement, <http://220.89.64.243/30stair/soccer_judgement/soccer_judgement.php?pname=soccer_judgement>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new SoccerJudgement().getResult());
// 	}
// }

class SoccerJudgement {
	public static int getResult() {
		int index = 0;

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int country = parseInt(st.nextToken());
			double[] candidate = new double[parseInt(st.nextToken())];
			double max = 0d;

			for(int i=0; i<country; i++) {
				st = new StringTokenizer(br.readLine());
				int total = parseInt(st.nextToken()),
					vote = parseInt(st.nextToken());

				for(int j=0; j<vote; j++) {
					st = new StringTokenizer(br.readLine());
					int candidateIndex = parseInt(st.nextToken())-1;
					double voteRadio = (parseInt(st.nextToken()))/(double)total*100;

					candidate[candidateIndex] = candidate[candidateIndex] < voteRadio ? voteRadio : candidate[candidateIndex];
				}
			}

			for(int i=0; i<candidate.length; i++) {
				if(candidate[i] > max) {
					max = candidate[i];
					index = i+1;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return index;
	}
}