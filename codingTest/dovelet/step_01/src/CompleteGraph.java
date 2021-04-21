/*
 * ===문제 출처===
 * x_length, <http://220.89.64.243/30stair/x_length/x_length.php?pname=x_length>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 		CompleteGraph run = new CompleteGraph(Integer.parseInt(br.readLine()));
// 		br.close();
// 		System.out.printf("%d", run.getEdgeCount());
// 	}
// }

class CompleteGraph {
	int v;

	public CompleteGraph() {}

	public CompleteGraph(int v) {
		this.v = v;
	}

	public int getEdgeCount() {
		return v * (v-1) / 2;
	}
}