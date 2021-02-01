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

int isEmpty(QueueType *q) {
	return q->front == NULL;
}

void enqueue(QueueType *q, QueueNode *new) {
	if (q->front == NULL) {
		q->front = q->rear = new;
	} else {
		q->rear->link = new;
		q->rear = new;
	}
}

int dequeue(QueueType *q) {
	int data = 0;

	if (q->front == NULL) {
		printf("Queue is Empty");
	} else {
		QueueNode *removed;
		removed = q->front;
		q->front = removed->link;
		data = removed->data;

		if (isEmpty(q)) {
			q->rear = NULL;
		}
		free(removed);
	}

	return data;
}

int peek(QueueType *q) {
	int data = 0;
	if (!isEmpty(q)) {
		data = q->front->data;
	}

	return data;
}

int fib(QueueType *q, int data) {
	int result = 0;

	enqueue(q, createNode(0));
	enqueue(q, createNode(1));

	for (int i=0; i<data-1; i++) {
		result = dequeue(q) + peek(q);
		enqueue(q, createNode(result));
	}

	return result;
}

void display(QueueType *q) {
	QueueNode *p = q->front;

	while (p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

int main() {
	printf("<test1>\n");
	QueueType test1;
	init(&test1);
	printf("result = %d\n", fib(&test1, 5));

	printf("<test2>\n");
	QueueType test2;
	init(&test2);
	printf("result = %d\n", fib(&test2, 2));

	printf("<test3>\n");
	QueueType test3;
	init(&test3);
	printf("result = %d\n", fib(&test3, 17));

	return 0;
}