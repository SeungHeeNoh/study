package exercise4.src.js.chapter06;

public class Exercise06 {
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, x));
	}
}
