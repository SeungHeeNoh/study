/*
 * ===문제 출처===
 * calorie, <http://220.89.64.243/30stair/calorie/calorie.php?pname=calorie>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println("Your total Calorie count is " + new Calorie(br.readLine()).getTotalCalorie() + ".");
// 		br.close();
// 	}
// }

class Calorie {
	static int menu[][] = {
		{461, 431, 420, 0},
		{130, 160, 118, 0},
		{100, 57, 70, 0},
		{167, 266, 75, 0}
	};

	String order;

	public Calorie() {}

	public Calorie(String order) {
		this.order = order;
	}

	public int getTotalCalorie() {
		int totalCalorie = 0;
		StringTokenizer st = new StringTokenizer(order);

		for(int i=0; i<menu.length; i++) {
			totalCalorie += menu[i][Integer.parseInt(st.nextToken())-1];
		}

		return totalCalorie;
	}
}