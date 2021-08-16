/*
 * ===문제 출처===
 * doubles, <http://220.89.64.243/30stair/doubles/doubles.php?pname=doubles>.
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
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			List<Integer> list = new ArrayList<>();

// 			while(st.countTokens() > 1) {
// 				list.add(parseInt(st.nextToken()));
// 			}

// 			System.out.println(new Doubles(list).getCount());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Doubles {
	List<Integer> list;

	public Doubles() {}

	public Doubles(List<Integer> list) {
		this.list = list;
	}

	public int getCount() {
		int count = 0;
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
			if(list.contains(it.next()*2)) {
				count++;
			}
		}

		return count;
	}
}