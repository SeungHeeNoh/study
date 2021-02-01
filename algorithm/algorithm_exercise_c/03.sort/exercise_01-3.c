/*
	12, 70, 30, 20, 55, 25를 삽입 정렬을 이용하여 정렬하라.
*/
#include<stdio.h>

#define MAX_SIZE 6
#define SWAP(a, b) {int t; t = a; a = b; b = t;}

void display(int arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void insertionSort(int arr[]) {
	for (int i = 1; i < MAX_SIZE; i++) {
		int target = arr[i];
		int j = i-1;

		while (j >= 0 && target < arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = target;

		printf("%d step : ", i);
		display(arr);
	}
}

void main(){
	printf("------test1------\n");
	int test1[MAX_SIZE] = {12, 70, 30, 20, 55, 25};

	printf("Before insertionSort : ");
	display(test1);
	insertionSort(test1);
	printf("After insertionSort : ");
	display(test1);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {10, 20, 30, 40, 50, 60};

	printf("Before insertionSort : ");
	display(test2);
	insertionSort(test2);
	printf("After insertionSort : ");
	display(test2);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {60, 50, 40, 30, 20, 10};

	printf("Before insertionSort : ");
	display(test3);
	insertionSort(test3);
	printf("After insertionSort : ");
	display(test3);
	printf("\n");
}