/*
	정렬되지 않은 배열(array)을 이용하여 우선순위 큐 추상 자료형의 각종 연산들을 구현하여보라.
*/
#include<stdio.h>
#include<malloc.h>

#define MAX_ELEMENT 10

typedef struct element{
	int key;
}element;
typedef struct HeapType{
	element arr[MAX_ELEMENT];
	int heap_size;
}HeapType;

void init(HeapType *h) {
	h->heap_size = 0;
}

int isEmpty(HeapType *h) {
	return !h->heap_size;
}

int isFull(HeapType *h) {
	return h->heap_size == MAX_ELEMENT-1;
}

void insert(HeapType *h, element item) {
	if(isFull(h)) return;
	h->arr[++h->heap_size] = item;
}

void delete(HeapType *h) {
	int idx = 1, max = 0, maxidx = 0;;

	if (isEmpty(h)) return;
	while(idx <= h->heap_size) {
		if (h->arr[idx].key > max) {
			max = h->arr[idx].key;
			maxidx = idx;
		}
		idx++;
	}

	while(maxidx < h->heap_size) {
		h->arr[maxidx++] = h->arr[maxidx+1];
	}
	h->heap_size -= 1;
}

void display(HeapType *h) {
	int idx = 0;

	while(idx < h->heap_size) {
		printf("%d ", h->arr[++idx]);
	}
	printf("\n");
}

int main() {
	HeapType ht;
	element e1 = {50}, e2 = {90}, e3 = {30}, e4 = {70}, e5 = {10};
	init(&ht);
	insert(&ht, e1);
	insert(&ht, e2);
	insert(&ht, e3);
	insert(&ht, e4);
	insert(&ht, e5);

	delete(&ht);

	display(&ht);
	printf("%d", ht.heap_size);

	return 0;
}