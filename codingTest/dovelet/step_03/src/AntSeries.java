/*
 * ===문제 출처===
 * antseries, <http://220.89.64.243/30stair/antseries/antseries.php?pname=antseries>.
 * */
import java.io.*;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new AntSeries(input.readLine()).getNextSequence());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class AntSeries {
	String input;

	public AntSeries() {}

	public AntSeries(String input) {
		this.input = input;
	}

	public String getNextSequence() {
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(input);
		char ch = ' ',
			 prevCh = ' ';
		int count = 0;

		while(st.hasMoreTokens()) {
			ch = st.nextToken().charAt(0);

			if((count != 0 && ch != prevCh) || ch == '0') {
				result.append(count).append(" ").append(prevCh).append(" ");
				count = 0;
			}
			count++; 
			prevCh = ch;
		}

		return result.toString();
	}
}