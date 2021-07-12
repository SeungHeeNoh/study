/*
 * ===문제 출처===
 * well_order, <http://220.89.64.243/30stair/well_order/well_order.php?pname=well_order>.
 * */

// public class Main {
// 	public static void main(String[] args) {
// 		WellOrder.printWellOrderNumber();
// 	}
// }

class WellOrder {
	public static void printWellOrderNumber() {
		int count = 0;

		for(int i=1; i<=9; i++) {
			for(int j=i+1; j<=9; j++) {
				for(int t=j+1; t<=9; t++) {
					if(i < j && j < t) {
						System.out.print("" + i + j + t +" ");
						if(++count%5 == 0) System.out.println();
					}
				}
			}
		}
	}
}