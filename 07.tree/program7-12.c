/*
	이진 탐색 트리를 사용한 영어 사전
*/
#include<stdio.h>
#include<string.h>
#include<memory.h>
#include<malloc.h>

#define MAX_WORD_SIZE 100
#define MAX_MEANING_SIZE 200
typedef struct element {
	char word[MAX_WORD_SIZE];
	char meaning[MAX_MEANING_SIZE];
}element;
typedef struct TreeNode{
	element item;
	struct TreeNode *left, *right;
}TreeNode;

TreeNode *createNode(element item) {
	TreeNode *new = (TreeNode *)malloc(sizeof(TreeNode));
	new->item = item;
	new->left = NULL;
	new->right = NULL;

	return new;
}

int compare(element e1, element e2) {
	return strcmp(e1.word, e2.word);
}

void help() {
	printf("*******************\n");
	printf("i: input\n");
	printf("d: delete\n");
	printf("s: search\n");
	printf("p: print\n");
	printf("q: quit\n");
	printf("*******************\n");
}

int main() {
	char command;

	do {
		help();
		command = getchar();
		fflush(stdin);
	} while(command != 'q');

	return 0;
}