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


int main() {
	QueueType q;
	init(&q);

	return 0;
}