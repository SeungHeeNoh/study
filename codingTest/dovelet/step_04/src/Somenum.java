/*
 * ===문제 출처===
 * somenum, <http://220.89.64.243/30stair/somenum/somenum.php?pname=somenum>.
 * */
// public class Main {
// 	public static void main(String[] args) {
// 		Somenum.printSomenum();
// 	}
// }

class Somenum {
	public static void printSomenum() {
		outer : for(int i=1; i<=10000; i++) {
			for(int j=1; j<=(int)Math.sqrt(i); j++) {
				if(i%j != 0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
}