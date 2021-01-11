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

TreeNode *search(TreeNode *phead, element targetWord) {
	TreeNode *p = phead, *resultNode = NULL;

	while (p != NULL) {
		if (compare(p->item, targetWord) < 0) {
			p=p->right;
		} else if (compare(p->item, targetWord) > 0){
			p=p->left;
		} else {
			resultNode = p;
			break;
		}
	}
	return resultNode;
}

void insertNode(TreeNode **phead, TreeNode *newNode) {
	TreeNode *p = NULL, *t = *phead;
	
	if (search(*phead, newNode->item) != NULL) {
		printf("already exist\n");
		free(newNode);
		return;
	}

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

int deleteNode(TreeNode **phead, element targetWord) {
	TreeNode *p = NULL, *child = NULL,  *succ, *succ_p, *t = *phead;
	while (t != NULL && (compare(t->item, targetWord) != 0)) {
		p = t;
		if (compare(t->item, targetWord) < 0) {
			t = t->right;
		} else if (compare(t->item, targetWord) > 0){
			t = t->left;
		}
	}

	if (t->left == NULL && t->right == NULL) {
		if (p != NULL) {
			if (p->left == t) {
				p->left = NULL;
			} else {
				p->right = NULL;
			}
		} else {
			*phead = NULL;
		}
	} else if (t->left == NULL || t->right == NULL) {
		child = (t->left != NULL) ? t->left : t->right;
		if (p != NULL) {
			if (p->left == t) {
				p->left = child;
			} else {
				p->right = child;
			}
		} else {
			*phead = child;
		}
	} else {
		succ_p = t;
		succ = t->right;

		while(succ->left != NULL) {
			succ_p = succ;
			succ = succ->left;
		}

		if (succ_p->left == succ) {
			succ_p->left = succ->right;
		} else {
			succ_p->right = succ->right;
		}

		t->item = succ->item;
		t = succ;
	}
	free(t);
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
	TreeNode *temp = NULL;

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
				printf("want delete word : ");
				gets(e.word);
				temp = search(dictonary, e);
				if (temp == NULL) {
					printf("No exist");
				} else {
					deleteNode(&dictonary, e);
					printf("deleted.\n");
				}
				break;
			case 's' :
				printf("want find word : ");
				gets(e.word);
				temp = search(dictonary, e);
				if (temp == NULL) {
					printf("No exist\n");
				} else {
					printf("meaning : %s\n", temp->item.word);
				}
				break;
			case 'p' : 
				display(dictonary);
				break;
		}
	} while(command != 'q');

	return 0;
}