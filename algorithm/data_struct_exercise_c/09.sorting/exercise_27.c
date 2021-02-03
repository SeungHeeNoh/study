/*
	quick_sort 함수가 이와 같은 3-중간값 방법을 사용하도록 수정하여라.
*/
#include<stdio.h>

#define MAX_SIZE 8
#define SWAP(a, b) {int t = a; a = b; b = t;}

void display(int arr[]) {
	for(int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void medianSort(int arr[], int left, int right, int mid) {
	if (arr[left] > arr[mid]) SWAP(arr[left], arr[mid]);
	if (arr[mid] > arr[right]) SWAP(arr[right], arr[mid]);
	if (arr[left] > arr[mid]) SWAP(arr[left], arr[mid]);
}

void quickSort(int arr[], int left, int right) {
	if (left < right) {
		int mid = left + (right - left) / 2;
		medianSort(arr, left, right, mid);;

		if (right - left > 2) {
			int pivot, low, high;

			pivot = arr[mid];
			SWAP(arr[mid], arr[right-1]);
			low = left, high = right-1;

			do {
				do {
					low++;
				} while (low <= right && arr[low] < pivot);

				do {
					high--;
				} while (left <= high && arr[high] > pivot);

				if (high <= low) break;
				SWAP(arr[low], arr[high]);
			}while(1);

			SWAP(arr[low], arr[right-1]);

			quickSort(arr, left, low);
			quickSort(arr, low+1, right);
		}
	}
}

int main() {
	printf("------test1------\n");
	int test1[MAX_SIZE] = {67, 90, 57, 25, 84, 32, 73, 54};
	printf("Before quicksort : ");
	display(test1);
	quickSort(test1, 0, MAX_SIZE-1);
	printf("After quicksort : ");
	display(test1);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {80, 70, 60, 50, 40, 30, 20, 10};
	printf("Before quicksort : ");
	display(test2);
	quickSort(test2, 0, MAX_SIZE-1);
	printf("After quicksort : ");
	display(test2);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {10, 20, 30, 40, 50, 60, 70, 80};
	printf("Before quicksort : ");
	display(test3);
	quickSort(test3, 0, MAX_SIZE-1);
	printf("After quicksort : ");
	display(test3);
	printf("\n");

	return 0;
}