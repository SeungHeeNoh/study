/*
	허프만 코드 프로그램에서 생성된 허프만 코드에서 허프만 코드를 얻는 부분을 추가하라.
	루트에서 출발하여 왼쪽 노드로 갈 때는 1을 출력하고 오른쪽 자식으로 갈 때는 0을 출력하라.
*/
#include<stdio.h>
#include<malloc.h>

#define MAX_SIZE 100
typedef struct TreeNode {
	int data;
	struct TreeNode *left, *right;
}TreeNode;
typedef struct HeapType {
	TreeNode *arr[MAX_SIZE];
	int length;
}HeapType;


void heapInit(HeapType *ht) {
	ht->length = 0;
}

void insertMinHeap(HeapType *ht, TreeNode *newNode) {
	ht->length += 1;
	int i = ht->length;

	while (i != 1 && ht->arr[i/2]->data > newNode->data) {
		ht->arr[i] = ht->arr[i/2];
		i /= 2;
	}
	ht->arr[i] = newNode;

}

TreeNode *deleteMinHeap(HeapType *ht) {
	TreeNode *deleteNode = ht->arr[1];
	TreeNode *temp = ht->arr[ht->length--];
	int parent = 1, child = 2;

	while (child <= ht->length) {
		if (child < ht->length && ht->arr[child]->data > ht->arr[child+1]->data) child++;
		if (ht->arr[child]->data > temp->data) break;
		ht->arr[parent] = ht->arr[child];
		parent = child;
		child *= 2;
	}

	ht->arr[parent] = temp;

	return deleteNode;
}

TreeNode *createNode(int newData, TreeNode *left, TreeNode *right) {
	TreeNode *newNode = (TreeNode *)malloc(sizeof(TreeNode));

	if (newNode == NULL) {
		printf("Allocation Failed.\n");
	} else {
		newNode->data = newData;
		newNode->left = left;
		newNode->right = right;
	}

	return newNode;
}

void huffman_tree(int *arr, int length) {
	HeapType heap;
	heapInit(&heap);
	TreeNode *huffman = NULL, *leftNode = NULL, *rightNode = NULL, *node = NULL;

	int min1, min2, p;

	for (int i=0; i<length; i++) {
		insertMinHeap(&heap, createNode(arr[i], NULL, NULL));
	}

	while (heap.length != 1) {
		leftNode = deleteMinHeap(&heap);
		rightNode = deleteMinHeap(&heap);
		huffman = createNode(leftNode->data + rightNode->data, leftNode, rightNode);
		insertMinHeap(&heap, huffman);
	}
}


int main() {
	int freq[] = {15, 12, 8, 6, 4};
	huffman_tree(freq, 5);
}