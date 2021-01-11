/*
	원형 큐에 존재하는 요소의 개수를 반환하는 연산 get_count를 추가하여보라.
*/
#include<stdio.h>

#define MAX_QUEUE_SIZE 100
typedef int element;
typedef struct QueueType{
	element array[MAX_QUEUE_SIZE];
	int front, rear;
}QueueType;

void init(QueueType *q) {
	q->front = 0;
	q->rear = 0;
}

int isEmpty(QueueType *q) {
	return (q->front == q->rear);
}

int isFull(QueueType *q) {
	return (q->front == ((q->rear+1) % MAX_QUEUE_SIZE));
}

void enqueue(QueueType *q, element item) {
	if (isFull(q)) {
		printf("Queue is Full.");
		return;
	}
	q->rear = (q->rear+1) % MAX_QUEUE_SIZE;
	q->array[q->rear] = item;
}

void display(QueueType *q) {
	int front = (q->front+1) % MAX_QUEUE_SIZE,
		rear = q->rear;

	while(front <= rear) {
		printf("%d ", q->array[(front++) % MAX_QUEUE_SIZE]);
	}
}

int main() {
	QueueType q;

	init(&q);
	enqueue(&q, 10);
	enqueue(&q, 20);
	enqueue(&q, 30);

	display(&q);
	return 0;
}