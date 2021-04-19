/*
 * ===문제 출처===
 * empty_bottle, <http://220.89.64.243/30stair/empty_bottle/empty_bottle.php?pname=empty_bottle>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		EmptyBottle run = new EmptyBottle(Integer.parseInt(br.readLine()));
// 		br.close();
// 		System.out.println(run.getResult());
// 	}
// }

class EmptyBottle {
	int bottle, count, mod, modResult;

	EmptyBottle() {}

	EmptyBottle(int bottle) {
		this.bottle = bottle;
	}

	/*
	 * 출처 : Submitted by landsknecht 
	 * 전제 조건에 누락된 부분이 있는데 왜 방치하는 거죠?

	 * 1. 이전 이벤트 참여시 남았던 병은 이번 이벤트에 합쳐서 사용 불가.
	 * (예: 13병을 샀을 때, 처음 남은 병 1개와 4개씩 해서 바꿔먹은 새로운 음료병 3를 합쳐서 바꿔먹을 수 없음.)

	 * 2. 남은 병의 갯수는 현재 수중에 남아있는 병의 갯수.(첫번째,두번째 이벤트에서 남은 병은 포함, 두번째 이벤트에서 바꿔먹은 병은 미포함.)
	*/
		String getResult() {
		count = bottle;
		count += bottle / 4;
		modResult = bottle % 4;

		mod = bottle / 4;
		count += mod / 4;
		modResult += mod % 4;

		return count + " " + modResult;
	}
}
