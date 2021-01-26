/*
	어떤 노드를 가리키는 포인터 x가 주어진 경우, 그 노드의 후속 노드를 쉽게 찾을 수 있다.
	후속 노드를 y라고 하면 x에 y의 데이터 필드 값을 복사한다. 그리고 y를 삭제한다.
	위 알고리즘으로 동작하는 removed 함수를 구현하라. 이 때 자료구조는 linked list로 구현하라.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct ListNode{
	int data;
	struct ListNode *link;
}ListNode;

ListNode *createNode(int data){
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if (newNode == NULL){
		printf("Allocation Failed\n");
	}else{
		newNode->data = data;
		newNode->link = NULL;
	}
	return newNode;
}

void display(ListNode *phead){
	ListNode *p = phead;

	while(p != NULL){
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

void insertNode(ListNode **phead, ListNode *p, ListNode *newNode){
	if(*phead == NULL){
		*phead = newNode;
	}else if(p == NULL){
		newNode->link = *phead;
		*phead = newNode;
	}else{
		newNode->link = p->link;
		p->link - newNode;
	}
}

ListNode *search(ListNode *phead, int data){
	ListNode *p = phead, *target = NULL;

	while (p != NULL){
		if(p->data == data){
			target = p;
			break;
		}
		p = p->link;
	}

	return target;
}

void removeNode(ListNode **phead, ListNode *removed){
	ListNode *nextNode = NULL;

	if(*phead == NULL){
		printf("Already Empty.\n");
	}else if(removed == NULL){
		printf("Data you want to delete is not exist in list.\n");
	}else{
		nextNode = removed->link;
		removed->data = nextNode->data;
		removed->link = nextNode->link;
		free(nextNode);
	}
}

void main(){
	ListNode *test1 = NULL;

	insertNode(&test1, NULL, createNode(10));
	insertNode(&test1, NULL, createNode(20));
	insertNode(&test1, NULL, createNode(30));
	insertNode(&test1, NULL, createNode(40));

	display(test1);
	removeNode(&test1, search(test1, 20));
	display(test1);

	removeNode(&test1, search(test1, 50));
	display(test1);
}