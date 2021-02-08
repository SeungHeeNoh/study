/*
	이진 탐색 트리를 구현하라.
*/
#include<stdio.h>
#include<malloc.h>
#define MAX_SIZE 13

typedef struct Node {
	int data;
	struct Node *left, *right;
}Node;
typedef struct FindTarget {
	Node *p;
	Node *target;
}FindTarget;

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

void insertNode(Node **root, Node *newNode) {
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

void deleteNode(Node **root, int deleteData) {
	if (*root == NULL) {
		printf("Tree is already empty.\n");
	} else {
		Node *p = NULL, *removed = *root;

		while (removed != NULL) {
			if (removed->data == deleteData) {
				break;
			} else {
				p = removed;
				removed = removed->data < deleteData ? removed->right : removed->left;
			}
		}

		if (removed == NULL) {
			printf("%d is not exist.\n", deleteData);
		} else {
			if (removed->left == NULL && removed->right == NULL) {
				if (p == NULL) {
					*root = NULL;
				} else {
					if (p->left == removed) {
						p->left = NULL;
					} else {
						p->right = NULL;
					}
				}
			} else if (removed->left == NULL || removed->right == NULL) {
				Node *child = removed->left == NULL ? removed->right : removed->left;

				if (p == NULL) {
					*root = child;
				} else {
					if (p->left == removed) {
						p->left = child;
					} else {
						p->right = child;
					}
				}
			} else {
				Node *sub_p = removed, *sub_t = sub_p->right;

				while (sub_t->left != NULL) {
					sub_p = sub_t;
					sub_t = sub_t->left;
				}

				if (sub_p == removed) {
					sub_p->right = sub_t->right;
				} else {
					sub_p->left = sub_t->right;
				}
				removed->data = sub_t->data;
				removed = sub_t;
			}
			free(removed);
		}
	}
}

int main() {
	int arr1[MAX_SIZE] = {55, 15, 8, 3, 28, 48, 38, 33, 32, 36, 50, 60, 90};
	Node *root1 = NULL;

	for (int i=0; i<MAX_SIZE; i++) {
		insertNode(&root1, createNode(arr1[i]));
	}

	display(root1);
	printf("\n");
	printf("\n");

	printf("case 1 : delete leaf node.\n");
	deleteNode(&root1, 3);
	display(root1);
	printf("\n");
	printf("\n");

	printf("case 2 : delete node have only left node.\n");
	deleteNode(&root1, 38);
	display(root1);
	printf("\n");
	printf("\n");

	printf("case 3 : delete node have only right node.\n");
	deleteNode(&root1, 60);
	display(root1);
	printf("\n");
	printf("\n");

	printf("case 4 : delete node have right and left nodes.\n");
	deleteNode(&root1, 55);
	display(root1);
	printf("\n");
	printf("\n");

	printf("case 5 : delete node doesn't exist in tree.\n");
	deleteNode(&root1, 55);
	display(root1);
	printf("\n");
	printf("\n");

	return 0;
}