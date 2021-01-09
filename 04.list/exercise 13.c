/*
	단순 연결 리스트에서 삭제 함수 delete함수는 실제로는 헤드 포인터와 선행 노드 포인터의 2개의 매개 변수만 있으면 작업이 가능하다.
	이들 두 매개 변수만을 사용하여 다시 작성하라.
*/
#include<stdio.h>
#include<malloc.h>

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

void displayList(ListNode *phead) {
	ListNode *p = phead;

	while(p != NULL){
		printf("%d ", p->data);
		p = p->link;
	}
};

int main() {

	ListNode *list;
	insertNode(&list, NULL, createNode(10, NULL));
	insertNode(&list, NULL, createNode(20, NULL));
	insertNode(&list, NULL, createNode(30, NULL));
	insertNode(&list, NULL, createNode(40, NULL));
	insertNode(&list, NULL, createNode(50, NULL));

	removeNode(&list, NULL);
	displayList(list);
	return 0;
}