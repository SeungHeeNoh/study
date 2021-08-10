/*
 * ===문제 출처===
 * rsq, <http://220.89.64.243/30stair/rsq/rsq.php?pname=rsq>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] sequence = new int[parseInt(br.readLine().trim())];
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int[][] problem = new int[parseInt(br.readLine().trim())][2];
			
// 			for(int i=0; i<sequence.length; i++) {
// 				sequence[i] = parseInt(st.nextToken());
// 			}

// 			for(int i=0; i<problem.length; i++) {
// 				st = new StringTokenizer(br.readLine());

// 				problem[i][0] = parseInt(st.nextToken());
// 				problem[i][1] = parseInt(st.nextToken());
// 			}

// 			System.out.println(new Rsq(sequence, problem).getResult());

// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Rsq {
	int[] sequence;
	int[] memoization;
	int[][] problem;

	public Rsq() {}

	public Rsq(int[] sequence, int[][] problem) {
		this.sequence = sequence;
		this.problem = problem;
		setMemoization();
	}

	private void setMemoization() {
		memoization = new int[sequence.length+1];
		memoization[0] = 0;

		for(int i=1; i<memoization.length; i++) {
			memoization[i] = memoization[i-1] + sequence[i-1];
		}
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder(5*problem.length);

		for(int i=0; i<problem.length; i++) {
			if(problem[i][0] == problem[i][1]) {
				sb.append(sequence[problem[i][0]-1]);
			} else {
				sb.append(memoization[problem[i][1]]-memoization[problem[i][0]-1]);
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}