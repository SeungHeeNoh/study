/*
 * ===문제 출처===
 * fill, <http://220.89.64.243/30stair/fill/fill.php?pname=fill>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new Fill(Float.parseFloat(st.nextToken()), Float.parseFloat(st.nextToken()), Float.parseFloat(st.nextToken())).getResult());
// 		br.close();

// 	}
// }

class Fill {
	float speed, weight, power;

	public Fill() {}

	public Fill(float speed, float weight, float power) {
		this.speed = speed;
		this.weight = weight;
		this.power = power;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();

		if(speed <= 4.5 && weight >= 150 && power >= 200) {
			sb.append("Wide Receiver");
		}

		if(speed <= 6.0 && weight >= 300 && power >= 500) {
			if(!sb.toString().equals("")) {
				sb.append(" ");
			}
			sb.append("Lineman");
		}

		if(speed <= 5.0 && weight >= 200 && power >= 300) {
			if(!sb.toString().equals("")) {
				sb.append(" ");
			}
			sb.append("Quarterback");
		}

		if(sb.toString().equals("")) sb.append("No positions");

		return sb.toString();
	}
}