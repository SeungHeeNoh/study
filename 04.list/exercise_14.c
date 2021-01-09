/*
	단순 연결 리스트에 정수가 저장되어 있다.
	단순 연결 리스트의 모든 데이터 값을 더한 합을 출력하는 프로그램을 작성하여라.
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
};

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
};

void removeNode(ListNode **phead, ListNode *p) {
	ListNode *removed = NULL;

	if (*phead == NULL) {
		printf("빈 리스트 에러");
	} else if (p == NULL) {
		removed = *phead;
		*phead = removed->link;
		free(removed);
	} else {
		removed = p->link;
		p->link = removed->link;
		free(removed);
	}
};

int addAllData(ListNode *phead) {
	ListNode *p = phead;
	int result=0;

	while(p != NULL) {
		result += p->data;
		p=p->link;
	}

	return result;
};

void displayList(ListNode *phead) {
	ListNode *p = phead;

	while(p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
};

int main() {

	ListNode *list = NULL;
	insertNode(&list, NULL, createNode(10, NULL));
	insertNode(&list, NULL, createNode(20, NULL));
	insertNode(&list, NULL, createNode(30, NULL));
	insertNode(&list, NULL, createNode(40, NULL));
	insertNode(&list, NULL, createNode(50, NULL));
	removeNode(&list, NULL);
	displayList(list);

	printf("all add Data : %d", addAllData(list));
	return 0;
}