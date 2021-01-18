/*
	최소 히프를 구현하라.
	구현 조건 : insert연산, delete연산, find연산, is_empty연산, is_full연산, display연산
*/
#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 100

typedef struct HeapType {
	int array[MAX_SIZE];
	int length;
} HeapType;

void init(HeapType *h) {
	h->length = 0;
}

void insert(HeapType *h, int data) {
	int idx;

	h->length += 1;
	idx = h->length;

	while (idx != 1 && h->array[idx/2] > data) {
		h->array[idx] = h->array[idx/2];
		idx /= 2;
	}
	h->array[idx] = data;
}

int delete(HeapType *h) {
	int min = 0, temp = 0, removed = h->array[1];
	int parent = 1, child = 2;

	if (h->length == 0) {
		printf("Already Empty.\n");
		return 0;
	}
	
	temp = h->array[h->length];
	h->length -= 1;

	while (child <= h->length) {
		if (child < h->length && h->array[child] > h->array[child+1]) {
			child++;
		}
		if (temp <= h->array[child]) break;
		h->array[parent] = h->array[child];
		parent = child;
		child *= 2;
	}
	h->array[parent] = temp;
	return removed;
}

void display(HeapType h) {
	for(int i=1; i<=h.length; i++) {
		printf("%d ", h.array[i]);
	}
}

int main() {
	HeapType test1;
	int arr1[MAX_SIZE] = {10, 5, 6, 13, 15, 8, 14, 7, 12, 4};

	init(&test1);
	for (int i=0; i<10; i++) {
		insert(&test1, arr1[i]);
	}
	display(test1);
	printf("\n");
	printf("delete : %d\n", delete(&test1));
	printf("delete : %d\n", delete(&test1));
	display(test1);


	return 0;
}