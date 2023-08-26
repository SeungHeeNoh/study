package exercise4.src.js.chapter04;

public class Exercise12 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				int x = j+1 + (i-1)/3*3;
				int y = i%3 == 0 ? 3 : i%3;
				System.out.printf("%d*%d=%d\t", x, y, x*y);
			}
			System.out.println();
			if(i%3 == 0) System.out.println();
		}
	}
}
