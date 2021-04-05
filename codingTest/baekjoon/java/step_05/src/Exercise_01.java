/*
 * ===문제 출처===
 * 10818 최소, 최대, <https://www.acmicpc.net/problem/10818>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;

 public class Exercise_01 {
	 public static void main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int arr[] = new int[length];
		String temp[] = br.readLine().split(" ");
		br.close();

		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}

		int max, min;
		max = min = arr[0];
		for(int i=1; i<length; i++) {
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];
		}
		System.out.printf("%d %d", min, max);

		// sort 함수 사용시 시간이 3배 더 걸림
		// Arrays.sort(arr);
		// System.out.printf("%d %d", arr[0], arr[length-1]);
	 }
 }