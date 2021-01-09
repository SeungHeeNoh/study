/*
	단순 연결 리스트에서 특정한 데이터값을 갖는 노드의 개수를 계산하는 함수를 작성하라.
*/
#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>

typedef int element;
typedef struct ListNode {
	element data;
	struct ListNode *link;
} ListNode;

ListNode *createNode(element data, ListNode *link) {
	ListNode *newNode;

	newNode = (ListNode *)malloc(sizeof(ListNode));
	if (newNode == NULL) printf("메모리 할당 에러");
	newNode->data = data;
	newNode->link = link;

	return newNode;
}

void insertNode(ListNode **phead, ListNode *p, ListNode *newNode) {
	if (*phead == NULL) {
		*phead = newNode;
		newNode->link = NULL;
	} else if (p == NULL) {
		newNode->link = *phead;
		*phead = newNode;
	} else {
		newNode->link = p->link;
		p->link = newNode;
	}
}

int matchCount(ListNode *phead, int matchTarget) {
	ListNode *p = phead;
	int count = 0;

	while (p!=NULL) {
		if (matchTarget == p->data) {
			count++;
		}
		p=p->link;
	}
	return count;
}

void displayList(ListNode *phead) {
	ListNode *p = phead;

	while(p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

int main() {

	ListNode *list = NULL;
	insertNode(&list, NULL, createNode(10, NULL));
	insertNode(&list, NULL, createNode(20, NULL));
	insertNode(&list, NULL, createNode(30, NULL));
	insertNode(&list, NULL, createNode(20, NULL));
	insertNode(&list, NULL, createNode(50, NULL));

	printf("match count : %d", matchCount(list, 20));
	return 0;
}