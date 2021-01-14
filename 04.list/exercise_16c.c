/*
	단순 연결 리스트에서의 탐색 함수를 참고하여 특정한 데이터 값을 갖는 노드를 삭제하는 함수를 작성하라.
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
	if (newNode == NULL) printf("Allocation Error");
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

	if (phead == NULL) {
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

void removeTargetData(ListNode **phead, int targetData) {
	ListNode *p, *prev = NULL;
	p = *phead;

	while(p != NULL) {
		if (targetData == p->data) {
			removeNode(phead, prev);

			// p가 가리키던 노드가 free상태가 되어 p가 쓰레기값을 가리키기 때문에 삭제가 발생하면 p를 재선언해서 사용해야 한다.
			if (prev == NULL) {
				p = *phead;
			} else {
				p = prev->link;
			}
		}
		prev = p;
		p=p->link;
	}
}

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
	insertNode(&list, NULL, createNode(20, NULL));
	insertNode(&list, NULL, createNode(50, NULL));
	insertNode(&list, NULL, createNode(20, NULL));
	displayList(list);
	removeTargetData(&list, 20);
	displayList(list);
	return 0;
}