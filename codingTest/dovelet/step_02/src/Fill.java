/*
 * ===문제 출처===
 * fill, <http://220.89.64.243/30stair/fill/fill.php?pname=fill>.
 * */
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Float.*;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		System.out.println(new Fill(parseFloat(st.nextToken()), parseFloat(st.nextToken()), parseFloat(st.nextToken())).getResult());
// 		br.close();
	}
}

class Fill {
	private float speed, weight, power;

	private Player[] playerArr = {
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
			if(speed <= playerArr[i].getSpeed() && weight >= playerArr[i].getWeight() && power >= playerArr[i].getPower()) {
				if(!sb.toString().equals("")) {
					sb.append(" ");
				}
				sb.append(playerArr[i].getPosition());
			}
		}

		if(sb.toString().equals("")) sb.append("No positions");

		return sb.toString();
	}
}

class Player {
	private String position;
	private float speed, weight, power;

	Player() {}

	Player(String position, float speed, float weight, float power) {
		this.position = position;
		this.speed = speed;
		this.weight = weight;
		this.power = power;
	}

	public String getPosition() {
		return position;
	}

	public float getSpeed() {
		return speed;
	}

	public float getWeight() {
		return weight;
	}

	public float getPower() {
		return power;
	}
}