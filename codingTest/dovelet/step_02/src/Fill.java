/*
 * ===문제 출처===
 * fill, <http://220.89.64.243/30stair/fill/fill.php?pname=fill>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Float.*;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new Fill(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult());
// 		br.close();
// 	}
// }

class Fill {
	float speed, weight, power;

	Player playerArr[] = {
		new Player("Wide Receiver", 4.5f, 150f, 200f),
		new Player("Lineman", 6.0f, 300f, 500f),
		new Player("Quarterback", 5.0f, 200f, 300f)
	};

	public Fill() {}

	public Fill(float speed, float weight, float power) {
		this.speed = speed;
		this.weight = weight;
		this.power = power;
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<playerArr.length; i++) {
			if(speed <= playerArr[i].speed && weight >= playerArr[i].weight && power >= playerArr[i].power) {
				if(!sb.toString().equals("")) {
					sb.append(" ");
				}
				sb.append(playerArr[i].position);
			}
		}

		if(sb.toString().equals("")) sb.append("No positions");

		return sb.toString();
	}
}

class Player {
	String position;
	float speed, weight, power;

	Player() {}

	Player(String position, float speed, float weight, float power) {
		this.position = position;
		this.speed = speed;
		this.weight = weight;
		this.power = power;
	}
}