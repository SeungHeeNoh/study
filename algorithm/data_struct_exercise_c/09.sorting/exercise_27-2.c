/*
	quick_sort 함수가 이와 같은 3-중간값 방법을 사용하도록 수정하여라.
*/
#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define SWAP(a, b) {int t = a; a = b; b = t;}
#define MAX_SIZE 8

void display(int arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void medianSort(int arr[], int left, int mid, int right) {
	if (arr[left] > arr[mid]) SWAP(arr[left], arr[mid]);
	if (arr[mid] > arr[right]) SWAP(arr[right], arr[mid]);
	if (arr[left] > arr[mid]) SWAP(arr[left], arr[mid]);
}

void quickSortV2(int arr[], int left, int right) {
	if (left < right) {
		int mid = left + (right - left)/2;
		medianSort(arr, left, mid, right);

		if (right - left > 2) {
			int pivot, low, high;

			pivot = arr[mid];
			SWAP(arr[mid], arr[right-1]);
			low = left, high = right-1;

			while(1) {
				while(arr[++low] < pivot && low <= right) {}
				while(arr[--high] > pivot && high >= left) {}
				if (high <= low) break;
				SWAP(arr[low], arr[high]);
			}

			SWAP(arr[low], arr[right-1]);
			quickSortV2(arr, left, low-1);
			quickSortV2(arr, low+1, right);
		}
	}
}

int partiton(int arr[], int left, int right) {
	int pivot = arr[left], low = left, high = right+1;

	do {
		while(arr[++low] < pivot && low <= right){}
		while(arr[--high] > pivot && high >= left){}
		if (high <= low) break;
		SWAP(arr[low], arr[high]);
	} while(1);

	SWAP(arr[left], arr[high]);

	return high;
}

void quickSortV1(int arr[], int left, int right) {
	if (left < right) {
		int q = partiton(arr, left, right);
		quickSortV1(arr, left, q);
		quickSortV1(arr, q+1, right);
	}
}

int main() {
	printf("------test1------\n");
	int test1_1[MAX_SIZE], test1_2[MAX_SIZE];
	srand(time(NULL));
	for (int i = 0; i < MAX_SIZE; i++) {
		int randomNum = rand() % 100 + 1;
		test1_1[i] = randomNum;
		test1_2[i] = randomNum;
	}
	printf("Before quicksort : ");
	display(test1_1);

	printf("After quicksortV1 : ");
	quickSortV1(test1_1, 0, MAX_SIZE-1);
	display(test1_1);

	printf("After quicksortV2 : ");
	quickSortV2(test1_2, 0, MAX_SIZE-1);
	display(test1_2);
	printf("\n");

	printf("------test2------\n");
	int test2_1[MAX_SIZE], test2_2[MAX_SIZE];
	for (int i = 0; i < MAX_SIZE; i++) {
		int randomNum = rand() % 100 + 1;
		test2_1[i] = randomNum;
		test2_2[i] = randomNum;
	}
	printf("Before quicksort : ");
	display(test2_1);

	printf("After quicksortV1 : ");
	quickSortV1(test2_1, 0, MAX_SIZE-1);
	display(test2_1);

	printf("After quicksortV2 : ");
	quickSortV2(test2_2, 0, MAX_SIZE-1);
	display(test2_2);
	printf("\n");

	// printf("------test3------\n");
	// int test3_1[MAX_SIZE], test3_2[MAX_SIZE];
	// for (int i = 0; i < MAX_SIZE; i++) {
	// 	test3_1[i] = (i+1) * 10;
	// 	test3_2[i] = (i+1) * 10;
	// }
	// printf("Before quicksort : ");
	// display(test3_1);

	// printf("After quicksortV1 : ");
	// quickSortV1(test3_1, 0, MAX_SIZE-1);
	// display(test3_1);

	// printf("After quicksortV2 : ");
	// quickSortV2(test3_2, 0, MAX_SIZE-1);
	// display(test3_2);
	// printf("\n");

	printf("------test3------\n");
	int test3_1[MAX_SIZE], test3_2[MAX_SIZE];
	for (int i = 0; i < MAX_SIZE; i++) {
		test3_1[i] = 10;
		test3_2[i] = 10;
	}
	printf("Before quicksort : ");
	display(test3_1);

	printf("After quicksortV1 : ");
	quickSortV1(test3_1, 0, MAX_SIZE-1);
	display(test3_1);

	printf("After quicksortV2 : ");
	quickSortV2(test3_2, 0, MAX_SIZE-1);
	display(test3_2);
	printf("\n");

	return 0;
}