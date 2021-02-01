/*
	삽입 정렬을 수행하는 함수에 함수 포인터를 추가하여 오름차순, 내림차순을 선택할 수 있도록 하여보자.
*/
#include<stdio.h>
#define MAX_SIZE 10

typedef int element;
typedef struct SortStruct {
	element arr[MAX_SIZE];
	int lenght;
} SortStruct;

int ascend(int x, int y) {
	return (x < y);
}

int descend(int x, int y) {
	return (x > y);
}

void display(SortStruct *s) {
	for (int i=0; i<s->lenght; i++) {
		printf("%d ", s->arr[i]);
	}
	printf("\n");
}

void insertionSort(SortStruct *s, int(*f)()) {
	int i, j, key = 0;
	int n = s->lenght;

	for (i=1; i<n; i++) {
		key = s->arr[i];

		for (j=i-1; j>=0 && f(key, s->arr[j]); j--) {
			s->arr[j+1] = s->arr[j];
		}
		s->arr[j+1] = key;
	}
}

int main() {
	SortStruct test1 = {{17, 9, 21, 6, 3, 12}, 6};
	SortStruct test2 = {{17, 9, 21, 6, 3, 12}, 6};

	printf("<test1>\n");
	insertionSort(&test1, descend);
	display(&test1);

	printf("<test2>\n");
	insertionSort(&test2, ascend);
	display(&test2);

	return 0;
}