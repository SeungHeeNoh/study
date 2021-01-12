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
	
	if (p == NULL) {
		*phead = removed->link;
	} else {
		removedPrev->link = removed->link;
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
	PriorityType *pt = NULL;

	insert(&pt, createNode(10));
	insert(&pt, createNode(80));
	insert(&pt, createNode(50));
	insert(&pt, createNode(0));
	insert(&pt, createNode(70));
	display(pt);

	delete(&pt);
	display(pt);
	return 0;
}