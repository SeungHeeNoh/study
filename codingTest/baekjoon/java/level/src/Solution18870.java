/*
 * ===문제 출처===
 * 18870 좌표 압축, <https://www.acmicpc.net/problem/18870>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		String input = br.readLine();
// 		StringTokenizer st = new StringTokenizer(input);
// 		int[] array = new int[st.countTokens()];
// 		int[] origin = new int[st.countTokens()];
// 		Map<Integer, Integer> map = new HashMap<>();
// 		StringBuilder answer = new StringBuilder(input.length());
// 		int count = 0;

// 		for(int i=0; st.hasMoreTokens(); i++) {
// 			array[i] = origin[i] = Integer.parseInt(st.nextToken());
// 		}

// 		Arrays.sort(array);

// 		for(int i : array) {
// 			if(map.get(i) == null) {
// 				map.put(i, count++);
// 			}
// 		}

// 		for(int i=0; i<origin.length; i++) {
// 			answer.append(map.get(origin[i]));

// 			if(i != origin.length-1) answer.append(" ");
// 		}

// 		System.out.println(answer);
// 	}
// }

class Solution18870 {
	
}