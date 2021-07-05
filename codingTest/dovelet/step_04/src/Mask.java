/*
 * ===문제 출처===
 * mask, <http://220.89.64.243/30stair/mask/mask.php?pname=mask>.
 * */

// public class Main {
// 	public static void main(String[] args) {
// 		Mask.printABC();
// 	}
// }

class Mask {
	public static void printABC() {
		for(int i=1; i<=9; i++) {
			System.out.println('3' + String.valueOf(i) + '9');
		}
	}
}