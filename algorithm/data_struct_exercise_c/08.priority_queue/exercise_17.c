/*
	연결 리스트(linked list)를 이용하여 우선순위 큐 추상 자료형의 각종 연산들을 구현하여보라.
*/
#include<Stdio.h>
#include<malloc.h>

typedef int element;
typedef struct PriorityType{
	int data;
	struct PriorityType *link;
} PriorityType;

int isEmpty(PriorityType *phead) {
	return phead == NULL;
}

PriorityType *createNode(int data) {
	PriorityType *newNode = (PriorityType *)malloc(sizeof(PriorityType));

	if (newNode == NULL) {
		printf("Allocation Failed");
	} else {
		newNode->data = data;
		newNode->link = NULL;
	}

	return newNode;
}

void insert(PriorityType **phead, PriorityType *new) {
	PriorityType *p = *phead;

	if (p == NULL) {
		*phead = new;
	} else {
		while(p->link != NULL) {
			p = p->link;
		}

		p->link = new;
	}
};

void delete(PriorityType **phead) {
	PriorityType *p = NULL, *n = *phead;
	PriorityType *removed, *removedPrev = NULL;
	int max=0;

	if (isEmpty(*phead)) {
		printf("Already Empty");
		return;
	}

	while(n != NULL) {
		if (n->data > max) {
			max = n->data;
			removed = n;
			removedPrev = p;
		}
		p=n;
		n=n->link;
	}
	if (removed != NULL) {
		if (removedPrev == NULL) {
			*phead = removed->link;
		} else {
			removedPrev->link = removed->link;
		}
	}
	
	free(removed);
};

void display(PriorityType *phead) {
	PriorityType *p = phead;

	while(p != NULL) {
		printf("%d ", p->data);
		p=p->link;
	}
	printf("\n");
}
int main() {
	// /*test1 : 중간에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	PriorityType *pt1 = NULL;
	printf("test1\n");
	insert(&pt1, createNode(10));
	insert(&pt1, createNode(80));
	insert(&pt1, createNode(50));
	insert(&pt1, createNode(0));
	insert(&pt1, createNode(70));
	display(pt1);

	printf("After delete : ");
	delete(&pt1);
	display(pt1);
	printf("\n");

	/*test2 : 가장 처음에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	PriorityType *pt2 = NULL;
	printf("test2\n");
	insert(&pt2, createNode(80));
	insert(&pt2, createNode(10));
	insert(&pt2, createNode(50));
	insert(&pt2, createNode(0));
	insert(&pt2, createNode(70));
	display(pt2);

	printf("After delete : ");
	delete(&pt2);
	display(pt2);
	printf("\n");

	/*test3 : 가장 마지막에 우선순위가 높은 노드가 존재할 때 제거가 잘 이루어지는가?*/
	PriorityType *pt3 = NULL;
	printf("test3\n");
	insert(&pt3, createNode(80));
	insert(&pt3, createNode(10));
	insert(&pt3, createNode(50));
	insert(&pt3, createNode(0));
	insert(&pt3, createNode(90));
	display(pt3);

	printf("After delete : ");
	delete(&pt3);
	display(pt3);
	printf("\n");

	return 0;
}