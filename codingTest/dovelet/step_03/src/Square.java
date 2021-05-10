/*
 * ===문제 출처===
 * square, <http://220.89.64.243/30stair/square/square.php?pname=square>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Square(parseInt(input.readLine().trim()), parseInt(input.readLine().trim())).getResult());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Square {
	int m, n;

	public Square() {}

	public Square(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public String getResult() {
		StringBuffer result = new StringBuffer();
		int sum = 0, min = 0;

		for(int i=m; i<=n; i++) {
			if(i % Math.sqrt(i) == 0) {
				sum+= i;
				if(min == 0) {
					min = i;
				}
			}
		}

		if(sum != 0) {
			result.append(sum).append("\n").append(min);
		}else {
			result.append(-1);
		}
		
		return result.toString();
	}
}