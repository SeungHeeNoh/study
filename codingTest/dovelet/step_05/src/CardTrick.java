/*
 * ===문제 출처===
 * card_trick, <http://220.89.64.243/30stair/card_trick/card_trick.php?pname=card_trick>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

// class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int length = parseInt(br.readLine());

// 			System.out.println(new CardTrick(length).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class CardTrick {
	private int length; 

	public CardTrick() {}

	public CardTrick(int length) {
		this.length = length;
	}

	public String getResult() {
		int[] cardArray = new int[length];
		int number = 1,
			index = -1;

		while(number <= length) {
			int count=0;

			while(count <= number) {
				index = index+1 == length ? 0 : index+1;

				if(cardArray[index] == 0) {
					count++;
				}
			}
			cardArray[index] = number++;
		}

		return Arrays.stream(cardArray).mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}