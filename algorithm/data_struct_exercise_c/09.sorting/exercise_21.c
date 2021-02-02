/*
	삽입 정렬에서 입력과 출력이 모두 동적 연결 리스트로 주어지는 경우의 삽입 정렬 함수를 구현하라.
*/
#include<stdio.h>
#include<malloc.h>

#define ARR_SIZE 6
typedef int element;
typedef struct ListNode {
	element data;
	struct ListNode *left, *right;
}ListNode;

void display(ListNode *lt) {
	ListNode *p = lt;

	do{
		p = p->right;
		printf("%d ", p->data);
	}while(p->right != lt);
	printf("\n");
}

void initListNode(ListNode *lt) {
	lt->left = lt->right = lt;
}

int isEmpty(ListNode *lt) {
	return lt == lt->right;
}

ListNode *createNode(element newData) {
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if (newNode == NULL) {
		printf("Allocation Failed.\n");
	} else {
		newNode->data = newData;
		newNode->left = newNode->right = NULL;
	}

	return newNode;
}

void insertNode(ListNode *lt, ListNode *newNode) {
	if (isEmpty(lt)) {
		lt->left = lt->right = newNode;
		newNode->left = newNode->right =lt;
	} else {
		newNode->right = lt;
		newNode->left = lt->left;
		lt->left->right = newNode;
		lt->left = newNode;
	}
}

void insertionSort(ListNode *lt) {
	ListNode *i = NULL, *j = NULL;
	int target = 0;
	
	for (i = lt->right->right; i != lt; i = i->right) {
		target = i->data;
		j = i->left;

		while (j != lt && j->data > target) {
			j->right->data = j->data;
			j = j->left;
		}

		j->right->data = target;
	}
}

int main() {
	printf("------test1------\n");
	ListNode test1;
	initListNode(&test1);
	int arr1[ARR_SIZE] = {17, 9, 21, 6, 3, 12};

	for (int i=0; i<6; i++) {
		insertNode(&test1, createNode(arr1[i]));
	}

	printf("Before insertionSort : ");
	display(&test1);

	insertionSort(&test1);

	printf("After insertionSort : ");
	display(&test1);
	printf("\n");

	printf("------test2------\n");
	ListNode test2;
	initListNode(&test2);
	int arr2[ARR_SIZE] = {10, 20, 30, 40, 50, 60};

	for (int i=0; i<6; i++) {
		insertNode(&test2, createNode(arr2[i]));
	}

	printf("Before insertionSort : ");
	display(&test2);

	insertionSort(&test2);

	printf("After insertionSort : ");
	display(&test2);
	printf("\n");

	printf("------test3------\n");
	ListNode test3;
	initListNode(&test3);
	int arr3[ARR_SIZE] = {60, 50, 40, 30, 20, 10};

	for (int i=0; i<6; i++) {
		insertNode(&test3, createNode(arr3[i]));
	}

	printf("Before insertionSort : ");
	display(&test3);

	insertionSort(&test3);

	printf("After insertionSort : ");
	display(&test3);
	printf("\n");

	return 0;
}