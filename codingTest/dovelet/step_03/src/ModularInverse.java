/*
 * ===문제 출처===
 * modular_inverse, <http://220.89.64.243/30stair/modular_inverse/modular_inverse.php?pname=modular_inverse>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(input.readLine());
// 			System.out.println(new ModularInverse(parseInt(st.nextToken()), parseInt(st.nextToken())).getN());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class ModularInverse{
	int x, m;

	public ModularInverse() {}

	public ModularInverse(int x, int m) {
		this.x = x;
		this.m = m;
	}

	public String getN() {
		String result = "No such integer exists.";
		int first = (x*1)%m;

		for(int n=2, mod = 1; mod != first || mod == 1; n++) {
			mod = (x*n)%m;
			if(mod == 1) result = String.valueOf(n);
		}

		return result;
	}
}