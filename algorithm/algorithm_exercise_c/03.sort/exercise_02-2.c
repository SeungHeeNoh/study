/*
	12, 70, 30, 20, 55, 25를 힙 정렬을 이용하여 정렬하라.
*/
#include<stdio.h>

#define MAX_SIZE 6
typedef struct HeapType{
	int arr[MAX_SIZE+1];
	int length;
}HeapType;

void initHeap(HeapType *ht) {
	ht->length = 0;
}

void display(int arr[], int start, int end) {
	for (int i = start; i < end; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void insertHeap(HeapType *ht, int newData) {
	ht->length += 1;
	int i = ht->length;

	while(i != 1 && ht->arr[i/2] > newData) {
		ht->arr[i] = ht->arr[i/2];
		i /= 2;
	}
	ht->arr[i] = newData;
}

int deleteHeap(HeapType *ht) {
	int deleteData = ht->arr[1], tempData = ht->arr[ht->length--];
	int parent = 1, child = 2;

	while (child <= ht->length) {
		if (child < ht->length && ht->arr[child] > ht->arr[child+1]) child++;
		if (ht->arr[child] > tempData) break;
		ht->arr[parent] = ht->arr[child];
		parent = child;
		child *= 2;
	}
	ht->arr[parent] = tempData;

	return deleteData;
}

void main(){
	HeapType heap;
	initHeap(&heap);

	printf("------test1------\n");
	int test1[MAX_SIZE] = {12, 70, 30, 20, 55, 25};
	

	printf("Before mergeSort : ");
	display(test1, 0, MAX_SIZE);
	for (int i = 0; i < MAX_SIZE; i++) {
		insertHeap(&heap, test1[i]);
	}

	for (int i = 0; i < MAX_SIZE; i++) {
		test1[i] = deleteHeap(&heap);
	}

	printf("After mergeSort : ");
	display(test1, 0, MAX_SIZE);
	printf("\n");

	printf("------test2------\n");
	int test2[MAX_SIZE] = {10, 20, 30, 40, 50, 60};

	printf("Before mergeSort : ");
	display(test2, 0, MAX_SIZE);
	for (int i = 0; i < MAX_SIZE; i++) {
		insertHeap(&heap, test2[i]);
	}

	for (int i = 0; i < MAX_SIZE; i++) {
		test2[i] = deleteHeap(&heap);
	}

	printf("After mergeSort : ");
	display(test2, 0, MAX_SIZE);
	printf("\n");

	printf("------test3------\n");
	int test3[MAX_SIZE] = {60, 50, 40, 30, 20, 10};

	printf("Before mergeSort : ");
	display(test3, 0, MAX_SIZE);
	for (int i = 0; i < MAX_SIZE; i++) {
		insertHeap(&heap, test3[i]);
	}

	for (int i = 0; i < MAX_SIZE; i++) {
		test3[i] = deleteHeap(&heap);
	}
	printf("After mergeSort : ");
	display(test3, 0, MAX_SIZE);
	printf("\n");
}