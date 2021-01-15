/*
	미로 탐색 문제
*/
#include<stdio.h>
#include<malloc.h>

#define MAZE_SIZE 6
typedef struct element {
	int row;
	int col;
}element;
typedef struct StackNode {
	element data;
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

	newNode->data.row = row;
	newNode->data.col = col;
	newNode->link = NULL;

	return newNode;
}

int isEmpty(StackNode *s) {
	return (s == NULL);
}

int checkData(element data) {
	if (data.row < 0 || data.col < 0) return 1;
	if (maze[data.row][data.col] == '.' || maze[data.row][data.col] == '1') return 1;
	return 0;
}

void insertStack(StackNode **head, StackNode *newNode) {
	if (checkData(newNode->data)) return ;

	if (*head == NULL) {
		*head = newNode;
	} else {
		newNode->link = *head;
		*head = newNode;
	}
}

element deleteStack(StackNode **head) {
	StackNode *removed = NULL;
	element point;

	if (*head == NULL) {
		printf("Underflow Occured.\n");
	} else {
		removed = *head;
		*head = removed->link;
		point = removed->data;
		free(removed);

		return point;
	}
}

void display(StackNode *head) {
	StackNode *p = head;

	while (p != NULL) {
		printf("(%d, %d)\n", p->data.row, p->data.col);
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