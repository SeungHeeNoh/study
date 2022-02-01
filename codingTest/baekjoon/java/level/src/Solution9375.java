/*
 * ===문제 출처===
 * 9375 패션왕 신해빈, <https://www.acmicpc.net/problem/9375>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// public class Main {
// 	public static void main(String[] args)throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int test = Integer.parseInt(br.readLine());
// 		StringBuilder answer = new StringBuilder();

// 		while(test-- > 0) {
// 			int count = Integer.parseInt(br.readLine());
// 			Map<String, Integer> map = new HashMap<>();

// 			for(int i=0; i<count; i++) {
// 				String type = br.readLine().split(" ")[1];

// 				map.put(type, map.getOrDefault(type, 0)+1);
// 			}

// 			if(map.size() != 1) {
// 				int total = 1;
// 				for(String type : map.keySet()) {
// 					total *= map.get(type)+1;
// 				}

// 				count = total-1;
// 			}

// 			answer.append(count + "\n");
// 		}

// 		System.out.println(answer.toString());
// 	}
// }

class Solution9375 {
	
}