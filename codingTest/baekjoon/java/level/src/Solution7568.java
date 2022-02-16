/*
 * ===문제 출처===
 * 7568 덩치, https://www.acmicpc.net/problem/7568>.
 * */ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		List<Data7568> dataList = new ArrayList<>();
// 		int n = Integer.parseInt(br.readLine());

// 		while(n-- > 0) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			dataList.add(new Data7568(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
// 		}

// 		System.out.println(new Solution7568().getResult(dataList));
// 	}
// }

class Data7568 {
	int x;
	int y;
	int rank;

	public Data7568(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution7568 {

	public String getResult(List<Data7568> dataList) {
		StringBuilder answer = new StringBuilder(dataList.size()*3);

		for(int i=0; i<dataList.size(); i++) {
			int count = 1;
			Data7568 targetData = dataList.get(i);

			for(int j=0; j<dataList.size(); j++) {
				if(i == j) continue;

				Data7568 compareData = dataList.get(j);
				if(compareData.y > targetData.y && compareData.x > targetData.x) {
					count++;
				}
			}

			targetData.rank = count;
		}

		for(int i=0; i<dataList.size(); i++) {
			if(i != 0) answer.append(" ");
			answer.append(dataList.get(i).rank);
		}

		return answer.toString();
	}
}