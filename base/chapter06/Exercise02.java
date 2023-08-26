package exercise4.src.js.chapter06;

public class Exercise02 {
	public static void main(String args[]) {
		StudentCard card1 = new StudentCard(3, false);
		StudentCard card2 = new StudentCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
class StudentCard{
	int num;
	boolean isKwang;

	StudentCard() {
		this(1, true);
	}

	StudentCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}