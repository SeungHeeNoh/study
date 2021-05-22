/*
 * ===문제 출처===
 * e, <http://220.89.64.243/30stair/e/e.php?pname=e>.
 * */
// public class Main {
// 	public static void main(String[] args) {
// 		new E().printE();
// 	}
// }

class E {
	public void printE() {
		StringBuilder result = new StringBuilder();
		result.append("n").append(" ").append("e").append("\n").append("- -----------\n");
		result.append("0").append(" ").append("1").append("\n");
		result.append("1").append(" ").append("2").append("\n");
		
		double e = 2;
		for(int n=2; n<=9; n++) {
			int factorialI = 1;

			for(int i=1; i<=n; i++) {
				factorialI *= i;
			}
			e+= 1/(double)factorialI;
			result.append(n).append(" ").append(e).append("\n");
		}

		System.out.println(result.toString());
	}
}