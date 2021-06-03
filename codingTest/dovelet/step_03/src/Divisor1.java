/*
 * ===문제 출처===
 * divisor1, <http://220.89.64.243/30stair/divisor1/divisor1.php?pname=divisor1>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Long.parseLong;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			System.out.println(Divisor1.getResult(parseLong(st.nextToken()), parseLong(st.nextToken())));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Divisor1 {
	public Divisor1() {}

	public static String getResult(long a, long b) {
		long start = (long)(Math.ceil(Math.sqrt(a))),
			 end = (long)(Math.floor(Math.sqrt(b))),
			 count = end - start + 1,
			 sum = 0L;

		for(long i=start; i<=end; i++) {
			sum += (long)(Math.pow(i, 2));
			sum %= 1000000003;
		}

		return count + " " + sum;
	}
}