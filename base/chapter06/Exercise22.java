package exercise4.src.js.chapter06;

public class Exercise22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));

		str = "123o";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));

		str = "";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));
	}

	static boolean isNumber(String str) {
		if(str==null || str.length() == 0) return false;

		for(int i=0; i<str.length(); i++) {
			if(!('0' <= str.charAt(i) && str.charAt(i) <= '9')) {
				return false;
			}
		}
		return true;
	}
}
