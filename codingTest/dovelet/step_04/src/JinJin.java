/*
 * ===문제 출처===
 * jinjin, <http://220.89.64.243/30stair/jinjin/jinjin.php?pname=jinjin>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			String[] studyTime = new String[parseInt(br.readLine().trim())];

// 			for(int i=0; i<studyTime.length; i++) {
// 				studyTime[i] = br.readLine();
// 			}

// 			System.out.println(new JinJin(studyTime).getUnhappyDay());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class JinJin {
	String[] studyTime;
	final static int STAND_TIME = 8;

	public JinJin() {}

	public JinJin(String[] studyTime) {
		this.studyTime = studyTime;
	}

	public int getUnhappyDay() {
		int day = 0,
			maxStudyTime = 0;

		for(int i=0; i<studyTime.length; i++) {
			StringTokenizer st = new StringTokenizer(studyTime[i]);
			int time = 0;

			while(st.hasMoreTokens()) {
				time += parseInt(st.nextToken());
			}

			if(time > STAND_TIME && maxStudyTime < time) {
				maxStudyTime = time;
				day = i+1;
			}
		}

		return day;
	}
}