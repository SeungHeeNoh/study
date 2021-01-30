/*
	기존의 트리 노드의 구조에 이 부모 노드를 가리키는 포인터를 추가하고, 기존의 연산들 중에서 어떤 연산들이 수정되어야 하는지 논하라.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct TreeNode{
	int data;
	struct TreeNode *left, *right, *parent;
} TreeNode;

TreeNode *createNode(int data) {
	TreeNode *newNode = (TreeNode *)malloc(sizeof(TreeNode));

	if (newNode == NULL) {
		printf("Allocation Failed.\n");
	}else{
		newNode->data = data;
		newNode->right = newNode->left = newNode->parent = NULL;
	}

	return newNode;
}

int isEmpty(TreeNode **t) {
	return *t == NULL;
}

void insertNode(TreeNode **t, int newData) {
	TreeNode *p = NULL, *n = *t, *newNode = NULL;

	while (n != NULL) {
		if (n->data == newData) {
			printf("Already Exist.\n");
			return;
		}
		if (n->data < newData) {
			p = n;
			n = n->right;
		} else {
			p = n;
			n = n->left;
		}
	}

	newNode = createNode(newData);
	if (newNode == NULL) return;
	if (p == NULL) {
		*t = newNode;
		newNode->parent = NULL;
	} else {
		if (p->data < newData) {
			p->right = newNode;
		} else {
			p->left = newNode;
		}
		newNode->parent = p;
		
	}
}

void deleteNode(TreeNode **t, int deleteData) {
	if (isEmpty(t)) {
		printf("Already Empty.\n");
		return;
	} else {
		TreeNode *p = NULL, *n = *t;
		while (n->data != deleteData) {
			if (n->data < deleteData) {
				n = n->right;
			} else {
				n = n->left;
			}
		}

		p = n->parent;
		if (n->left == NULL && n->right == NULL) {
			if (p != NULL) {
				if (p->left == n) {
					p->left = NULL;
				} else {
					p->right = NULL;
				}
			} else {
				*t = NULL;
			}
		} else  if (n->left == NULL || n->left == NULL) {
			TreeNode *child = n->left == NULL ? n->right : n->left;

			if (p != NULL) {
				if (p->left == n) {
					p->left = child;
				} else {
					p->right = child;
				}
			} else {
				*t = child;
			}
		} else {
			TreeNode *subT = n->right;

			if (subT->left != NULL) {
				subT = subT->left;
			}

			if (subT->parent->right == subT) {
				subT->parent->right = subT->right;
			} else {
				subT->parent->left = subT->right;
			}

			n->data = subT->data;
			n = subT;
		}

		free(n);
	}
}

int search(TreeNode *t, int target){
	TreeNode *p = t;

	while (p != NULL){
		if (p->data == target) return 1;
		if (p->data < target){
			p = p->right;
		} else {
			p = p->left;
		}
	}

	return -1;
}

void display(TreeNode *t) {
	if (t == NULL) return;
	display(t->left);
	printf("%d ", t->data);
	display(t->right);
}

int main() {
	TreeNode *test1 = NULL;
	insertNode(&test1, 10);
	insertNode(&test1, 5);
	insertNode(&test1, 16);
	insertNode(&test1, 40);
	insertNode(&test1, 11);
	insertNode(&test1, 2);
	insertNode(&test1, 7);
	display(test1);
	printf("\n");
	printf("Is %d in the list? %s\n", 7, (search(test1, 7) == -1) ? "False" : "True");
	printf("Is %d in the list? %s\n", 20, (search(test1, 20) == -1) ? "False" : "True");
	deleteNode(&test1, 5);
	display(test1);
	return 0;
}