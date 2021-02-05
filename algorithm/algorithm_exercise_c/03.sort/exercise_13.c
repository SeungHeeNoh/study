/*
	정렬할 원소들이 모두 -k와 k 사이의 정수이고 k가 O(n)일 경우에도 여전히 계수정렬을 사용하여 선형시간에 정렬할 수 있다.
*/
#include<stdio.h>
#define MAX_SIZE 10

void displayArr(int arr[], int length) {
	for (int i = 0; i < length; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void changeBase(int arr[], int k) {
	for (int i = 0; i < MAX_SIZE; i++) {
		arr[i] += k;
	}
}

void getOriginal(int arr[], int k) {
	for (int i = 0; i < MAX_SIZE; i++) {
		arr[i] -= k;
	}
}

void countingSort(int problem[], int result[], int k) {
	int temp[MAX_SIZE*2] = {0, };

	changeBase(problem, k);
	for (int i = 0; i < MAX_SIZE; i++) {
		temp[problem[i]] += 1;
	}

	for (int i = 1; i < MAX_SIZE*2; i++) {
		temp[i] = temp[i-1] + temp[i];
	}

	for (int i = 0; i < MAX_SIZE; i++) {
		result[temp[problem[i]]-1] = problem[i]-k;
		temp[problem[i]]--;
	}
}

int main() {
	int k = 5;
	int problem[MAX_SIZE] = {-1, -3, -3, -2, 2, 2, 1, 4, 5, -5};
	int result[MAX_SIZE];

	countingSort(problem, result, k);
	displayArr(result, MAX_SIZE);
	return 0;
}