/*
 * ===문제 출처===
 * amicable, <http://220.89.64.243/30stair/amicable/amicable.php?pname=amicable>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Amicable(parseInt(br.readLine().trim())).printAmicable();
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Amicable {
	private int n;

	public Amicable() {}

	public Amicable(int n) {
		this.n = n;
	}

	public int getDivisorSum(int number) {
		int sum = 0;

		for(int i = 1; i<=(int)(Math.sqrt(number)); i++) {
			if(number % i == 0) {
				int divisor = number / i;
				sum += i + (divisor != number ? divisor : 0);
			}
		}

		return sum;
	}

	public HashMap getAmicaMap() {
		HashMap amicableMap = new HashMap();

		for(int i=220; i<=n; i++) {
			int tempFriendlyNumber = getDivisorSum(i),
				friendlyNumberDivisorSum = getDivisorSum(tempFriendlyNumber);

			if(tempFriendlyNumber != i && friendlyNumberDivisorSum == i) {
				int key = i,
					value = tempFriendlyNumber;

				if(i > tempFriendlyNumber) {
					key = tempFriendlyNumber;
					value = i;
				}

				if(!amicableMap.containsKey(key)) {
					amicableMap.put(key, new HashSet<Integer>());
				}
				HashSet<Integer> subSet = (HashSet<Integer>)amicableMap.get(key);
				subSet.add(value);
			}
		}

		return amicableMap;
	}

	public void printAmicable() {
		HashMap amicableMap = getAmicaMap();

		ArrayList<Integer> keyList = new ArrayList<>(amicableMap.keySet());
		Collections.sort(keyList);

		for(int key : keyList) {
			System.out.print(key + " ");
			ArrayList<Integer> subList = new ArrayList<>((HashSet<Integer>)amicableMap.get(key));
			Collections.sort(subList);

			for(int friendlyNumber : subList) {
				System.out.print(friendlyNumber + " ");
			}
			System.out.println();
		}
	}
}