/*
 * ===문제 출처===
 * blocks, <http://220.89.64.243/30stair/blocks/blocks.php?pname=blocks>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.Integer.parseInt;


// public class Main {
// 	public static void main(String[] args) {
// 		new BlockController().run();
// 	}
// }

class BlockController {
	BlockView bv = new BlockView();

	public BlockController() {}
	
	public void run() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int length = parseInt(br.readLine().trim());
			StringBuilder sb = new StringBuilder(length*10);

			for(int i=0; i<length; i++) {
				sb.append(BlockModel.getMinVolume(parseInt(br.readLine()))).append("\n");
			}

			bv.printResult(sb);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class BlockModel {
	public BlockModel() {};

	public static Set<Integer> getDivisors(int n) {
		Set<Integer> divisorSet = new HashSet<>();

		for(int i=1; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				divisorSet.add(i);
				divisorSet.add(n/i);
			}
		}

		return divisorSet;
	}

	public static long getMinVolume(int n) {
		Set<Integer> divisorSet = getDivisors(n);
		Iterator<Integer> it = divisorSet.iterator();
		long[] divisorArray = new long[divisorSet.size()];
		long minVolume = Long.MAX_VALUE;

		for(int i=0; i<divisorArray.length; i++) {
			divisorArray[i] = it.next();
		}

		for(int i=0; i<divisorArray.length; i++) {
			for(int j=0; j<divisorArray.length; j++) {
				for(int k=0; k<divisorArray.length; k++) {
					long temp = 0;

					if(divisorArray[i]*divisorArray[j]*divisorArray[k] == n && (temp = (divisorArray[i]*divisorArray[j]+divisorArray[j]*divisorArray[k]+divisorArray[k]*divisorArray[i])*2) < minVolume) {
						minVolume = temp;
					}
				}
			}
		}
		return minVolume;
	}
}

class BlockView {
	public BlockView() {};

	public void printResult(StringBuilder sb) {
		System.out.println(sb.toString());
	}
}