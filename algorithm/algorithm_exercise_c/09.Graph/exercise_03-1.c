/*
	너비우선탐색을 하는 과정을 그려라.
*/
#include<stdio.h>
#define ARRAY_SIZE 10
typedef struct QueueType{
	int front;
	int rear;
	int queue[ARRAY_SIZE];
}QueueType;

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

void initQueue(QueueType *qt) {
	qt->front = 0;
	qt->rear = 0;

	for (int i=0; i<ARRAY_SIZE; i++) {
		qt->queue[i] = -1;
	}
}

int isQueueEmpty(QueueType qt) {
	return qt.front == qt.rear;
}

int isQueueFull(QueueType qt) {
	return (qt.rear+1)/ARRAY_SIZE == qt.front;
}

void enqueue(QueueType *qt, int data) {
	qt->queue[++qt->rear] = data;
}

int dequeue(QueueType *qt) {
	return qt->queue[++qt->front];
}

void initBFS(QueueType *qt, int arr[]) {
	initQueue(qt);

	for(int i=0; i<ARRAY_SIZE; i++) {
		arr[i] = 0;
	}

	enqueue(qt, 0);
	arr[0] = 1;
}

void getBFS() {
	QueueType qt;
	int selected[ARRAY_SIZE];
	int v;

	initBFS(&qt, selected);
	

	while(!isQueueEmpty(qt)) {
		v = dequeue(&qt);
		printf("%c ", (char)(v+65));

		for(int i=0; i<ARRAY_SIZE; i++) {
			if (!selected[i] && array[v][i]) {
				selected[i] = 1;
				enqueue(&qt, i);
			}
		}
	}
}

int main() {
	printf("BFS result : ");
	getBFS();
	return 0;
}