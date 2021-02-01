/*
	히프 정렬이 진행되는 동안의 list[]배열의 내용을 출력하라.
*/
#include<stdio.h>
#define MAX_SIZE 11
typedef struct SortType{
	int array[MAX_SIZE];
	int length;
}SortType;

void display(int arr[], int length) {
	for (int i=0; i<length; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void insert(SortType *s, int data) {
	int i = (s->length)++;

	while(i != 1 && data > s->array[i/2]) {
		s->array[i] = s->array[i/2];
		i/=2;
	}
	s->array[i] = data;
}

void insertHeap(int arr[], int length, SortType *s) {
	s->length=0;
	for (int i=0; i < length; i++) {
		insert(s, arr[i-1]);
	}
}

int delete(SortType *s) {
	int removed = s->array[1], temp = s->array[(s->length)--];
	int parent = 1, child = 2;

	while (child <= s->length) {
		if (child < s->length && s->array[child] < s->array[child+1]) child++;
		if (s->array[child] <= temp) break;
		s->array[parent] = s->array[child];
		parent = child;
		child *= 2;
	}
	s->array[parent] = temp;
	return removed;
}


void heapSort(SortType *s, int result[], int length) {
	insertHeap(result, length, s);

	for (int i=length-1; i>= 0; i--) {
		result[i] = delete(s);
	}
}

void main() {
	SortType test1;
	int arr1[MAX_SIZE] = {41, 67, 34, 0, 69, 24, 78, 58, 62, 64};
	heapSort(&test1, arr1, 10);
	display(arr1, 10);
}