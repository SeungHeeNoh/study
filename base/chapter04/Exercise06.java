package exercise4.src.js.chapter04;

public class Exercise06 {
	public static void main(String args[]) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 6) {
					System.out.printf("(%d, %d)%n", i, j);
				}
			}
		}
	}
}
