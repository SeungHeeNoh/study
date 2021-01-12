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
	HeapType ht1, ht2, ht3;
	element e1 = {50}, e2 = {90}, e3 = {30}, e4 = {70}, e5 = {10};

	/*test1 : 중간에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	printf("test1\n");
	init(&ht1);
	insert(&ht1, e1);
	insert(&ht1, e2);
	insert(&ht1, e3);
	insert(&ht1, e4);
	insert(&ht1, e5);
	display(&ht1);

	printf("After delete : ");
	delete(&ht1);
	display(&ht1);
	printf("\n");


	/*test2 : 가장 처음에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	printf("test2\n");
	init(&ht2);
	insert(&ht2, e2);
	insert(&ht2, e1);
	insert(&ht2, e3);
	insert(&ht2, e4);
	insert(&ht2, e5);
	display(&ht2);

	printf("After delete : ");
	delete(&ht2);
	display(&ht2);
	printf("\n");

	/*test3 : 가장 마지막에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	printf("test3\n");
	init(&ht3);
	insert(&ht3, e1);
	insert(&ht3, e5);
	insert(&ht3, e3);
	insert(&ht3, e4);
	insert(&ht3, e2);
	display(&ht3);

	printf("After delete : ");
	delete(&ht3);
	display(&ht3);
	printf("\n");
	return 0;
}