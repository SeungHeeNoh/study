/*
	단순 연결 리스트의 헤드 포인트가 주어져 있을 때 첫 번째 노드에서부터 하나씩 건너서 있는 노드를 삭제하는 함수를 작성하라.
	즉 홀수 번째 있는 노드들이 전부 삭제된다.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct LinkNode {
	int data;
	struct LinkNode *link; 
}LinkNode;

LinkNode *createNode(int data) {
	LinkNode *newNode = (LinkNode *)malloc(sizeof(LinkNode));

	if (newNode == NULL) {
		printf("Allocation Error occured\n");
	} else {
		newNode->data = data;
		newNode->link = NULL;
	}

	return newNode;
}

void insertNode(LinkNode **phead, LinkNode *p, LinkNode *newNode) {
	if (*phead == NULL) {
		*phead = newNode;
	} else if (p == NULL) {
		newNode->link = *phead;
		*phead = newNode;
	} else {
		newNode->link = p->link;
		p->link = newNode;
	}
}

void deleteNode(LinkNode **phead, LinkNode *p) {
	LinkNode *removed;

	if (*phead == NULL) {
		printf("Already Empty.\n");
	} else if (p == NULL) {
		removed = *phead;
		*phead = removed->link;
		free(removed);
	} else {
		removed = p->link;
		p->link = removed->link;
		free(removed);
	}
}

void delteOddNode(LinkNode **phead) {
	LinkNode *now, *prev = NULL;
	now = *phead;

	while(now != NULL) {
		deleteNode(phead, prev);
		if (prev == NULL) {
			now = *phead;
		} else {
			now = prev->link;
		}
		prev = now;
		now = now->link;
	}
}

void display(LinkNode *phead) {
	LinkNode *p = phead;

	while (p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

int main() {
	LinkNode *test1 = NULL;

	insertNode(&test1, NULL, createNode(10));
	insertNode(&test1, NULL, createNode(20));
	insertNode(&test1, NULL, createNode(30));
	insertNode(&test1, NULL, createNode(40));
	insertNode(&test1, NULL, createNode(50));
	insertNode(&test1, NULL, createNode(60));
	display(test1);

	delteOddNode(&test1);
	display(test1);
	return 0;
}