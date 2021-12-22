/*
 * ===문제 출처===
 * tiger, <http://220.89.64.243/30stair/tiger/tiger.php?pname=tiger>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int days = parseInt(st.nextToken()),
// 				total = parseInt(st.nextToken());

// 			System.out.println(new Tiger(days, total).getCounts());
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Equation {
	private int x;
	private int y;

	public Equation() {
		this.x = 0;
		this.y = 0;
	}

	public Equation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class Tiger {
	private int days;
	private int total;

	public Tiger() {}

	public Tiger(int days, int total) {
		this.days = days;
		this.total = total;
	}

	public Equation getEquation(int days) {
		Map<Integer, Equation> equationMap = new HashMap<>();

		for(int i=1; i<= days; i++) {
			if(i == 1) {
				Equation eq = new Equation();
				eq.setX(1);

				equationMap.put(i, eq);
			} else if(i == 2) {
				Equation eq = new Equation();
				eq.setY(1);

				equationMap.put(i, eq);
			} else {
				int x = equationMap.get(i-1).getX() + equationMap.get(i-2).getX();
				int y = equationMap.get(i-1).getY() + equationMap.get(i-2).getY();
	
				equationMap.put(i, new Equation(x, y));
			}
		}

		return equationMap.get(days);
	}

	public String getCounts() {
		StringBuffer sb = new StringBuffer();
		boolean flag = false;
		Equation eq = getEquation(days);
		int x = eq.getX(),
			y = eq.getY(),
			first = 0,
			second = 1;

		while(!flag) {
			if((total - y*second)%x == 0) {
				first = (total - y*second)/x;

				if(first <= second) {
					flag = true;

					sb.append(first).append("\n").append(second);
				} else {
					second++;
				}
			} else {
				second++;
			}
		}

		return sb.toString();
	}
}