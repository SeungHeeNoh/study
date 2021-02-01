/*
	12, 70, 30, 20, 55, 25를 버블 정렬을 이용하여 정렬하라.
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

void bubbleSort(int arr[]) {
	int sorted;

	for (int i = MAX_SIZE-1; i > 0; i--) {
		sorted = 1;
		for (int j = 0; j < i; j++) {
			if (arr[j] > arr[j+1]) {
				SWAP(arr[j], arr[j+1]);
				sorted = 0;
			}
		}
		if (sorted) break;

		printf("%d step : ", MAX_SIZE - i);
		display(arr);
	}
}

void main(){
	printf("------test1------\n");
	int test1[MAX_SIZE] = {12, 70, 30, 20, 55, 25};

	printf("Before bubbleSort : ");
	display(test1);
	bubbleSort(test1);
	printf("After bubbleSort : ");
	display(test1);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {10, 20, 30, 40, 50, 60};

	printf("Before bubbleSort : ");
	display(test2);
	bubbleSort(test2);
	printf("After bubbleSort : ");
	display(test2);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {10, 20, 40, 30, 50, 60};

	printf("Before bubbleSort : ");
	display(test3);
	bubbleSort(test3);
	printf("After bubbleSort : ");
	display(test3);
	printf("\n");
}