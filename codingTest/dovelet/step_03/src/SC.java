/*
 * ===문제 출처===
 * sc, <http://220.89.64.243/30stair/sc/sc.php?pname=sc>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new SC(input.readLine()).getScoreCount());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class SC {
	String input;

	int[] scoreArr = new int[5];

	public SC() {}

	public SC(String input) {
		this.input = input;
	}

	public String getScoreCount() {
		StringBuffer result = new StringBuffer();
		StringTokenizer st = new StringTokenizer(input);
		int score;

		result.append(st.countTokens()-1).append("\n");

		while((score = parseInt(st.nextToken())) > 0) {
			if(score >= 90) {
				scoreArr[0]++;
			}else if(score >= 80) {
				scoreArr[1]++;
			}else if(score >= 70) {
				scoreArr[2]++;
			}else if(score >= 60) {
				scoreArr[3]++;
			}else {
				scoreArr[4]++;
			}
		}

		for(int i=0; i<scoreArr.length; i++) {
			result.append(scoreArr[i]).append("\n");
		}

		return result.toString();
	}
}