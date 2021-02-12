/*
	레드 블랙 트리를 구현하라.
	C program for Red-Black Tree
*/
#include<stdio.h>
#include<malloc.h>

typedef struct Node {
	int data;
	int isRed;
	struct Node *left, *right, *parent;
}Node;

Node *NILL;

void display(Node *node) {
	if (node != NILL) {
		display(node->left);
		printf("(%d, %d)", node->data, node->isRed);
		display(node->right);
	}
}

void initNILL() {
	NILL = malloc(sizeof(Node));
	NILL->data = -999;
	NILL->left = NILL->right = NULL;
	NILL->isRed = 0;
}

Node* createNode(int data) {
	Node *newNode = (Node *)malloc(sizeof(Node));

	if (newNode == NULL) {
		printf("Allocation is Failed.\n");
	} else {
		newNode->data = data;
		newNode->left = newNode->right = newNode->parent = NILL;
		newNode->isRed = 1;
	}

	return newNode;
}

void searchTree(Node **root, int findData) {
	Node *n = *root;

	while (n != NILL) {
		if (n->data == findData) {
			printf("%d is exist.\n");
			return;
		} else {
			n = n->data > findData ? n->left : n->right;
		}
	}
	printf("%d is not exist.\n", findData);
}

void rotateLL(Node **root, Node *p) {
	Node *child = p->left;

	p->left = child->right;
	child->right = p;
	child->parent = p->parent;

	if (p == *root) {
		*root = child;
	} else {
		if (child->parent->left == p) {
			child->parent->left = child;
		} else {
			child->parent->right = child;
		}
	}

	p->parent = child;
}

void rotateRR(Node **root, Node *p) {
	Node *child = p->right;

	p->right = child->left;
	child->left = p;
	child->parent = p->parent;

	if (p == *root) {
		*root = child;
	} else {
		if (child->parent->left == p) {
			child->parent->left = child;
		} else {
			child->parent->right = child;
		}
	}

	p->parent = child;
}

void fixup(Node **root, Node *c) {
	while (c != *root) {
		Node *p = c->parent,
		 	 *g = p->parent,
		 	 *u = g->left == p ? g->right : g->left;

		if (p->isRed == 1 && c->isRed == 1) {
			if (u == NILL || u->isRed == 0) {
				if (g->left == p) {
					if (p->right == c) {
						// case 2-1
						rotateRR(root, p);
						c = p;
					} else {
						// case 2-2
						rotateLL(root, g);
						int tempcolor = g->isRed;
						g->isRed = p->isRed;
						p->isRed = tempcolor;
						c = p;
					}
				} else {
					if (p->left == c) {
						rotateLL(root, p);
						c = p;
					} else {
						rotateRR(root, g);
						int tempcolor = g->isRed;
						g->isRed = p->isRed;
						p->isRed = tempcolor;
						c = p;
					}
				}
			} else if (u->isRed == 1) {
				// case 1 : Recoloring
				p->isRed = u->isRed = 0;
				if (g != *root) g->isRed = 1;
				c = g;
			}
		} else {
			break;
		}
	}
}

void insertTree(Node **root, int newData) {
	Node *n = *root, *p = NULL, *newNode = NULL;

	while(n != NILL) {
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
		newNode->parent = p;
	}

	fixup(root, newNode);
	display(*root);
	printf("\n");
}

int main() {
	initNILL();
	printf("-------------test1-------------\n");
	Node *rbtree1 = NILL;

	insertTree(&rbtree1, 10);
	insertTree(&rbtree1, 5);
	insertTree(&rbtree1, 6);
	insertTree(&rbtree1, 3);
	insertTree(&rbtree1, 2);
	insertTree(&rbtree1, 8);
	insertTree(&rbtree1, 13);
	insertTree(&rbtree1, 15);
	searchTree(&rbtree1, 6);
	printf("\n");

	printf("-------------test2-------------\n");
	Node *rbtree2 = NILL;

	insertTree(&rbtree2, 10);
	insertTree(&rbtree2, 5);
	insertTree(&rbtree2, 13);
	insertTree(&rbtree2, 6);
	insertTree(&rbtree2, 3);
	insertTree(&rbtree2, 2);
	insertTree(&rbtree2, 8);
	insertTree(&rbtree2, 15);
	insertTree(&rbtree2, 7);
	searchTree(&rbtree2, 11);
	printf("\n");

	printf("-------------test3-------------\n");
	Node *rbtree3 = NILL;

	insertTree(&rbtree3, 20);
	insertTree(&rbtree3, 10);
	insertTree(&rbtree3, 30);
	insertTree(&rbtree3, 25);
	insertTree(&rbtree3, 40);
	printf("\n");

	printf("-------------test4-------------\n");
	Node *rbtree4 = NILL;

	insertTree(&rbtree4, 4);
	insertTree(&rbtree4, 8);
	insertTree(&rbtree4, 12);
	printf("\n");

	return 0;
}