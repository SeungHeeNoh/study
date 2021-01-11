/*
	연결 리스트로 구현된 큐에 존재하는 요소의 개수를 반환하는 연산 get_count를 추가하여보라.
*/
#include<stdio.h>
#include<malloc.h>

typedef int element;
typedef struct QueueNode{
	element data;
	struct QueueNode *link;
}QueueNode;
typedef struct QueueType{
	QueueNode *front;
	QueueNode *rear;
}QueueType;
typedef struct ResultData{
	int bool;
	element data;
}ResultData;

int isEmpty(QueueType *q) {
	return (q->front == NULL);
}

QueueNode *createNode(element item) {
	QueueNode *new = (QueueNode *)malloc(sizeof(QueueNode));

	if (new == NULL) {
		printf("allocation error");
	} else {
		new->data = item;
		new->link = NULL;
	}

	return new;
}

void init(QueueType *q) {
	q->front = q->rear = NULL;
}

void enqueue(QueueType *q, QueueNode *newNode) {
	if (newNode == NULL) return;
	if (isEmpty(q)) {
		q->front = newNode;
		q->rear = newNode;
	} else {
		q->rear->link = newNode;
		q->rear = newNode;
	}
}

ResultData dequeue(QueueType *q) {
	ResultData rd;

	if (isEmpty(q)) {
		printf("Queue is Empty");
		rd.bool = 0;
		rd.data = 0;
	} else {
		QueueNode *target = q->front;
		rd.bool = 1;
		rd.data = target->data;
		q->front = target->link;
	}
	return rd;
}

void display(QueueType *q) {
	QueueNode *p = q->front;

	while(p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

int main() {
	QueueType queue;
	ResultData temp;

	init(&queue);

	enqueue(&queue, createNode(10));
	enqueue(&queue, createNode(20));
	enqueue(&queue, createNode(30));
	display(&queue);
	temp = dequeue(&queue);
	if (temp.bool != 0) {
		printf("dequeue item : %d\n", temp.data);
	}
	display(&queue);

	return 0;
}