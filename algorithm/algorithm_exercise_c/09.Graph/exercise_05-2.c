/*
	크루스칼 알고리즘으로 최소신장트리를 구하는 과정을 보여라.
*/
#include<stdio.h>
#include <stdlib.h>
#include<malloc.h>
#define INF 1000L
#define ARRAY_SIZE 8
#define CHAR_BASE 65

typedef struct Element {
	int u, v, weight;
}Element;

typedef struct HeapType {
	int length;
	Element *elArr[ARRAY_SIZE*ARRAY_SIZE+1];
}HeapType;

//test1
int weight[ARRAY_SIZE][ARRAY_SIZE] = {
	{INF, 8, 11, 9, INF, INF, INF, INF},
	{8, INF, INF, 15, 10, INF, INF, INF},
	{11, INF, INF, 3, INF, 8, 8, INF},
	{9, 15, 3, INF, 1, INF, 12, INF},
	{INF, 10, INF, 1, INF, INF, INF, 2},
	{INF, INF, 8, INF, INF, INF, 7, 4},
	{INF, INF, 8, 12, INF, 7, INF, 5},
	{INF, INF, INF, INF, 2, 4, 5, INF}
};

//test2
// int weight[ARRAY_SIZE][ARRAY_SIZE] = {
// 	{INF, 29, INF, INF, INF, 10, INF},
// 	{29, INF, 16, INF, INF, INF, 15},
// 	{INF, 16, INF, 12, INF, INF, INF},
// 	{INF, INF, 12, INF, 22, INF, 18},
// 	{INF, INF, INF, 22, INF, 27, 25},
// 	{10, INF, INF, INF, 27, INF, INF},
// 	{INF, 15, INF, 18, 25, INF, INF}
// };

int findSet(int parent[], int el) {
	int i = parent[el];

	while(i != parent[i]) {
		i = parent[i];
	}

	return i;
}

void unionSet(int parent[], int size[], int x, int y) {
	int xParent = findSet(parent, x),
		yParent = findSet(parent, y),
		newParent, newSize;

	if (size[xParent] < size[yParent]) {
		parent[x] = yParent;
		size[yParent] += size[xParent];
	} else {
		parent[yParent] = xParent;
		size[xParent] += size[yParent];
	}
}

void initHeapType(HeapType *ht) {
	for (int i=1; i<=ARRAY_SIZE*ARRAY_SIZE; i++) {
		ht->elArr[i] = NULL;
	}
	ht->length = 0;
}

Element *createHeapEl(int u, int v, int weight) {
	Element *newEl = (Element *)malloc(sizeof(Element));

	if (newEl == NULL) {
		printf("Allocation Error Occured.\n");
		exit(1);
	} else {
		newEl->u = u;
		newEl->v = v;
		newEl->weight = weight;
	}

	return newEl;
}

void insertMinHeap(HeapType *ht, Element *el) {
	int idx = ++ht->length;
	ht->elArr[idx] = el;

	while (idx != 1 && el->weight < ht->elArr[idx/2]->weight) {
		ht->elArr[idx] = ht->elArr[idx/2];
		idx /= 2;
	}
	ht->elArr[idx] = el;
}

Element *deleteMinHeap(HeapType *ht) {
	Element *deleted = ht->elArr[1],
			*updated = ht->elArr[ht->length--];
	int parent = 1, child = 2;

	while(child <=ht->length) {
		if (child<ht->length && ht->elArr[child]->weight > ht->elArr[child+1]->weight) child++;
		if (updated->weight <= ht->elArr[child]->weight) break;
		ht->elArr[parent] = ht->elArr[child];
		parent = child;
		child *= 2;
	}
	ht->elArr[parent] = updated;

	return deleted;
}

void initMST(int parent[], int size[], HeapType *ht) {
	for (int i=0; i<ARRAY_SIZE; i++) {
		parent[i] = i;
		size[i] = 1;
	}

	for (int i=0; i<ARRAY_SIZE; i++) {
		for (int j=0; j<ARRAY_SIZE; j++) {
			insertMinHeap(ht, createHeapEl(i, j, weight[i][j]));
		}
	}

}

void getMST() {
	HeapType ht;
	Element *el;
	int parent[ARRAY_SIZE],
		size[ARRAY_SIZE],
		edge = 0;

	initHeapType(&ht);
	initMST(parent, size, &ht);

	while (edge < ARRAY_SIZE-1) {
		el = deleteMinHeap(&ht);
		if (findSet(parent, el->u) != findSet(parent, el->v)) {
			printf("%c, %c\n", (char)(el->u + CHAR_BASE), (char)(el->v + CHAR_BASE));
			unionSet(parent, size, el->u, el->v);
			edge++;
		}
	}
}

int main() {
	printf("===Result===\n");
	getMST();
	return 0;
}