/*
	피보나치 수를 효과적으로 계싼하기 위하여 큐를 이용할 수 있다.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct QueueNode {
	int data;
	struct QueueNode *link;
} QueueNode;
typedef struct QueueType {
	QueueNode *front, *rear;
} QueueType;

QueueNode *createNode(int data) {
	QueueNode *newNode = (QueueNode *)malloc(sizeof(QueueNode));

	if (newNode == NULL) {
		printf("Allocation Error Occur\n");
	} else {
		newNode->data = data;
		newNode->link = NULL;
	}

	return newNode;
}

void init(QueueType *q) {
	q->front = NULL;
	q->rear = NULL;
}

void enqueue(QueueType *q, QueueNode *new) {
	if (q->front == NULL) {
		q->front = q->rear = new;
	} else {
		q->rear->link = new;
		q->rear = new;
	}
}

void dequeue(QueueType *q) {
	if (q->front == NULL) {
		printf("Queue is Empty");
	} else {
		QueueNode *removed;
		removed = q->front;
		q->front = removed->link;
		free(removed);
	}
}

void display(QueueType *q) {
	QueueNode *p = q->front;

	while (p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
}

int main() {
	QueueType test1;
	init(&test1);

	enqueue(&test1, createNode(10));
	enqueue(&test1, createNode(22));
	enqueue(&test1, createNode(3));
	enqueue(&test1, createNode(10));
	enqueue(&test1, createNode(18));
	dequeue(&test1);


	display(&test1);
	return 0;
}