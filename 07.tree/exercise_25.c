/*
	주어진 이진 트리에서 자식이 하나만 있는 노드의 개수를 반환하는 함수를 작성하라.
*/
#include<stdio.h>

typedef struct TreeNode {
	int data;
	struct TreeNode *left, *right; 
} TreeNode;

int getOneChildNode(TreeNode *t) {
	int count =  0;
	if (t->left == NULL && t->right == NULL) {
		return 0;
	} else if (t->left != NULL && t->right == NULL) {
		count = 1 + getOneChildNode(t->left);
	} else if (t->right != NULL && t->left == NULL) {
		count = 1 +  getOneChildNode(t->right);
	} else {
		count += getOneChildNode(t->left);
		count += getOneChildNode(t->right);
	}

	return count;
}

int main () {
	TreeNode n1 = {1, NULL, NULL};
	TreeNode n3 = {2, &n1, NULL};
	TreeNode n4 = {5, NULL, NULL};
	TreeNode n5 = {4, &n3, &n4};
	TreeNode n7 = {11, NULL, NULL};
	TreeNode n8 = {10, NULL, &n7};
	TreeNode n9 = {7, NULL, NULL};
	TreeNode n10 = {9, &n9, &n8};
	TreeNode n11 = {11, &n5, &n10};

	printf("%d ", getOneChildNode(&n11));
	return 0;
}