/*
	12, 70, 30, 20, 55, 25, 40, 50를 병합 정렬을 이용하여 정렬하라.
*/
#include<stdio.h>

#define MAX_SIZE 8

void display(int arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void merge(int arr[], int left, int mid, int right) {
	int tempArr[MAX_SIZE];
	int leftIdx = left, rightIdx = mid+1, idx = left;

	while(leftIdx <= mid && rightIdx <= right) {
		if (arr[leftIdx] < arr[rightIdx]) {
			tempArr[idx++] = arr[leftIdx++];
		} else {
			tempArr[idx++] = arr[rightIdx++];
		}
	}

	while (leftIdx <= mid) {
		tempArr[idx++] = arr[leftIdx++];
	}

	while (rightIdx <= right) {
		tempArr[idx++] = arr[rightIdx++];
	}

	for (int i = left; i <= right; i++) {
		arr[i] = tempArr[i];
	}
}

void mergeSort(int arr[], int left, int right) {
	if (left < right) {
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		printf("merge : %d, %d\n", left, right);
		merge(arr, left, mid, right);
		display(arr);
	}
}

void main(){
	printf("------test1------\n");
	int test1[MAX_SIZE] = {12, 70, 30, 20, 55, 25, 40, 50};

	printf("Before mergeSort : ");
	display(test1);
	mergeSort(test1, 0, MAX_SIZE-1);
	printf("After mergeSort : ");
	display(test1);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {10, 20, 30, 40, 50, 60, 70, 80};

	printf("Before mergeSort : ");
	display(test2);
	mergeSort(test2, 0, MAX_SIZE-1);
	printf("After mergeSort : ");
	display(test2);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {80, 70, 60, 50, 40, 30, 20, 10};

	printf("Before mergeSort : ");
	display(test3);
	mergeSort(test3, 0, MAX_SIZE-1);
	printf("After mergeSort : ");
	display(test3);
	printf("\n");
}