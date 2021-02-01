/*
	이중 연결 리스트를 이용하여 연결된 스택을 구현하여보라.
*/
#include<stdio.h>
#include<malloc.h>

typedef int element;
typedef struct ListNode{
	element data;
	struct ListNode *left, *right;
}ListNode;

void init(ListNode *top){
	top->left = top->right = top;
}

ListNode *createNode(element newData){
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if(newNode == NULL){
		printf("Allocation Failed.\n");
	}else{
		newNode->data = newData;
		newNode->left = newNode->right = NULL;
	}

	return newNode;
}

int isEmpty(ListNode *top){
	return top->left == top;
}

void display(ListNode *top){
	ListNode *p = top;

	if(isEmpty(top)) return;
	do{
		p = p->right;
		printf("%d ", p->data);
	}while(p->right != top);
	printf("\n");
}

void push(ListNode *top, ListNode *newNode){
	if(isEmpty(top)){
		newNode->left = newNode->right = top;
		top->left = top->right = newNode;
	}else{
		newNode->left = top;
		newNode->right = top->right;
		top->right->left = newNode;
		top->right = newNode;
	}
	display(top);
}

element pop(ListNode *top){
	ListNode *removed;
	element data;

	if(isEmpty(top)){
		printf("Stack is empty.\n");
	}else{
		removed = top->right;
		data = removed->data;

		top->right = removed->right;
		removed->right->left = top;
	}

	return data;
}

void main(){
	ListNode test1;
	init(&test1);

	push(&test1, createNode(1));
	push(&test1, createNode(2));
	push(&test1, createNode(3));
	printf("%d pop\n", pop(&test1));
	push(&test1, createNode(4));
	push(&test1, createNode(5));
	push(&test1, createNode(6));
	push(&test1, createNode(7));
	printf("%d pop\n", pop(&test1));
}