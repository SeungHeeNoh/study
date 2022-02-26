/*
 * ===문제 출처===
 * 11403 경로 찾기, <https://www.acmicpc.net/problem/11403>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		Data11403[] array = new Data11403[n];
// 		StringBuilder answer = new StringBuilder(n*n*3);

// 		for(int i=0; i<n; i++) {
// 			array[i] = new Data11403();
// 			array[i].index = i;
// 		}

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
			
// 			for(int j=0; j<n; j++) {
// 				if(st.nextToken().equals("1")) {
// 					array[i].linked.add(j);
// 				}
// 			}
// 		}
		
// 		for(int i=0; i<n; i++) {
// 			boolean[] result = new boolean[n];
// 			Queue<Integer> queue = new LinkedList<>();
// 			List<Integer> list = array[i].linked;

// 			for(int j=0; j<list.size(); j++) {
// 				queue.offer(list.get(j));
// 			}

// 			while(!queue.isEmpty()) {
// 				int index = queue.poll();
// 				result[index] = true;
// 				List<Integer> targetList = array[index].linked;

// 				for(int j=0; j<targetList.size(); j++) {
// 					if(index != i && !result[targetList.get(j)]) {
// 						queue.offer(targetList.get(j));
// 					}
// 				}
// 			}

// 			for(int j=0; j<result.length; j++) {
// 				if(result[j]) {
// 					answer.append("1");
// 				} else {
// 					answer.append("0");
// 				}

// 				if(j == result.length-1) {
// 					answer.append("\n");
// 				} else {
// 					answer.append(" ");
// 				}
// 			}
// 		}

// 		System.out.println(answer);
// 	}
// }

class Data11403 {
	int index;
	List<Integer> linked = new ArrayList<>();
}