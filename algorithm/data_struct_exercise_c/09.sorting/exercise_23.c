/*
	제일 작은 값을 선택하는 선택 정렬 알고리즘을 제일 큰 값을 선택하도록 변경하라.
	정수 배열은 여전히 오름차순으로 정렬되어야 한다.
*/
#include<stdio.h>

#define MAX_SIZE 10

typedef struct Sort {
	int array[MAX_SIZE];
	int length;
}Sort;

void selectionSort(Sort *s) {
	int temp, idx;

	for (int i=s->length-1; i>0; i--) {
		idx = i;
		for (int j=0; j<i; j++) {
			if (s->array[idx] < s->array[j]) {
				idx = j;
			}
		} 
		if (i != idx) {
			temp = s->array[i];
			s->array[i] = s->array[idx];
			s->array[idx] = temp;
		}
	}
}

void display(Sort s) {
	for (int i=0; i<s.length; i++) {
		printf("%d ", s.array[i]);
	}
	printf("\n");
}

void main() {
	Sort test1 = {{17, 9, 21, 6, 3, 12}, 6};
	selectionSort(&test1);
	display(test1);
}