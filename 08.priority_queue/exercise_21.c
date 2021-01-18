/*
	최소 히프에서 임의의 요소를 삭제하는 C 함수를 작성하라.
	함수가 수행된 다음에도 히프의 조건을 만족하여야 한다.
*/
#include<stdio.h>

#define MAX_SIZE 20

typedef struct HeapType {
	int array[MAX_SIZE];
	int length;
}HeapType;

void init(HeapType *h) {
	h->length = 0;
}

void insert(HeapType *h, int data) {
	int child = ++(h->length);

	while (child != 1 && h->array[child/2] > data) {
			h->array[child] = h->array[child/2];
			child /= 2;
	}
	h->array[child] = data;
}

int delete(HeapType *h) {
	int removed = h->array[1], temp = h->array[(h->length)--];
	int parent = 1, child = 2;

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

void deleteTarget(HeapType *h, int target) {
	int idx = 0;
	int parent, child, temp;

	for (idx=1; idx<=h->length; idx++) {
		if (h->array[idx] == target) break;
	}

	temp = h->array[(h->length)--];
	parent = idx;
	child = idx*2;

	while (child <= h->length) {
		if (child < h->length && h->array[child] > h->array[child+1]) child++;
		if (temp <= h->array[child]) break;
		h->array[parent] = h->array[child];
		parent = child;
		child *= 2;
	}
	h->array[parent] = temp;
}

void display(HeapType t) {
	for (int i=1; i<=t.length; i++) {
		printf("%d ", t.array[i]);
	}
	printf("\n");
}

int main() {
	printf("-----test1-----\n");
	HeapType test1;
	int arr1[MAX_SIZE] = {10, 5, 6, 13, 15, 8, 14, 7, 12, 4};

	init(&test1);
	for (int i=0; i<10; i++) {
		insert(&test1, arr1[i]);
	}
	display(test1);
	deleteTarget(&test1, 5);
	display(test1);

	printf("-----test2-----\n");
	HeapType test2;
	int arr2[MAX_SIZE] = {10, 5, 6, 13, 15, 8, 14, 7, 12, 4};

	init(&test2);
	for (int i=0; i<10; i++) {
		insert(&test2, arr1[i]);
	}
	display(test2);
	deleteTarget(&test2, 15);
	display(test2);
	return 0;
}