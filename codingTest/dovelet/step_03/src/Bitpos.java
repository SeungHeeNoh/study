/*
 * ===문제 출처===
 * bit_pos, <http://220.89.64.243/30stair/bit_pos/bit_pos.php?pname=bit_pos>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
// 			System.out.println(new Bitpos(parseInt(input.readLine())).getPosition());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Bitpos {
	int n;

	public Bitpos() {}

	public Bitpos(int n) {
		this.n = n;
	}

	public String getPosition() {
		StringBuffer result = new StringBuffer();
		char[] binaryArr = Integer.toBinaryString(n).toCharArray();
		int lastIndex = binaryArr.length-1;

		for(int i=lastIndex; i>=0; i--) {
			if((binaryArr[i]-'0') == 1) {
				result.append(lastIndex - i).append(" ");
			}
		}

		return result.toString();
	}
}