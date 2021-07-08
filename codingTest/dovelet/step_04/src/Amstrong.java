/*
 * ===문제 출처===
 * amstrong, <http://220.89.64.243/30stair/amstrong/amstrong.php?pname=amstrong>.
 * */

// public class Main {
// 	public static void main(String[] args) {
// 		new Amstrong().printAmstrongs();
// 	}
// }

class Amstrong {
	public void printAmstrongs() {
		for(int i=1; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					if(i*100+j*10+k == i*i*i+j*j*j+k*k*k) {
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
	}
}