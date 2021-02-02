/*
	12, 70, 30, 20, 55, 25, 40, 50를 퀵 정렬을 이용하여 정렬하라.
*/
#include<stdio.h>

#define MAX_SIZE 8
#define SWAP(a, b) {int t = a; a = b; b = t;}

void display(int arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

int partition(int arr[], int left, int right) {
	int pivot = arr[left], low = left, high = right+1;

	do {
		do {
			low++;
		} while (low <= right && arr[low] < pivot);

		do {
			high--;
		} while (left <= high && arr[high] > pivot);

		if (low < high) SWAP(arr[low], arr[high]);
		
	} while(low < high);
	SWAP(arr[left], arr[high]);

	return high;
}

void quickSort(int arr[], int left, int right) {
	if (left < right) {
		int q = partition(arr, left, right);
		printf("q : %d -  ", q);
		display(arr);
		quickSort(arr, left, q);
		quickSort(arr, q+1, right);
	}
}

void main(){
	printf("------test1------\n");
	int test1[MAX_SIZE] = {12, 70, 30, 20, 55, 25, 40, 50};

	printf("Before quickSort : ");
	display(test1);
	quickSort(test1, 0, MAX_SIZE-1);
	printf("After quickSort : ");
	display(test1);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {10, 20, 30, 40, 50, 60, 70, 80};

	printf("Before quickSort : ");
	display(test2);
	quickSort(test2, 0, MAX_SIZE-1);
	printf("After quickSort : ");
	display(test2);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {80, 70, 60, 50, 40, 30, 20, 10};

	printf("Before quickSort : ");
	display(test3);
	quickSort(test3, 0, MAX_SIZE-1);
	printf("After quickSort : ");
	display(test3);
	printf("\n");
}