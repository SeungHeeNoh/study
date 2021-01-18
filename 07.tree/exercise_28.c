/*
	숫자들이 들어 있는 이진 탐색 트리를 중위 순회하면 정렬된 숫자가 얻어진다.
	이를 이용하여 배열에 들어 있는 숫자들을 정렬시키는 함수를 작성하여보라.
*/
#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>

#define MAX_SIZE 100

int result[MAX_SIZE];
int idx=0;
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

int search(TreeNode *t, int data) {
	TreeNode *p = t;

	while (p != NULL) {
		if (p->data == data) {
			return 1;
		} else if (p->data < data) {
			p = p->right;
		} else {
			p = p->left;
		}
	}
	return 0;
}

void insertNode(TreeNode **t, int data) {
	TreeNode *p = NULL, *n = *t;
	TreeNode *newNode;

	while (n != NULL) {
		if (n->data == data) {
			printf("Already exist.\n");
			break;
		}
		p = n;
		if (n->data < data) {
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
	if (p != NULL) {
		if (p->data < newNode->data) {
			p->right = newNode;
		} else {
			p->left = newNode;
		}
	} else {
		*t = newNode;
	}
}

void display(TreeNode *t) {
	if (t != NULL) {
		display(t->left);
		printf("%d ", t->data);
		display(t->right);
	}
}

void *sort(TreeNode *t) {
	if (t != NULL) {
		sort(t->left);
		result[idx++] = t->data; 
		sort(t->right);
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