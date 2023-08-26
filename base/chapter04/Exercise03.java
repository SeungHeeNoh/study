package exercise4.src.js.chapter04;

public class Exercise03 {
	public static void main(String args[]) {
		int sum = 0;
		int totalSum = 0;

		for(int i=1; i<=10; i++) {
			// for(int j=1; j<=i; j++) {
			// 	sum += j;
			// }
			sum += i;
			totalSum += sum;
		}
		System.out.println(totalSum);
	}
}
