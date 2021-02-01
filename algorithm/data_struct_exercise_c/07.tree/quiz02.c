/*
	두 개의 트리가 같은 구조를 가지고 있고, 대응되는 노드들이 같은 데이터를 가지고 있는지를 검사하는 함수 equal(TreeNode *t1, TreeNode *t2)를 작성하여보자.
	여기서 t1과 t2를 트리의 루트 노드를 가리키는 포인터이다.
*/
#include<stdio.h>
#include<malloc.h>

typedef int element;
typedef struct TreeNode {
	element data;
	struct TreeNode *left, *right;
}TreeNode;
/*
	 (t1)
	     1
   	   2    3
	 4  5  6  7

	 (t2)
	     1
   	   2    5
	 4  8  7  9
*/
int equal(TreeNode *t1, TreeNode *t2) {
	int count = 0;

	if (t1 != NULL && t2 != NULL) {
		if (t1->data == t2->data) count++;
		count += equal(t1->left, t2->left) + equal(t1->right, t2->right); 
	}
	return count;
}

int main() {
	// t1
	TreeNode n1 = {4, NULL, NULL};
	TreeNode n2 = {5, NULL, NULL};
	TreeNode n3 = {6, NULL, NULL};
	TreeNode n4 = {7, NULL, NULL};
	TreeNode n5 = {2, &n1, &n2};
	TreeNode n6 = {3, &n3, &n4};
	TreeNode t1 = {1, &n5, &n6};

	//t2
	TreeNode n7 = {4, NULL, NULL};
	TreeNode n8 = {8, NULL, NULL};
	TreeNode n9 = {7, NULL, NULL};
	TreeNode n10 = {9, NULL, NULL};
	TreeNode n11 = {2, &n7, &n8};
	TreeNode n12 = {5, &n9, &n10};
	TreeNode t2 = {1, &n11, &n12};

	printf("equal node count : %d", equal(&t1, &t2));
	return 0;
}