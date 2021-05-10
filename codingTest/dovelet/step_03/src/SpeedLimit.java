/*
 * ===문제 출처===
 * speed_limit, <http://220.89.64.243/30stair/speed_limit/speed_limit.php?pname=speed_limit>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		System.out.println(new SpeedLimit().getTotalDistance() + " miles");
// 	}
// }

class SpeedLimit {
	public SpeedLimit() {}

	public int getTotalDistance() {
		int result = 0;

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			int length = parseInt(input.readLine()),
				prevDistance = 0;

			for(int i=0; i<length; i++) {
				String[] history = input.readLine().split(" ");
				result += parseInt(history[0]) * (parseInt(history[1]) - prevDistance);
				prevDistance = parseInt(history[1]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}