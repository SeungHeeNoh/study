/*
 * ===문제 출처===
 * bank1, <http://220.89.64.243/30stair/bank1/bank1.php?pname=bank1>.
 * */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			int count = parseInt(br.readLine());
// 			List<Guest> guestList = new ArrayList<>();

// 			for(int i=0; i<count; i++) {
// 				StringTokenizer st = new StringTokenizer(br.readLine());

// 				int no = parseInt(st.nextToken()),
// 					arrivalTime = parseInt(st.nextToken()),
// 					takenTime = parseInt(st.nextToken());

// 				guestList.add(new Guest(no, arrivalTime, takenTime));
// 			}
			
// 			System.out.printf("%.1f\n", new Bank(guestList).getResult());
// 		} catch (NumberFormatException e) {
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Guest {
	private int no;
	private int arrivalTime;
	private int takenTime;

	public Guest() {}

	public Guest(int no, int arrivalTime, int takenTime) {
		this.no = no;
		this.arrivalTime = arrivalTime;
		this.takenTime = takenTime;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getTakenTime() {
		return this.takenTime;
	}

	public void setTakenTime(int takenTime) {
		this.takenTime = takenTime;
	}
}

class Bank {
	private List<Guest> guestList;

	public Bank() {}

	public Bank(List<Guest> guestList) {
		this.guestList = guestList;
	}

	public float getResult() {
		float result = 0f;
		int now = 0;

		for(int i=0; i<guestList.size(); i++) {
			Guest guest = guestList.get(i);

			if(guest.getArrivalTime() < now) {
				result += now - guest.getArrivalTime();
				now += guest.getTakenTime();
			} else {
				now = guest.getArrivalTime() + guest.getTakenTime();
			}
		}

		result /= guestList.size();

		return result;
	}
}