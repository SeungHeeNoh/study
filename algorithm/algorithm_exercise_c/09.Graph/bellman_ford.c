/*
	Bellman Ford Algorithm 구현하기
*/
#include<stdio.h>
#include<stdlib.h>

#define ARRAY_SIZE 8
#define	QUEUE_SIZE 10
#define INF 1000L
typedef struct QueueType{
	int queue[QUEUE_SIZE];
	int front, rear;
}QueueType;

int weight[ARRAY_SIZE][ARRAY_SIZE] = {
	{0, 8, 11, 9, INF, INF, INF, INF},
	{INF, 0, INF, INF, 10, INF, INF, INF},
	{INF, INF, 0, INF, INF, 8, 8, INF},
	{INF, -15, 3, 0, 1, INF, INF, INF},
	{INF, INF, INF, INF, 0, INF, INF, 2},
	{INF, INF, INF, INF, INF, 0, -7, INF},
	{INF, INF, INF, 12, INF, INF, 0, 5},
	{INF, INF, INF, INF, INF, 4, INF, 0}
};

void initQueue(QueueType *qt) {
	qt->front = qt->rear = 0;
}

int isFullQueue(QueueType qt) {
	return (qt.rear+1)%QUEUE_SIZE == qt.front;
}

int isEmptyQueue(QueueType qt) {
	return qt.front == qt.rear;
}

void enqueue(QueueType *qt, int item) {
	if (isFullQueue(*qt)) {
		printf("Queue is Full.\n");
		exit(1);
	}
	qt->rear = (qt->rear+1)%QUEUE_SIZE;
	qt->queue[qt->rear] = item;
}

int dequeue(QueueType *qt) {
	if (isEmptyQueue(*qt)) {
		printf("Queue is Empty.\n");
		exit(1);
	}
	qt->front = (qt->front+1)%QUEUE_SIZE;

	return qt->queue[qt->front];
}

void init(int distance[], int parent[], QueueType *qt) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		distance[i] = INF;
		parent[i] = i;
	}

	distance[0] = 0;
	initQueue(qt);
	enqueue(qt, 0);
}

void displayDistance(int array[]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		printf("%c : %d\n", (char)(i+65), array[i]);
	}
}

void displayParent(int parent[]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		printf("%c parent : %c\n", (char)(i+65), (char)(parent[i]+65));
	}
}

void getShortestPath() {
	QueueType qt;
	int distance[ARRAY_SIZE],
		parent[ARRAY_SIZE];
	int v;

	init(distance, parent, &qt);

	while(!isEmptyQueue(qt)) {
		v = dequeue(&qt);

		for(int i=0; i<ARRAY_SIZE; i++) {
			if(weight[v][i] + distance[v] < distance[i]) {
				distance[i] = weight[v][i] + distance[v];
				enqueue(&qt, i);
				parent[i] = v;
			}
		}
	}
	displayDistance(distance);
	displayParent(parent);
}

int main() {
	printf("===Result===\n");
	getShortestPath();
	return 0;
}