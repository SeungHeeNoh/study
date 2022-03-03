/*
 * ===문제 출처===
 * 1166 선물, <https://www.acmicpc.net/problem/1166>.
 * */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int l = Integer.parseInt(st.nextToken());
// 		int w = Integer.parseInt(st.nextToken());
// 		int h = Integer.parseInt(st.nextToken());

// 		System.out.println(new Solution1166().getResult(n, l, w, h));
// 	}
// }

class Solution1166 {
	public double getResult(int n, int l, int w, int h) {
		double left = 0;
		double min = l > w ? w > h ? h : w : l < h ? l : h;
		double right = min;

		for(int i=0; i<10000 && left < right; i++) {
			double mid = left + (right-left)/2;

			if(mid <= min && (long)(l/mid) * (long)(w/mid) * (long)(h/mid) >= n) {
				left = mid;
			} else {
				right = mid;
			}
		}

		return left;
	}
}