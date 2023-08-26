package exercise4.src.js.chapter06;

import java.util.Arrays;

public class Exercise23 {
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{}));
	}

	static int max(int arr[]) {
		int max = 0;

		if(arr == null || arr.length == 0) {
			max = -999999;
		}else {
			for(int tmp : arr) {
				if(tmp > max) max = tmp;
			}
		}

		return max;
	}
}