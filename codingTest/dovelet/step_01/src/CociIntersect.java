/*
 * ===문제 출처===
 * coci_intersect, <http://220.89.64.243/30stair/coci_intersect/coci_intersect.php?pname=coci_intersect>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		CociIntersect run = new CociIntersect(Integer.parseInt(br.readLine()));
// 		br.close();
// 		System.out.printf("%d", run.getIntersectionCount());
// 	}
// }

class CociIntersect {
	int n;

	public CociIntersect() {}

	public CociIntersect(int n) {
		this.n = n;
	}

	public int getIntersectionCount() {
		/*
		* 4각형 하나에 1개의 대각선이 생성되므로 n개의 꼭지점에서 4개의 사각형이 몇 개 만들어지는 지 확인해야 한다.
		* 즉, nC4일 때를 계산하면 된다.
		* */

		// 반복문을 이용하여 nC4를 계산하는 방법
		// double result = 1d;
		// for(int i=1; i<=4; i++) {
		// 	result *= (n-i+1) / (double)i;
		// }

		return n*(n-1)*(n-2)*(n-3)/(4*3*2*1);
	}
}