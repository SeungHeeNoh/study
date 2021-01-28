/*
	AVL 트리 구현
*/
#include<stdio.h>
#include<malloc.h>

#define MAX(a, b) (((a) > (b)) ? (a) : (b))

typedef struct AvlNode{
	int data;
	struct AvlNode *left_child, *right_child;
}AvlNode;

void display(AvlNode *node){
	if (node == NULL) return;
	display(node->left_child);
	printf("%d ", node->data);
	display(node->right_child);
}

int getHeight(AvlNode *node){
	int height = 0;

	if(node == NULL) return 0;
	height = 1 + MAX(getHeight(node->left_child), getHeight(node->right_child));

	return height;
}

int getHeightDiff(AvlNode *node){
	if(node == NULL) return 0;
	return getHeight(node->left_child) - getHeight(node->right_child);
}

AvlNode *rotate_LL(AvlNode *parent){
	AvlNode *child = parent->left_child;
	parent->left_child = child->right_child;
	child->right_child = parent;

	return child;
}

AvlNode *rotate_RR(AvlNode *parent){
	AvlNode *child = parent->right_child;
	parent->right_child = child->left_child;
	child->left_child = parent;

	return child;
}

AvlNode *rotate_LR(AvlNode *parent){
	AvlNode *child = parent->left_child;
	parent->left_child = rotate_RR(child);

	return rotate_LL(parent);
}

AvlNode *rotate_RL(AvlNode *parent){
	AvlNode *child = parent->right_child;
	parent->right_child = rotate_LL(child);

	return rotate_RR(parent);	
}

AvlNode *rebalance(AvlNode **node){
	int diff = getHeightDiff(*node);

	if(diff > 1){
		if(getHeightDiff((*node)->left_child) > 0){
			*node = rotate_LL(*node);
		}else{
			*node = rotate_LR(*node);
		}
	}else if(diff < -1){
		if(getHeightDiff((*node)->right_child) < 0){
			*node = rotate_RR(*node);
		}else{
			*node = rotate_RL(*node);
		}
	}

	return *node;
}


AvlNode *avlAdd(AvlNode **root, int newKey){
	if(*root == NULL){
		*root = (AvlNode *)malloc(sizeof(AvlNode));

		if(*root == NULL){
			printf("Alocation Error.\n");
		}
		(*root)->data = newKey;
		(*root)->right_child = (*root)->left_child = NULL;
	}else if((*root)->data > newKey){
		(*root)->left_child = avlAdd(&((*root)->left_child), newKey);
		rebalance(root);
	}else if((*root)->data < newKey){
		(*root)->right_child = avlAdd(&((*root)->right_child), newKey);
		rebalance(root);
	}else{
		printf("Already Exist.\n");
	}
	return *root;
}

AvlNode *aviSearch(AvlNode *node, int target){
	if (node == NULL) return NULL;

	if(node->data == target){
		return node;
	}else if(node->data < target){
		return aviSearch(node->right_child, target);
	}else if(node->data > target){
		return aviSearch(node->left_child, target);
	}
}

void main(){
	AvlNode *root = NULL;
	avlAdd(&root, 8);
	avlAdd(&root, 9);
	avlAdd(&root, 10);
	display(root);
	printf("\n");

	avlAdd(&root, 2);
	display(root);
	printf("\n");

	avlAdd(&root, 1);
	display(root);
	printf("\n");

	avlAdd(&root, 5);
	display(root);
	printf("\n");

	avlAdd(&root, 6);
	display(root);
	printf("\n");

	avlAdd(&root, 3);
	display(root);
	printf("\n");

	avlAdd(&root, 4);
	display(root);
	printf("\n");

	avlAdd(&root, 7);
	display(root);
	printf("\n");

	avlAdd(&root, 11);
	display(root);
	printf("\n");

	avlAdd(&root, 12);
	display(root);
	printf("\n");

	printf("%s\n", aviSearch(root, 12) != NULL ? "True" : "False");
	printf("%s\n", aviSearch(root, 15) != NULL ? "True" : "False");
}