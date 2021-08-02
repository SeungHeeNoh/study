/*
 * ===문제 출처===
 * pir, <http://220.89.64.243/30stair/pir/pir.php?pname=pir>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			List<Integer> inputList = new ArrayList<>();

// 			while(st.hasMoreTokens()) {
// 				inputList.add(parseInt(st.nextToken()));
// 			}

// 			System.out.println(new Pir(inputList).getMaxSum());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Pir {
	List<Integer> inputList;

	public Pir() {}

	public Pir(List<Integer> inputList) {
		this.inputList = inputList;
	}

	public String getMaxSum() {
		StringBuilder sb = new StringBuilder();
		int first = 0,
			second = 0;

		Collections.sort(inputList, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});

		first = inputList.get(0);
		second = inputList.get(1);

		sb.append(first+second).append("\n").append(first).append(" ").append(second);

		return sb.toString();
	}
}