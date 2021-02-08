/*
	이진 탐색 트리를 구현하라.
*/
#include<stdio.h>
#include<malloc.h>

#define MAX_SIZE 11

typedef struct Node {
	int data;
	struct Node *left, *right;
}Node;

void display(Node *p) {
	if (p != NULL) {
		display(p->left);
		printf("%d ", p->data);
		display(p->right);
	}
}

Node *createNode(int data) {
	Node *newNode = (Node *)malloc(sizeof(Node));

	if (newNode == NULL) {
		printf("Allocation Error.\n");
	} else {
		newNode->data = data;
		newNode->left = newNode->right = NULL;
	}

	return newNode;
}

void insertTree(Node **root, Node *newNode) {
	if (newNode == NULL) {
		return;
	} else {
		Node *n = *root, *p = NULL;

		while (n != NULL) {
			if (n->data == newNode->data) {
				printf("Already Exist.\n");
				return;
			} else {
				p = n;
				n = n->data < newNode->data ? n->right : n->left;
			}
		}

		if (p == NULL) {
			*root = newNode;
		} else {
			if (p->data < newNode->data) {
				p->right = newNode;
			} else {
				p->left = newNode;
			}
		}
	}
}

int main() {
	int arr1[MAX_SIZE] = {55, 15, 8, 3, 28, 18, 30, 48, 60, 90, 16};
	Node *tree1 = NULL;

	for (int i = 0; i < MAX_SIZE; i++) {
		insertTree(&tree1, createNode(arr1[i]));
	}

	display(tree1);

	return 0;
} 