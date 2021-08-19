/*
 * ===문제 출처===
 * shuffle, <http://220.89.64.243/30stair/shuffle/shuffle.php?pname=shuffle>.
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
// 			StringBuilder sb = new StringBuilder(50);
// 			String line = "";

// 			while(!(line=br.readLine()).equals("0 0")) {
// 				StringTokenizer st = new StringTokenizer(line);
// 				int n = parseInt(st.nextToken()),
// 					r = parseInt(st.nextToken());
// 				String[] shuffle = new String[r];

// 				for(int i=0; i<shuffle.length; i++) {
// 					shuffle[i] = br.readLine();
// 				}

// 				sb.append(new Shuffle(n, shuffle).shuffleDeck()).append("\n");
// 			}

// 			System.out.println(sb);
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Shuffle {
	List<Integer> deck;
	String[] shuffle;

	public Shuffle() {}

	public Shuffle(int n, String[] shuffle) {
		deck = new ArrayList<>(n);

		for(int i=n; i>0; i--) {
			deck.add(i);
		}

		this.shuffle = shuffle;
	}

	public int shuffleDeck() {
		List<Integer> moveCards;

		for(int i=0; i<shuffle.length; i++) {
			StringTokenizer st = new StringTokenizer(shuffle[i]);
			int p = parseInt(st.nextToken())-1,
				c = parseInt(st.nextToken());
			moveCards = new ArrayList<>();

			for(int j=0; j<p; j++) {
				moveCards.add(deck.get(0));
				deck.remove(0);
			}

			deck.addAll(c, moveCards);
		}
		
		return deck.get(0);
	}
}