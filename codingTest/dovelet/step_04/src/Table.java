/*
 * ===문제 출처===
 * table, <http://220.89.64.243/30stair/table/table.php?pname=table>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Table(parseInt(br.readLine().trim())).printTable();
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Table {
	private int n;
	private int space = 0;

	public Table() {}

	public Table(int n) {
		this.n = n;

		int temp = (int)Math.pow(n, 10);
		while(temp != 0) {
			temp /= 10;
			space++;
		}
		space++;
	}

	public int getDigit(long number) {
		int digit = 0;

		if(number >= 0) {
			while(number != 0) {
				number /= 10;
				digit++;
			}
		}

		return digit;
	}

	public String getEmptyPlace(long number) {
		StringBuilder sb = new StringBuilder();
		int digit = getDigit(number);

		for(int i=1; i<=space-digit; i++) {
			sb.append(" ");
		}

		return sb.toString();
	}

	public void printTable() {
		for(int i=0; i<=10; i++) {
			if(i == 0) System.out.print(getEmptyPlace(-1));
			else System.out.print(getEmptyPlace(i) + i);
		}
		System.out.println();

		for(int i=2; i<=n; i++) {
			System.out.print(getEmptyPlace(i) + i);

			for(int j=1; j<=10; j++) {
				long result = (long)(Math.pow(i, j));
				System.out.print(getEmptyPlace(result) + result);
			}
			System.out.println();
		}
	}
}