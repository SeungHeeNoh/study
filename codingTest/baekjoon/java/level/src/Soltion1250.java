/*
 * ===문제 출처===
 * 1250 색칠된 공들, <https://www.acmicpc.net/problem/1250>.
 * */ 
import static java.lang.Integer.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws NumberFormatException, IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int length = parseInt(st.nextToken());
// 		int index = parseInt(st.nextToken())-1;
// 		int result = 0;
// 		Queue<Data> maxHeap = new PriorityQueue<>((o1, o2) -> {
// 																if(o1.value == o2.value) {
// 																	return o1.index - o2.index;
// 																} else {
// 																	return o2.value - o1.value;
// 																}
// 															});
// 		String input = br.readLine();

// 		int count = 1;
// 		int startIndex = 0;
// 		char prevChar = input.charAt(0);
// 		for(int i=1; i<length; i++) {
// 			if(prevChar == input.charAt(i)) {
// 				count++;
// 			} else {
// 				maxHeap.offer(new Data(startIndex, count, startIndex <= index && index <= i ? true : false));
// 				count = 1;
// 				startIndex = i;
// 				prevChar = input.charAt(i);
// 			}
// 		}

// 		while(!maxHeap.isEmpty()) {
// 			result++;
// 			if(maxHeap.poll().isInIndex) break;
// 		}
		
// 		System.out.println(result);
// 	}
// }

class Data {
	int index;
	int value;
	boolean isInIndex;

	public Data(int index, int value, boolean isInIndex) {
		this.index = index;
		this.value = value;
		this.isInIndex = isInIndex;
	}
}

class Soltion1250 {
	
}