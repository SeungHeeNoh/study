/*
	다음 두 집합을 연결 리스트를 사용해 표현하고, 이들이 합쳐진 후의 모양을 그려라.
*/

#include<stdio.h>
#include<malloc.h>

#define DISJOINT_SIZE 25
typedef struct Element{
	int data;
	struct Element *link;
}Element;

Element *parent[DISJOINT_SIZE];

void init() {
	for(int i=0; i<DISJOINT_SIZE; i++) {
		parent[i] = NULL;
	}
}

void display() {
	for(int i=0; i<DISJOINT_SIZE; i++) {
		if (parent[i] != NULL) printf("%d ", parent[i]->data);
	}
	printf("\n");
}

void make_set(int data) {
	Element *newNode = (Element *)malloc(sizeof(Element));

	if (newNode == NULL) {
		printf("Allocation Error.\n");
		return;
	} else {
		newNode->data = data;
		newNode->link = NULL;
	}

	parent[newNode->data] = newNode;
}

Element *find_set(int data) {
	while(parent[data]->data != data) {
		data = parent[data]->data;
	}
	return parent[data];
}

int getLength(Element *p) {
	int length = 0;

	while(p != NULL) {
		p = p->link;
		length++;
	}

	return length;
}

void union_set(int x, int y) {
	Element *parent_x = find_set(x), *parent_y = find_set(y);
	Element *tail, *n, *new_p;
	int length_x = getLength(parent_x), length_y = getLength(parent_y);

	if (length_x < length_y) {
		tail = new_p = parent_y;
		n = parent_x;
	} else {
		tail = new_p = parent_x;
		n = parent_y;
	}

	while (tail->link != NULL) tail = tail->link;
	while (n != NULL) {
		parent[n->data] = new_p;
		tail->link = n;
		tail = n;
		n = n->link;
	}
}

int main() {
	init();

	// {1, 3}
	make_set(1);
	make_set(3);
	union_set(1, 3);
	display();

	// {12, 20, 7, 9}
	make_set(12);
	make_set(20);
	make_set(7);
	make_set(9);
	union_set(12, 20);
	union_set(12, 7);
	union_set(7, 9);
	display();

	// {12, 20, 7, 9, 1, 3}
	union_set(1, 7);
	display();

	return 0;
}