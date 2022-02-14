/*
 * ===문제 출처===
 * 1931 회의실 배정, <https://www.acmicpc.net/problem/1931>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		Queue<MeetingTime> minHeap = new PriorityQueue<>((o1, o2) -> {
// 			if(o1.endTime == o2.endTime) {
// 				return o1.startTime - o2.startTime;
// 			}

// 			return o1.endTime - o2.endTime;
// 		});

// 		for(int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			minHeap.offer(new MeetingTime(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
// 		}

// 		System.out.println(new Solution1931().getResult(minHeap));
// 	}
// }

class MeetingTime {
	int startTime;
	int endTime;

	public MeetingTime(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
}

class Solution1931 {
	public int getResult(Queue<MeetingTime> minHeap) {
		int answer = 1;
		MeetingTime meetingTime = minHeap.poll();

		while(!minHeap.isEmpty()) {
			if(meetingTime.endTime > minHeap.peek().startTime) {
				minHeap.poll();
			} else {
				meetingTime = minHeap.poll();
				answer++;
			}
		}

		return answer;
	}
}