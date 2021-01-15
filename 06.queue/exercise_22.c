/*
	lastOp라고 하는 변수는 가장 최근에 행해진 연산을 기억하고 있다.
	따라서 lastOp 변수는 front == rear일 때 공백 상태와 포화 상태를 구분하는데 이용될 수 있다.
	이러한 추측이 맞게 동작되는지를 프로그램으로 구현하여 테스트하라.
*/
#include<stdio.h>
#define MAX_SIZE 10

typedef struct QueueData {
	int arr[MAX_SIZE];
	int front, rear;
	char lastOp;
} QueueData;

void init(QueueData *qd) {
	qd->front = 0;
	qd->rear = 0;
	qd->lastOp = '\0';
}

int isEmpty(QueueData *qd) {
	return (qd->rear == qd->front && qd->lastOp == 'd');
}

int isFull(QueueData *qd) {
	return (qd->rear == qd->front && qd->lastOp == 'i');
}

void insert(QueueData *qd, int data) {
	if (!isFull(qd)) {
		qd->rear = (qd->rear+1) % MAX_SIZE;
		qd->arr[qd->rear] = data;
		qd->lastOp = 'i';
	} else {
		printf("Queue is Full\n");
	}
}

int delete(QueueData *qd) {
	int deleteData = 0;

	if (!isEmpty(qd)) {
		qd->front = (qd->front+1) % MAX_SIZE;
		deleteData = qd->arr[qd->front];
		qd->lastOp = 'd';
	} else {
		printf("Queue is Empty\n");
	}

	return deleteData;
}

int main() {
	QueueData test1;
	init(&test1);

	for(int i=0; i<MAX_SIZE+2; i++) {
		insert(&test1, 10 * i);
	}

	for(int i=0; i<MAX_SIZE+1; i++) {
		delete(&test1);
	}
	
	return 0;
}