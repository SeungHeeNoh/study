/*
 * ===문제 출처===
 * choice, <http://220.89.64.243/30stair/choice/choice.php?pname=choice>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int length = parseInt(br.readLine());
// 			int[] inputArray = new int[length];

// 			for(int i=0; i<length; i++) {
// 				inputArray[i] = parseInt(br.readLine());
// 			}

// 			System.out.println(new Choice(inputArray).getPrintResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Choice {
	private int[] inputArray;

	public Choice() {}

	public Choice(int[] inputArray) {
		this.inputArray = inputArray;
	}

	public String getPrintResult() {
		StringBuffer sb = new StringBuffer() ;
		boolean[] flagArray = new boolean[inputArray.length];
		List<Integer> resultList = new ArrayList<>();
		

		for(int i=0; i<inputArray.length; i++) {
			if(flagArray[i]) continue;

			int count = 0;
			int index = inputArray[i];
			List<Integer> tempList = new ArrayList<>();

			while(inputArray[index-1] != i+1 && !flagArray[index-1] && count < inputArray.length) {
				tempList.add(index-1);
				index = inputArray[index-1];
				count++;
			}

			if(!flagArray[index-1] && count < inputArray.length) {
				if(!flagArray[i]) {
					flagArray[i] = true;
					resultList.add(inputArray[i]);
				}

				for(int j=0; j<tempList.size(); j++) {
					flagArray[tempList.get(j)] = true;
					resultList.add(inputArray[tempList.get(j)]);
				}

				if(!flagArray[index-1]) {
					flagArray[index-1] = true;
					resultList.add(inputArray[index-1]);
				}
			}
		}

		Collections.sort(resultList);
		sb.append(resultList.size()).append("\n");
		sb.append(resultList.stream().map(String::valueOf).collect(Collectors.joining("\n")));

		return sb.toString();
	}
}