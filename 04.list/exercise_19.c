/*
	원형 연결 리스트에서 헤드 노드를 사용하면 탐색 연산을 조금 빠르게 할 수 있다.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct ListNode{
	int data;
	struct ListNode *link;
}ListNode;

ListNode *createNode(int data){
	ListNode *new = (ListNode *)malloc(sizeof(ListNode));

	if (new == NULL){
		printf("Allocation Failed.\n");
	}else{
		new->data = data;
		new->link = NULL;
	}

	return new;
}

void display(ListNode *tail){
	ListNode *p = tail;

	do{
		p=p->link;
		printf("%d ", p->data);
	}while(p ->link!= tail);
	printf("\n");
}

void insertFirstNode(ListNode **tail, ListNode *new){
	if(new == NULL){
		return;
	}else{
		if(*tail == NULL){
			*tail = new;
			new->link=*tail;
		}else{
			new->link = (*tail)->link;
			(*tail)->link = new;
		}
	}
}

void init(ListNode **tail){
	ListNode *tailNode = createNode(-1);
	insertFirstNode(tail, tailNode);
}

ListNode *search(ListNode *head, int data){
	ListNode *current = head->link;
	head->data = data;
	while(current->data != data){
		current = current->link;
	}

	return (current == head) ? NULL : current;
}

void main(){
	ListNode *test1 = NULL, *data1 = NULL, *data2 = NULL;
	init(&test1);
	insertFirstNode(&test1, createNode(10));
	insertFirstNode(&test1, createNode(20));
	insertFirstNode(&test1, createNode(30));
	display(test1);

	data1 = search(test1, 10);
	if(data1 == NULL){
		printf("Search Failed\n");
	}else{
		printf("%d find\n", data1->data);
	}

	data2 = search(test1, 50);
	if(data2 == NULL){
		printf("Search Failed\n");
	}else{
		printf("%d find\n", data2->data);
	}
}