/*
	너비 우선 탐색을 이용하여 완전 그래프에 대하여 적용한 다음에 방문된 순서로 나열하라.
*/
#include<stdio.h>

#define VERTICES 10
#define QUEUE_MAX 20
typedef struct QueueType{
	int queue[QUEUE_MAX];
	int front;
	int rear;
}QueueType;

int selected[VERTICES];
int adj[VERTICES][VERTICES] = {
	{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
	{1, 0, 1, 1, 0, 0, 0, 0, 0, 0},
	{0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
	{0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
	{0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
	{0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
	{0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
	{0, 0, 0, 0, 0, 1, 1, 0, 1, 1},
	{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
	{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
};

void queueInit(QueueType *q){
	q->front=q->rear=0;
}

int isQueueFull(QueueType q){
	return q.front == (q.rear+1)%QUEUE_MAX;
}

int isQueueEmpty(QueueType q){
	return q.front==q.rear;
}

void enqueue(QueueType *q, int data){
	if (isQueueFull(*q)){
		printf("Queue is Full.\n");
	} else {
		q->rear = (q->rear+1)%QUEUE_MAX;
		q->queue[q->rear]=data;
	}
	
}

int dequeue(QueueType *q){
	int data=0;
	if (isQueueEmpty(*q)) {
		printf("Queue is Empty.\n");
	} else {
		q->front = (q->front+1)%QUEUE_MAX;
		data = q->queue[q->front];
	}
	return data;
}

void init(){
	for(int i=0; i<VERTICES; i++){
		selected[i]=0;
	}
}

void breadth_first_search(int start){
	int n;
	QueueType q;
	queueInit(&q);

	selected[start]=1;
	enqueue(&q, start);
	printf("%d ", start);

	while(!isQueueEmpty(q)){
		n = dequeue(&q);
		for(int i=0; i<VERTICES;i++){
			if (!selected[i] && adj[n][i] != 0){
				selected[i]=1;
				printf("%d ", i);
				enqueue(&q, i);
			}
		}
	}
}

void main(){
	init();
	printf("-----test1 : 20-3-----\n");
	breadth_first_search(3);
	printf("\n");

	printf("-----test2 : 20-4-----\n");
	init();
	breadth_first_search(6);
	printf("\n");
}