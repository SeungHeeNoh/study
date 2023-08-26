package exercise4.src.js.chapter06;
public class Exercise07 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}


class MyPoint {
	int x, y;

	MyPoint() {
		this(1, 1);
	}

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y) {
		return Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
	}
}