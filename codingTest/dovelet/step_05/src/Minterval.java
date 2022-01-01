/*
 * ===문제 출처===
 * minterval, <http://220.89.64.243/30stair/minterval/minterval.php?pname=minterval>.
 * */
import static java.lang.Integer.parseInt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			String line = "";
// 			List<Integer> arrayList = new ArrayList<>();

// 			while(!(line = br.readLine()).equals("0")) {
// 				arrayList.add(parseInt(line));
// 			}
			
// 			System.out.println(new Minterval(arrayList).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Minterval {
	List<Integer> arrayList;

	public Minterval() {}

	public Minterval(List<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	public int getResult() {
		int max = Integer.MIN_VALUE;
		int[][] map = new int[arrayList.size()][arrayList.size()];

		for(int i=0; i<map.length; i++) {
			for(int j=i; j<map.length; j++) {
				map[i][j] = (j==i ? 0 : map[i][j-1]) + arrayList.get(j);
				if(max < map[i][j]) max = map[i][j];
			}
		}

		return max;
	}
}