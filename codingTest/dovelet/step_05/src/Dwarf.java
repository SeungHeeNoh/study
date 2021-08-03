/*
 * ===문제 출처===
 * dwarf, <http://220.89.64.243/30stair/dwarf/dwarf.php?pname=dwarf>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int[] dwarfs = new int[9];

// 			for(int i=0; i<dwarfs.length; i++) {
// 				dwarfs[i] = parseInt(br.readLine().trim());
// 			}

// 			System.out.println(new Dwarf(dwarfs).findDwarf());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Dwarf {
	int[] dwarfs;

	public Dwarf() {}

	public Dwarf(int[] dwarfs) {
		this.dwarfs = dwarfs;
	}

	public String findDwarf() {
		StringBuilder sb = new StringBuilder(20);
		List<Integer> fakeDwarf = new ArrayList<>();
		int sum = 0;
		
		for(int i=0; i<dwarfs.length; i++) {
			sum += dwarfs[i];
		}

		outer: for(int i=0; i<dwarfs.length; i++) {
			for(int j=i+1; j<dwarfs.length; j++) {
				int tempSum = sum;
				tempSum -= (dwarfs[i] + dwarfs[j]);

				if(tempSum == 100) {
					fakeDwarf.add(i);
					fakeDwarf.add(j);
					break outer;
				}
			}
		}

		for(int i=0; i<dwarfs.length; i++) {
			if(fakeDwarf.indexOf(i) < 0) {
				sb.append(dwarfs[i]).append("\n");
			}
		}

		return sb.toString();
	}
}