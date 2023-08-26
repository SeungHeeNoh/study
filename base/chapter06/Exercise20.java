package exercise4.src.js.chapter06;

import java.util.Arrays;

public class Exercise20 {
	public static void main(String[] args) {
		int original[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));

		int result[] = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

	static int[] shuffle(int arr[]) {
		if(arr == null || arr.length == 0) return arr;

		for(int i=0; i<arr.length; i++) {
			int j = (int)(Math.random()*arr.length),
				temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
}