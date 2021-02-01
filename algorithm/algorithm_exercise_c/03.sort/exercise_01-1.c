/*
	12, 70, 30, 20, 55, 25를 선택 정렬을 이용하여 정렬하라.
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


void selectionSort(int arr[]) {
	int index;

	for (int i = 0; i < MAX_SIZE-1; i++) {
		index = i;
		for (int j = i+1; j < MAX_SIZE; j++) {
			if (arr[index] > arr[j]) index = j;
		}
		if (i != index) {
			SWAP(arr[i], arr[index]);
		}
		printf("%d step : ", i);
		display(arr);
	}
}

void main(){
	int arr[MAX_SIZE] = {12, 70, 30, 20, 55, 25};

	printf("Before selectionSort : ");
	display(arr);
	selectionSort(arr);
	printf("After selectionSort : ");
	display(arr);
}