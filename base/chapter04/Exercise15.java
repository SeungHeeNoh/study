package exercise4.src.js.chapter04;

public class Exercise15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;

		int result = 0;

		while(tmp != 0) {
			System.out.println(result*10);
			result = tmp%10 + result*10;
			tmp /= 10;
		}
		if(number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");
	}
}
