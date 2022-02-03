/*
 * ===문제 출처===
 * 1629 곱셈, <https://www.acmicpc.net/problem/1629>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
		
// 		long a = Long.parseLong(st.nextToken()),
// 			 b = Long.parseLong(st.nextToken()),
// 			 c = Long.parseLong(st.nextToken());
		
// 		System.out.println(new Solution1629().getAnswer(a, b, c));
// 	}
// }

class Solution1629 {
	public long getAnswer(long a, long b, long c) {
		Map<Long, Long> map = new HashMap<>();
		long index = 1;
		long answer = a%c;
		map.put(index, answer);

		while(index * 2 <= b) {
			answer = (map.get(index)%c*map.get(index)%c)%c;
			map.put(index*2, answer);
			index *= 2;
		}

		b -= index;

		while(b != 0) {
			if(b >= index) {
				answer = (answer%c * map.get(index)%c)%c;
				b -= index;
			} else {
				index /= 2;
			}
		}

		return answer;
	}
}