/*
 * ===문제 출처===
 * dice1, <http://220.89.64.243/30stair/dice1/dice1.php?pname=dice1>.
 * */
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			Dice2.printDiceSet(parseInt(br.readLine().trim()));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Dice2 {
	static final int DICE = 6;
	public static void printDiceSet(int n) {
		TreeSet<DiceSet> diceHashSet = new TreeSet<>();

		for(int i=1; i <= DICE; i++) {
			for(int j=1; j<=DICE; j++) {
				if(i+j == n) {
					if(i <= j) diceHashSet.add(new DiceSet(i, j));
					else diceHashSet.add(new DiceSet(j, i));
				}
			}
		}

		Iterator<DiceSet> it = diceHashSet.iterator();
		while(it.hasNext()) {
			System.out.println((DiceSet)it.next());
		}
	}
}

class DiceSet implements Comparable<DiceSet>{
	int i, j;

	public DiceSet(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof DiceSet)) {
			return false;
		}
		DiceSet diceSet = (DiceSet) o;
		return i == diceSet.i && j == diceSet.j;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i, j);
	}

	@Override
	public String toString() {
		return i + " " + j;
	}

	@Override
	public int compareTo(DiceSet o) {
		return i - o.i;
	}
}