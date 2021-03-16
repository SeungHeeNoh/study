/*
	단조증가 부분수열의 길이를 동적 프로그래믕올 차는 알고리즘을 고안하라.
	<1, 10, 5, 20, 15, 10, 30, 49, 25, 35, 66, 75, 44>
*/

#include<stdio.h>
#define max(a,b) (((a)>(b)) ? (a) : (b))

void init_map(int map[], int length) {
	for (int i=0; i<length; i++) {
		map[i] = -1;
	}
}

int lis_length(int array[], int map[], int idx, int arr_len) {
	int length = 0;

	if (map[idx] != -1) {
		return map[idx];
	}

	for (int i=idx+1; i<arr_len; i++) {
		if (array[idx] < array[i]) {
			length = max(length, lis_length(array, map, i, arr_len) + 1);
		}
	}
	map[idx] = length;
	return length;
}

int get_lis(int array[], int input_length) {
	int array_length = input_length+1;
	int map[array_length], arr[array_length];

	arr[0] = -1000000;
	for (int i=1; i<array_length; i++) {
		arr[i] = array[i-1];
	}

	init_map(map, array_length);
	return lis_length(arr, map, 0, array_length);
}

int main() {
	int test1[13] = {1, 10, 5, 20, 15, 10, 30, 49, 25, 35, 66, 75, 44};
	int test2[9] = {9, 5, 2, 8, 7, 3, 1, 6, 4};
	int test3[6] = {1000, 10, 100, 20, 30, 40};

	printf("test1's lis : %d\n", get_lis(test1, sizeof(test1)/sizeof(int)));
	printf("test2's lis : %d\n", get_lis(test2, sizeof(test2)/sizeof(int)));
	printf("test3's lis : %d\n", get_lis(test3, sizeof(test3)/sizeof(int)));

	return 0;
}