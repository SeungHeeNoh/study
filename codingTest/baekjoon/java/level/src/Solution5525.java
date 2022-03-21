/*
 * ===문제 출처===
 * 5525 IOIOI, <https://www.acmicpc.net/problem/5525>.
 * */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		int m = Integer.parseInt(br.readLine());
// 		String s = br.readLine();

// 		System.out.println(new Solution5525().getAnswer(n, s));
// 	}
// }

class Solution5525 {
	Map<Integer, Integer> lengthList = new HashMap<>();

	public int getAnswer(int n, String s) {
		int answer = 0;
		int count = 0;
		int subCount = 0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'I') {
				if(subCount == 2) {
					count++;
					subCount = 1;
				} else {
					add(count);
					subCount = 1;
					count = 0;
				}
			} else {
				if(subCount == 1) {
					subCount++;
				} else {
					add(count);
					subCount = 0;
					count = 0;
				}
			}
		}
		
		add(count);

		for(Integer key : lengthList.keySet()) {
			if(key >= n) {
				answer += lengthList.get(key)*(key+1-n);
			}
		}

		return answer;
	}

	public void add(int count) {
		if(count != 0) {
			lengthList.put(count, lengthList.getOrDefault(count, 0)+1);
		}
	}
}