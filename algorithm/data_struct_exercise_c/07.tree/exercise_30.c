/*
	이진 탐색 트리의 모든 노드의 값을 1씩 증가시키는 함수를 작성하여보라.
*/
#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

#define MAX_SIZE 100

typedef struct TreeNode {
	int data;
	struct TreeNode *left, *right;
}TreeNode;

TreeNode *createNode(int data) {
	TreeNode *newNode = (TreeNode *)malloc(sizeof(TreeNode));

	if (newNode != NULL) {
		newNode->data = data;
		newNode->left = newNode->right = NULL;
	}

	return newNode;
}

void insertNode(TreeNode **t, int data) {
	TreeNode *p = NULL, *n = *t;
	TreeNode *new;

	while (n != NULL) {
		if (n->data == data) {
			printf("%d is already Exist.\n", data);
			return;
		}
		p = n;
		if (n->data < data) {
			n = n->right;
		} else {
			n = n->left;
		}
	}

	new = createNode(data);
	if (new == NULL) {
		printf("Allocation Failed");
		return;
	} else {
		if (p == NULL) {
			*t = new;
		} else {
			if (p->data < new->data) {
				p->right = new;
			} else {
				p->left = new;
			}
		}
	}
}

void plusOne(TreeNode *t) {
	if (t != NULL) {
		plusOne(t->left);
		t->data += 1;
		plusOne(t->right);
	}
}

void display(TreeNode *t) {
	if (t != NULL) {
		display(t->left);
		printf("%d ", t->data);
		display(t->right);
	}
}

int main(){
	printf("test1\n");
	TreeNode *test1 = NULL;
	int arr1[MAX_SIZE] = {10, 5, 6, 13, 15, 8, 14, 7, 12, 4};

	for (int i=0 ; i<10; i++) {
		insertNode(&test1, arr1[i]);
	}
	display(test1);
	printf("\n");

	plusOne(test1);
	display(test1);
	printf("\n");
	printf("\n");

	printf("test2\n");
	TreeNode *test2 = NULL;
	int arr2[MAX_SIZE] = {10, 5, 6, 13, 5, 8, 14, 7, 12, 4};

	for (int i=0 ; i<10; i++) {
		insertNode(&test2, arr2[i]);
	}
	display(test2);
	printf("\n");

	plusOne(test2);
	display(test2);
	printf("\n");
	return 0;
}