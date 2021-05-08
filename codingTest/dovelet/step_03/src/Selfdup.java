/*
 * ===문제 출처===
 * selfdup, <http://220.89.64.243/30stair/selfdup/selfdup.php?pname=selfdup>.
 * */
// public class Main {
// 	public static void main(String[] args) {
// 		new Selfdup().printAll();
// 	}
// }

class Selfdup {
	public Selfdup() {}

	public void printAll() {
		for(int i=1; i<=10000; i++) {
			int length = String.valueOf(i).length();

			if((i*i)%Math.pow(10, length) == i) System.out.println(i);
		}
	}
}