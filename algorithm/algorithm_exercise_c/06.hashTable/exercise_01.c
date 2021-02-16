/*
	크기가 13인 해시 테이블이 해시 함수로 h(x) = x mod 13을 사용한다.
	원소 10, 20, 30, 40, 33, 46, 50, 60
	충돌 해결 : 개방주소 방식인 선형 조사
*/

#include<stdio.h>
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
	for (int i = 0; i < ARRAY_MAX; i++) {
		if (!array[i].use) {
			return 0;
		}
	}
	return 1;
}

void initHashTable(element array[]) {
	for (int i=0; i<ARRAY_MAX; i++) {
		array[i].data = -1;
		array[i].use = array[i].deleted = 0;
	}
}

int getIndex(int data) {
	return data % ARRAY_MAX;
}

void insertData(element r[], int data) {
	int index = getIndex(data);

	if (isFull(r)) {
		printf("Hash Table is Full.\n");
		return;
	}

	while(r[index].use){
		index = ++index % ARRAY_MAX;
	}

	r[index].data = data;
	r[index].use = 1;
	r[index].deleted = 0;
}

int findData(element r[], int data) {
	int index = getIndex(data), count = 0;

	do {
		if (r[index].data == data) {
			return index;
		}
		index = ++index % ARRAY_MAX;
		count++;
	} while((r[index].use || r[index].deleted) && count <= ARRAY_MAX);

	return -1;
}

void searchData(element r[], int data) {
	int index = findData(r, data);

	if (index < 0) {
		printf("%d is not exist.\n", data);
	} else {
		printf("%d is exist.\n", data);
	}
}

void deleteData(element r[], int data) {
	int index = findData(r, data);

	if (index < 0) {
		printf("%d is not exist.\n", data);
	} else {
		r[index].data = -1;
		r[index].use = 0;
		r[index].deleted = 1;
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

	searchData(result1, 60);
	deleteData(result1, 46);
	display(result1);
	searchData(result1, 73);

	// hash table full case
	int test2[15] = {10, 20, 30, 40, 33, 46, 50, 60, 11, 22, 33, 44, 55, 66, 77};
	element result2[ARRAY_MAX];
	initHashTable(result2);

	for (int i=0; i<15; i++) {
		insertData(result2, test2[i]);
	}
	display(result2);
	searchData(result2, 66);
	searchData(result2, 77);
}