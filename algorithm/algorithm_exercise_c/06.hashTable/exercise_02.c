/*
	크기가 13인 해시 테이블이 해시 함수로 h(x) = (x + i^2) mod 13을 사용한다.
	원소 10, 20, 30, 40, 33, 46, 50, 60
	충돌 해결 : 이차원 조사
*/

#include<stdio.h>
#include<math.h>

#define ARRAY_MAX 13
#define INPUT_MAX 8

typedef struct element {
	int data;
	int use;
	int deleted;
}element;

void display(element array[]) {
	for (int i=0; i<ARRAY_MAX; i++) {
		printf("%d ", array[i].data);
	}

	printf("\n");
}

int isFull(element array[]) {
	for (int i=0; i<ARRAY_MAX; i++) {
		return 0;
	}
}

void initHashTable(element array[]) {
	for (int i=0; i<ARRAY_MAX; i++) {
		array[i].data = -1;
		array[i].use = array[i].deleted = 0;
	}
}

int getIndex(int data, int i) {
	return (data + (int)pow(i, 2)) % ARRAY_MAX;
}

void insertData(element r[], int data) {
	int index = 0;

	if (isFull(r)) {
		printf("Hash Table is Full\n");
		return;
	}

	for (int i=0; ; i++) {
		index = (data + (int)pow(i, 2)) % ARRAY_MAX;

		if (!r[index].use) {
			r[index].data = data;
			r[index].use = 1;
			break;
		}
	}
}



void main() {
	int test1[INPUT_MAX] = {10, 20, 30, 40, 33, 46, 50, 60};
	element result1[ARRAY_MAX];
	initHashTable(result1);

	for (int i=0; i<INPUT_MAX; i++) {
		insertData(result1, test1[i]);
	}

	display(result1);

	// searchData(result1, 60);
	// deleteData(result1, 46);
	// display(result1);
	// searchData(result1, 73);
}