/*
 * ===문제 출처===
 * cube, <http://220.89.64.243/30stair/cube/cube.php?pname=cube>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// public class Main {
// 	public static void main(String[] args) {
// 		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			new Cube(Integer.parseInt(br.readLine().trim())).printCubeList();
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Cube {
	int n;

	public Cube() {}

	public Cube(int n) {
		this.n = n;
	}

	public void printCubeList() {
		for(int a=1; a<=n; a++) {
			ArrayList<Integer> list = new ArrayList<>();
			int aaa = a*a*a;

			for(int b=2; b<=a; b++) {
				for(int c=2; c<=a; c++) {
					for(int d=2; d<=a; d++) {
						if(aaa == b*b*b+c*c*c+d*d*d) {
							if(!(list.contains(b) && list.contains(c) && list.contains(d))) {
								list.add(b);
								list.add(c);
								list.add(d);

								System.out.printf("Cube = %d, Triple = (%d,%d,%d)%n", a, b, c, d);
							}
						}
					}
				}
			}
		}
	}
}