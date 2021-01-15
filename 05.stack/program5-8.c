/*
	미로 탐색 문제
*/
#include<stdio.h>
#include<malloc.h>

#define MAZE_SIZE 6
typedef struct StackNode {
	int row;
	int col;
	struct StackNode *link;
}StackNode;

char maze[MAZE_SIZE][MAZE_SIZE] = {
		{'1', '1', '1', '1', '1', '1'},
		{'e', '0', '0', '0', '1', '1'},
		{'1', '1', '0', '1', '1', '1'},
		{'1', '1', '0', '1', '1', '1'},
		{'1', '0', '0', '0', '0', 'x'},
		{'1', '1', '1', '1', '1', '1'}
	};

StackNode *createNode(int row, int col) {
	StackNode *newNode = (StackNode *)malloc(sizeof(StackNode));

	newNode->row = row;
	newNode->col = col;
	newNode->link = NULL;

	return newNode;
}

void insertStack(StackNode **head, StackNode *newNode) {
	if (*head == NULL) {
		*head = newNode;
	} else {
		newNode->link = *head;
		*head = newNode;
	}
}

void deleteStack(StackNode **head) {
	if (*head == NULL) {
		printf("Underflow Occured.\n");
	} else {
		StackNode *removed = NULL;
		removed = *head;
		*head = removed->link;
		printf("(%d, %d) removed.\n", removed->row, removed->col);
		free(removed);
	}
}

void display(StackNode *head) {
	StackNode *p = head;

	while (p != NULL) {
		printf("(%d, %d)\n", p->row, p->col);
		p = p->link;
	}
}

int main() {
	StackNode *s = NULL;

	insertStack(&s, createNode(1, 1));
	insertStack(&s, createNode(2, 1));
	insertStack(&s, createNode(1, 4));
	insertStack(&s, createNode(5, 1));
	display(s);

	deleteStack(&s);
	deleteStack(&s);
	deleteStack(&s);
	deleteStack(&s);
	deleteStack(&s);
	display(s);
	return 0;
}