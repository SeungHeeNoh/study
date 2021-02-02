/*
	레코드를 삽입 정렬을 이용하여 정렬하라.
*/
#include<stdio.h>
#include<string.h>

#define NAME_SIZE 5
#define MAX_SIZE 5

typedef struct record {
	char name[NAME_SIZE];
}record;

void display(record arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%s ", arr[i].name);
	}
	printf("\n");
}

void insertionSort(record arr[]) {
	for (int i = 1; i < MAX_SIZE; i++) {
		record temp = arr[i];
		int j = i-1;
		while (j >= 0 && strcmp(arr[j].name, temp.name) > 0) {
			arr[j+1] = arr[j];
			j--;
		}

		arr[j+1] = temp;
		display(arr);
	}
}

void main() {
	record arr[MAX_SIZE] = {{"ccc"}, {"aba"}, {"aaa"}, {"bbb"}, {"aab"}};

	printf("Before insertionSort : ");
	display(arr);
	insertionSort(arr);
	printf("After insertionSort : ");
	display(arr);
}