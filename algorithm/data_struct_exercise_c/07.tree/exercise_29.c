/*
	이진 탐색 트리를 이용하여 배열에 저장된 숫자들을 내림차순으로 정렬시키는 함수를 작성하여 보라.
*/
#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

#define MAX_SIZE 100

int result[MAX_SIZE];
int idx = 0;

typedef struct TreeNode {
	int data;
	struct TreeNode *left, *right;
} TreeNode;

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
	TreeNode *newNode;

	while (n != NULL) {
		int nData = n->data;

		if (nData == data) {
			return;
		}

		p = n;
		if (nData < data) {
			n = n->right;
		} else {
			n = n->left;
		}
	}

	newNode = createNode(data);
	if (newNode == NULL) {
		printf("Allocation Failed.\n");
		exit(1);
	}
	if (p == NULL) {
		*t = newNode;
	} else {
		if (p->data < newNode->data) {
			p->right = newNode;
		} else {
			p->left = newNode;
		}
	}
}

void sort(TreeNode *t) {
	if (t != NULL) {
		sort(t->right);
		result[idx++] = t->data;
		sort(t->left);
	}
}

void display(TreeNode *t) {
	if (t != NULL) {
		display(t->right);
		printf("%d ", t->data);
		display(t->left);
	}
}

int main() {
	TreeNode *test1 = NULL;
	int arr[MAX_SIZE] = {10, 5, 6, 13, 15, 8, 14, 7, 12, 4};

	for (int i=0 ; i<10; i++) {
		insertNode(&test1, arr[i]);
	}
	display(test1);
	printf("\n");

	sort(test1);
	for (int i=0 ; i<10; i++) {
		printf("%d ", result[i]);
	}
	return 0;
}