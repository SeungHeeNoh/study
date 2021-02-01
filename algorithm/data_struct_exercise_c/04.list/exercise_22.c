/*
	단순 연결 리스트 C를 두 개의 단순 연결 리스트 A와 B로 분리하는 함수 split를 작성하여보자.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct ListNode{
	int data;
	struct ListNode *link;
}ListNode;

ListNode *createNode(int data){
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if(newNode == NULL){
		printf("Allocation Failed.\n");
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
		p->link = newNode;
	}
}

void split(ListNode *base, ListNode **odd, ListNode **even){
	ListNode *pOdd = NULL, *pEvent = NULL, *newNode = NULL, *n = base;
	int count = 0;

	while(n != NULL){
		count++;
		newNode = createNode(n->data);
		if (count % 2 == 0){
			insertNode(even, pEvent, newNode);
			pEvent = newNode;
		}else{
			insertNode(odd, pOdd, newNode);
			pOdd = newNode;
		}
		n = n->link;
	}
}

void main(){
	ListNode *base1 = NULL, *listA = NULL, *listB = NULL;

	insertNode(&base1, NULL, createNode(15));
	insertNode(&base1, NULL, createNode(25));
	insertNode(&base1, NULL, createNode(35));
	insertNode(&base1, NULL, createNode(45));
	insertNode(&base1, NULL, createNode(55));
	insertNode(&base1, NULL, createNode(65));

	display(base1);
	split(base1, &listA, &listB);
	printf("------base------\n");
	display(base1);
	printf("------listA------ \n");
	display(listA);
	printf("------listB------ \n");
	display(listB);
}