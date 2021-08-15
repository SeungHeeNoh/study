/*
 * ===문제 출처===
 * dup, <http://220.89.64.243/30stair/dup/dup.php?pname=dup>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Dup(br.readLine()).printResult();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Dup {
	static boolean[] IS_EXIST = new boolean[21];
	String input;

	public Dup() {}

	public Dup(String input) {
		this.input = input;
	}

	public void printResult() {
		StringTokenizer st = new StringTokenizer(input);
		StringBuilder sb = new StringBuilder(st.countTokens()*2);
		List<Integer> inputList = new ArrayList<>();

		while(st.hasMoreTokens()) {
			int number = parseInt(st.nextToken());

			if(!IS_EXIST[number+10]) {
				inputList.add(number);
				IS_EXIST[number+10] = true;
			} else {
				int index = inputList.indexOf(number);
				if(index >= 0) {
					inputList.remove(index);
				}
			}
		}

		Iterator<Integer> it = inputList.iterator();

		while(it.hasNext()) {
			sb.append(it.next()).append(" ");
		}

		System.out.println(sb.toString());
	}
}