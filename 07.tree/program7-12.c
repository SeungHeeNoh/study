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
	if (new == NULL) {
		printf("memory error");
		new = NULL;
	} else {
		new->item = item;
		new->left = NULL;
		new->right = NULL;
	}

	return new;
}

int compare(element e1, element e2) {
	return strcmp(e1.word, e2.word);
}

void insertNode(TreeNode **phead, TreeNode *newNode) {
	TreeNode *p = NULL, *t = *phead;

	while (t != NULL) {
		p = t;
		if (compare(t->item, newNode->item) < 0) {
			t=t->right;
		} else {
			t=t->left;
		}
	}

	if (p == NULL) {
		*phead = newNode;
	} else {
		printf("%d", compare(p->item, newNode->item));
		if (compare(p->item, newNode->item) < 0) {
			p->right = newNode;
		} else {
			p->left = newNode;
		}
	}
}

void display(TreeNode *phead){
	TreeNode *p = phead;

	if(p != NULL) {
		display(p->left);
		printf("%s", p->item.word);
		printf("\n");
		display(p->right);
	}
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
	element e;
	TreeNode *dictonary=NULL;

	do {
		help();
		command = getchar();
		fflush(stdin);
		switch (command) {
			case 'i' :
				printf("word :");
				gets(e.word);
				printf("meaning : ");
				gets(e.meaning);
				insertNode(&dictonary, createNode(e));
				break;
			case 'd' :
				break;
			case 's' :
				break;
			case 'p' : 
				display(dictonary);
				break;
		}
	} while(command != 'q');

	return 0;
}