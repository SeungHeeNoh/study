/*
 * ===문제 출처===
 * example_switch, <http://220.89.64.243/30stair/example_switch/example_switch.php?pname=example_switch>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		System.out.println(new Month(parseInt(st.nextToken()), parseInt(st.nextToken())).getResult());
// 	}
// }

class Month {
	int y, m;

	public Month() {}

	public Month(int y, int m) {
		this.y = y;
		this.m = m;
	}

	public int getResult() {
		int result = 0;
		switch(m) {
			case 1 :
			case 3 : 
			case 5 :
			case 7 :
			case 8 :
			case 10 : 
			case 12 : 
				result = 31; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				 result = 30; break;
			case 2 : {
				if((y%4==0&&y%100!=0) || y%400==0) {
					result = 29;
				}else {
					result = 28;
				}
				break;
			}
		}
		return result;
	}
}