/*
	레드 블랙 트리를 구현하라.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct Node {
	int data;
	int isRed;
	struct Node *left, *right;
}Node;

void display(Node *node) {
	if (node != NULL) {
		display(node->left);
		printf("(%d, %d)", node->data, node->isRed);
		display(node->right);
	}
}

Node* createNode(int data) {
	Node *newNode = (Node *)malloc(sizeof(Node));

	if (newNode == NULL) {
		printf("Allocation is Failed.\n");
	} else {
		newNode->data = data;
		newNode->left = newNode->right = NULL;
		newNode->isRed = 1;
	}

	return newNode;
}

void insertTree(Node **root, int newData) {
	Node *n = *root, *p = NULL, *newNode = NULL;

	while(n != NULL) {
		if (n->data == newData) {
			printf("%d is already exist.\n", newData);
			return;
		} else {
			p = n;
			n = n->data < newData ? n->right : n->left;
		}
	}

	newNode = createNode(newData);
	if (newNode == NULL) return;
	
	if (p == NULL) {
		*root = newNode;
		newNode->isRed = 0;
	} else {
		if (p->data < newData) {
			p->right = newNode;
		} else {
			p->left = newNode;
		}
	}

	display(*root);
	printf("\n");
}

int main() {
	Node *rbtree = NULL;
	insertTree(&rbtree, 10);
	insertTree(&rbtree, 5);
	insertTree(&rbtree, 6);
	insertTree(&rbtree, 3);
	insertTree(&rbtree, 2);
	insertTree(&rbtree, 8);
	insertTree(&rbtree, 13);
	insertTree(&rbtree, 15);

	return 0;
}