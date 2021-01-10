/*
	이진 트리에서 비단말 노드의 개수를 계산하는 함수 get_nonleaf_count(TreeNode *t)를 작성하여보자.
*/
#include<stdio.h>

typedef int element;
typedef struct TreeNode{
	element data;
	struct TreeNode *left, *right;
}TreeNode;

/*
	     1
   	   2    3
	 4  5  6  7
*/
int get_nonleaf_count(TreeNode *head) {
	int count = 0;
	if (head != NULL) {
		if (head->left == NULL && head->right == NULL) {
			count = 0;
		} else {
			count = 1 + get_nonleaf_count(head->left) + get_nonleaf_count(head->right);
		}
	}
	return count;
}

int main() {
	TreeNode n1 = {4, NULL, NULL};
	TreeNode n2 = {5, NULL, NULL};
	TreeNode n3 = {6, NULL, NULL};
	TreeNode n4 = {7, NULL, NULL};
	TreeNode n5 = {2, &n1, &n2};
	TreeNode n6 = {3, &n3, &n4};
	TreeNode n7 = {1, &n5, &n6};

	printf("%d", get_nonleaf_count(&n7));
	return 0;
}