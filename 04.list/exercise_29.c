/*
	이중 연결 리스트를 이용하여 숫자들을 항상 정렬된 상태로 유지하는 리스트 SortedList를 구현하여보라.
	add, delete, clear, is_in_list, get_length, is_empty, is_full, display
*/
#include<stdio.h>
#include<malloc.h>

typedef int element;
typedef struct ListNode{
	element data;
	struct ListNode *left, *right;
}ListNode;

void init(ListNode *lt){
	lt->left =  lt->right = lt;
	lt->data = 10000;
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

int isEmpty(ListNode *lt){
	return lt->left == lt;
}

int getLength(ListNode *lt){
	ListNode *p = lt;
	int length = 0;

	if(isEmpty(lt)) return 0;
	
	do{
		p = p->right;
		length++;
	}while(p->right != lt);

	return length;
}

void display(ListNode *lt){
	ListNode *p = lt;
	
	do{
		p = p->right;
		printf("%d ", p->data);
	}while(p->right != lt);
	printf("\n");
}

ListNode *find(ListNode *lt, element findTarget){
	ListNode *n = lt, *targetNode = NULL;

	do{
		n = n->right;
		if(n->data == findTarget){
			targetNode = n;
			break;
		}
		if (n->data < findTarget) break;
	}while(n->right != lt);
	return targetNode;
}

void add(ListNode *lt, element newData){
	if(find(lt, newData) != NULL){
		printf("Already exist.\n");
	}else{
		ListNode *newNode = createNode(newData), *p;
		if(newNode == NULL) return;
		if(isEmpty(lt)){
			newNode->left = newNode->right = lt;
			lt->left = lt->right = newNode;
		}else{
			p = lt;
			do{
				p = p->right;
				if(p->data < newData){
					break;
				}
			}while(p != lt);
			newNode->right = p->left->right;
			newNode->left = p->left;
			p->left->right = newNode;
			p->left = newNode;
		}
	}
}

void isInList(ListNode *lt, element findData){
	if(isEmpty(lt)){
		printf("The List is Empty.\n");
	}else{
		if(find(lt, findData) == NULL){
			printf("%d is not exist.\n", findData);
		}else{
			printf("%d is exist.\n", findData);
		}
	}
}

// void clear(ListNode lt){
// 	ListNode *p = &lt, *removed = NULL;

// 	do{
// 		removed = p;
// 		p = p->right;
// 		free(removed);
// 	}while(p != &lt);

// 	init(&lt);
// }

void main(){
	ListNode test1;
	init(&test1);
	printf("is Empty? %s\n", isEmpty(&test1) ? "True" : "False");
	printf("List Length? %d\n", getLength(&test1));

	add(&test1, 10);
	add(&test1, 20);
	add(&test1, 1);
	add(&test1, 17);
	add(&test1, 0);
	add(&test1, 10);
	display(&test1);
	printf("is Empty? %s\n", isEmpty(&test1) ? "True" : "False");
	printf("List Length? %d\n", getLength(&test1));
	isInList(&test1, 17);
	isInList(&test1, 50);
}