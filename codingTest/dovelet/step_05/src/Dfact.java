/*
 * ===문제 출처===
 * dfact, <http://220.89.64.243/30stair/dfact/dfact.php?pname=dfact>.
 * */
import static java.lang.String.valueOf;

// public class Main {
// 	public static void main(String[] args) {
// 		Dfact.printDfact();
// 	}
// }

class Dfact {
	final static int START = 10;
	final static int END = 1000001;
	static int[] table = new int[10];

	static{
		table[0] = 1;

		setTable();
	}

	static void setTable() {
		for(int i=1; i<table.length; i++) {
			table[i] = table[i-1]*i;
		}
	}

	public static void printDfact() {
		StringBuffer sb = new StringBuffer(5000);

		for(int i=START; i<END; i++) {
			char[] arr = valueOf(i).toCharArray();
			int sum = 0;

			for(int j=0; j<arr.length && sum <= i; j++) {
				sum += table[arr[j] - '0'];
			}

			if(sum == i) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb.toString());
	}
}