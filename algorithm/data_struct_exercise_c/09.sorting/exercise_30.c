/*
	기수 정렬 프로그램에서 다음과 같이 각 버켓의 내용을 화면에 출력하는 함수 print_bucket()을 프로그램에 추가하라.
*/
#include<stdio.h>
#define MAX_SIZE 10

typedef struct Queue {
	int front, rear;
	int arr[MAX_SIZE];
}Queue;

typedef struct Bucket {
	Queue arr[MAX_SIZE];
}Bucket;

void displayBucket(Bucket *b) {
	int start, end;

	printf("========================\n");
	for (int i = 0; i < MAX_SIZE; i++) {
		start = b->arr[i].front;
		end = b->arr[i].rear;
		printf("[%d] -> ", i);
		for(int j = start+1; j <= end; j = (j+1)%MAX_SIZE) {
			printf("%d ", b->arr[i].arr[j]);
		}
		printf("\n");
	}
	printf("========================\n");
}

void displayArr(int arr[]) {
	for (int i = 0; i < MAX_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void initQueue(Queue *q) {
	q->front = q->rear = 0;
}

int isEmptyQueue(Queue *q) {
	return q->front == q->rear;
}

int isFullQueue(Queue *q) {
	return (q->rear+1) % MAX_SIZE == q->front;
}

void enqueue(Queue *q, int data) {
	if (isFullQueue(q)) {
		printf("Queue is FULL\n");
	} else {
		q->rear = (q->rear+1) % MAX_SIZE;
		q->arr[q->rear] = data;
	}
}

int dequeue(Queue *q) {
	int data = 0;

	if (isEmptyQueue(q)) {
		printf("Queue is Empty.\n");
	} else {
		q->front = (q->front+1) % MAX_SIZE;
		data = q->arr[q->front];
	}

	return data;
}

void initBucket(Bucket *b) {
	for (int i = 0; i < MAX_SIZE; i++) {
		initQueue(&(b->arr[i]));
	}
}

void dequeueBucket(int arr[], Bucket *b) {
	int idx = 0;

	for (int i = 0; i < MAX_SIZE; i++) {
		Queue *temp = &(b->arr[i]);
		while (!isEmptyQueue(temp)) {
			arr[idx++] = dequeue(temp);
		}
	}
}

void radixSort(int arr[], int digit) {
	Bucket bucket;
	initBucket(&bucket);

	int type, radix, target, factor = 1;
	for (int i = 1; i <= digit; i++) {
		for (int j = 0; j < MAX_SIZE; j++) {
			target = arr[j];
			radix = target / factor % 10;
			enqueue(&((&bucket)->arr[radix]), target);
		}
		displayBucket(&bucket);
		dequeueBucket(arr, &bucket);
		factor *= 10;
	}
}

int main() {
	int arr1[MAX_SIZE] = {41, 67, 34, 0, 69, 24, 78, 58, 62, 64};
	radixSort(arr1, 2);
	displayArr(arr1);

	return 0;
}