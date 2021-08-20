/*
 * ===문제 출처===
 * linear, <http://220.89.64.243/30stair/linear/linear.php?pname=linear>.
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
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			List<Integer> sequence = new ArrayList<>(parseInt(br.readLine()));
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			while(st.hasMoreTokens()) {
// 				sequence.add(parseInt(st.nextToken()));
// 			}

// 			System.out.println(new Linear(sequence).getCountPair());

// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Linear {
	List<Integer> sequence;
	final static int PAIR_COUNT = 3;

	public Linear() {}

	public Linear(List<Integer> sequence) {
		this.sequence = sequence;
	}

	public int getCountPair(int index, int n, int gap) {
		int count = 1,
			pair = 0, 
			prev = n;

		for(int i=index+1; i<sequence.size() && count < PAIR_COUNT; i++) {
			if(sequence.contains(prev+gap)) {
				prev = prev+gap;
				count++;
			} else {
				break;
			}
		}

		if(count == PAIR_COUNT) {
			pair = 1;
		}

		return sequence.get(sequence.size()-1) - n - gap <= 0 ? 0 : pair + getCountPair(index, n, gap+1);
	}

	public int getCountPair() {
		int count = 0;

		for(int i=0; i<sequence.size(); i++) {
			count += getCountPair(i, sequence.get(i), 1);
		}

		return count;
	}
}