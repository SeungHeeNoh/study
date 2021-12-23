/*
 * ===문제 출처===
 * lotto, <http://220.89.64.243/30stair/lotto/lotto.php?pname=lotto>.
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
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int length = parseInt(st.nextToken());
// 			List<Integer> array = new ArrayList<>();

// 			while(st.hasMoreTokens()) {
// 				array.add(parseInt(st.nextToken()));
// 			}

// 			new Lotto(length, array).getList();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Lotto {
	private int length;
	private List<Integer> array;
	private final int LOTTO_LENGTH = 6;

	public Lotto() {}

	public Lotto(int length, List<Integer> array) {
		this.length = length;
		this.array = array;
	}

	public void getList() {
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<length; i++) {
			String[] subset = new String[LOTTO_LENGTH];
			subset[0] = String.valueOf(array.get(i));

			for(int j=i+1; j<length; j++) {
				subset[1] = String.valueOf(array.get(j));

				for(int k=j+1; k<length; k++) {
					subset[2] = String.valueOf(array.get(k));

					for(int t=k+1; t<length; t++) {
						subset[3] = String.valueOf(array.get(t));

						for(int l=t+1; l<length; l++) {
							subset[4] = String.valueOf(array.get(l));

							for(int m=l+1; m<length; m++) {
								subset[5] = String.valueOf(array.get(m));

								sb.append(String.join(" ", subset)).append("\n");
							}
						}
					}
				}
			}
		}

		System.out.println(sb);
	}
}