/*
	깊이우선탐색을 하는 과정을 그려라.
*/
#include<stdio.h>
#define ARRAY_SIZE 10
typedef struct StackType {
	int top;
	int stack[ARRAY_SIZE];
}StackType;
int array[ARRAY_SIZE][ARRAY_SIZE] = {
		{0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
		{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
		{1, 0, 0, 1, 0, 1, 1, 0, 0, 0},
		{0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
		{0, 1, 0, 1, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 1, 0, 1, 1},
		{0, 0, 1, 1, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 1, 0, 0, 1, 0}
	};

void initStack(StackType *st) {
	st->top = -1;

	for (int i=0; i<ARRAY_SIZE; i++) {
		st->stack[i] = -1;
	}
}

int isStackEmpty(StackType st) {
	return st.top == -1;
}

int isStackFull(StackType st) {
	return st.top == ARRAY_SIZE-1;
}

void push(StackType *st, int data) {
	if (isStackFull(*st)) {
		printf("Stack is Full.\n");
	} else {
		st->stack[++st->top] = data;
	}
}

int pop(StackType *st) {
	int data = -1;

	if (isStackEmpty(*st)) {
		printf("Stack is Empty.\n");
	} else {
		data = st->stack[st->top--];
	}
	return data;
}

void initDFS(StackType *st, int selected[]) {
	initStack(st);

	for (int i=0; i<ARRAY_SIZE; i++) {
		selected[i] = 0;
	}

	push(st, 0);
	selected[0] = 1;
}

void getDFS() {
	StackType st;
	int selected[ARRAY_SIZE];
	int v = 0;

	initDFS(&st, selected);

	while(!isStackEmpty(st)) {
		v = pop(&st);
		if (v == -1) {
			return;
		}
		printf("%c ", (char)(v+65));

		for (int i=0; i<ARRAY_SIZE; i++) {
			if (!selected[i] && array[v][i]) {
				selected[i] = 1;
				push(&st, i);
			}
		}
	}
}

int main() {
	printf("DFS result : ");
	getDFS();
	return 0;
}