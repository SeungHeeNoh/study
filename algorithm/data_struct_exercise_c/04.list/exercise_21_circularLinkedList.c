/*
	어떤 노드를 가리키는 포인터 x가 주어진 경우, 그 노드의 후속 노드를 쉽게 찾을 수 있다.
	후속 노드를 y라고 하면 x에 y의 데이터 필드 값을 복사한다. 그리고 y를 삭제한다.
	위 알고리즘으로 동작하는 removed 함수를 구현하라. 이 때 자료구조는 circular linked list로 구현하라.
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

	if(p == NULL) return;

	do{
		p = p->link;
		printf("%d ", p->data);
	}while(p != phead);
	printf("\n");
}

void insertFirst(ListNode **tail, ListNode *newNode){
	if(*tail == NULL){
		*tail = newNode;
		newNode->link = *tail;
	}else{
		newNode->link = (*tail)->link;
		(*tail)->link = newNode;
	}
}

void insertLast(ListNode **tail, ListNode *newNode){
	if(*tail == NULL){
		*tail = newNode;
		newNode->link = *tail;
	}else{
		newNode->link = (*tail)->link;
		(*tail)->link = newNode;
		*tail = newNode;
	}
}

ListNode *search(ListNode *tail, int data){
	ListNode *p = tail, *target = NULL;

	if(p != NULL){
		do{
			p = p->link;
			if(p->data == data){
				target = p;
				break;
			}
		}while(p != tail);
	}

	return target;
}

void removeNode(ListNode **tail, ListNode *removed){
	if(*tail == NULL){
		printf("Already Empty.\n ");
	}else if(removed == NULL){
		printf("Data you want to delete is not exist in List\n");
	}else{
		ListNode *nextNode = removed->link;
		removed->data = nextNode->data;
		removed->link = nextNode->link;

		free(nextNode);
	}
}

void main(){
	ListNode *test1 = NULL;

	insertFirst(&test1, createNode(10));
	insertFirst(&test1, createNode(20));
	insertLast(&test1, createNode(30));
	insertLast(&test1, createNode(40));

	display(test1);

	removeNode(&test1, search(test1, 10));
	display(test1);

	removeNode(&test1, search(test1, 50));
	display(test1);
}