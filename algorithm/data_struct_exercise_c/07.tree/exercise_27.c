/*
	이진 탐색트리가 아닌 일반적인 이진 트리에서 최댓값과 최솟값을 탐색하기 위한 함수를 작성하라.
*/
#include<stdio.h>

typedef struct TreeNode {
	int data;
	struct TreeNode *left, *right;
} TreeNode;

typedef struct Result {
	int min;
	int max;
} Result;

int getMax(TreeNode *t) {
	int result = 0;
	int left, right, temp= 0;
	if (t == NULL) return result;
	result = t->data;
	left = getMax(t->left);
	right = getMax(t->right);

	temp = left < right ? right : left;
	result = result < temp ? temp : result;

	return result;
}

int getMin(TreeNode *t) {
	int result = 100000;
	int left, right, temp= 100000;
	if (t == NULL) return result;
	result = t->data;
	left = getMin(t->left);
	right = getMin(t->right);

	temp = left > right ? right : left;
	result = result > temp ? temp : result;

	return result;
}


Result *get_max_min(TreeNode *t, Result *value) {
	value->max = getMax(t);
	value->min = getMin(t);
}



int main() {
	Result result;
	TreeNode n1 = {1, NULL, NULL};
	TreeNode n3 = {2, &n1, NULL};
	TreeNode n4 = {5, NULL, NULL};
	TreeNode n5 = {4, &n3, &n4};
	TreeNode n7 = {11, NULL, NULL};
	TreeNode n8 = {10, NULL, &n7};
	TreeNode n9 = {7, NULL, NULL};
	TreeNode n10 = {9, &n9, &n8};
	TreeNode n11 = {11, &n5, &n10};

	get_max_min(&n11, &result);
	printf("max : %d, min : %d", result.max, result.min);
	return 0;
}