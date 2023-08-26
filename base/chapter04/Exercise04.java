package exercise4.src.js.chapter04;

public class Exercise04 {
	public static void main(String args[]) {
		int sum = 0;
		int i=1, s=1;

		while(true) {
			sum += i*s;
			if (sum >= 100) break;
			i++;
			s=-s;
		}
		System.out.println(i);
	}
}
