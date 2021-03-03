/*
	다음 두 집합을 연결 리스트를 사용해 표현하고, 이들이 합쳐진 후의 모양을 그려라.
*/

#include<stdio.h>
#include<malloc.h>

typedef struct Element{
	int data;
	struct Element *right;
}Element;

typedef struct List{
	Element *front, *rear;
	int length;
}List;

Element *parent[25];

void init(List *list) {
	list->front = list->rear = NULL;
	list->length = 0;
}

void display(List list) {
	Element *n = list.front;
	
	while(n != NULL) {
		printf("%d ", n->data);
		n = n->right;
	}
	printf("\n");
}

Element* createElement(int data) {
	Element *newNode = (Element *)malloc(sizeof(Element));

	if (newNode == NULL) {
		printf("Allocation Error.\n");
	} else {
		newNode->data = data;
		newNode->right = NULL;
	}

	return newNode;
}

void make_set(List *list, Element *newNode) {
	if (newNode == NULL) return;

	if (list->front == NULL) {
		list->front = list->rear = newNode;
	} else {
		newNode->right = NULL;
		list->rear->right = newNode;
		list->rear = newNode;
	}
	list->length++;
	parent[newNode->data] = list->front;
}

Element *find_set(int data) {
	return parent[data];
}

void union_set(List *list1, List *list2) {
	Element *oldFront = NULL, *newFront = NULL, *oldRear = NULL, *n= NULL;
	
	if (list2->length > list1->length) {
		oldFront  = list1->front;
		newFront = list2->front;
		oldRear = list2->rear;

		list2->length += list1->length;
		list2->rear = list1->rear;
		n = list1->front;
		init(list1);
	} else {
		oldFront = list2->front;
		newFront = list1->front;
		oldRear = list1->rear;

		list1->length += list2->length;
		list1->rear = list2->rear;
		n = list2->front;
		init(list2);
	}

	oldRear->right = oldFront;

	while(n->right != NULL) {
		parent[n->data] = newFront;
		n = n->right;
	}
}

int main() {
	List set1;
	init(&set1);

	make_set(&set1, createElement(1));
	make_set(&set1, createElement(3));
	display(set1);

	List set2;
	init(&set2);

	make_set(&set2, createElement(12));
	make_set(&set2, createElement(20));
	make_set(&set2, createElement(7));
	make_set(&set2, createElement(9));
	display(set2);

	union_set(&set1, &set2);
	display(set1);
	display(set2);

	return 0;
}