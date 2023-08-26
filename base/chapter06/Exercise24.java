package exercise4.src.js.chapter06;

public class Exercise24 {
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값 : " + abs(value));

		value = -10;
		System.out.println(value+"의 절대값 : " + abs(value));
	}

	static int abs(int x) {
		return x < 0 ? -x : x;
	}
}
