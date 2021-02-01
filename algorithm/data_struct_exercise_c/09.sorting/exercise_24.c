/*
	퀵 정렬에서 함수가 수행되면서 정렬의 매 패스마다 교환될 hight와 low를 출력하도록 함수를 수정하라.
*/
#include<stdio.h>
#define MAX_SIZE 10

typedef struct Sort {
	int array[MAX_SIZE];
	int length;
}Sort;

int partition(Sort *s, int start, int end) {
	int pivot = s->array[start];
	int temp = 0;
	int low = start, high = end+1;

	do {
		do {
			low++;
		} while (low <= end && s->array[low] < pivot);
		do {
			high--;
		} while (start <= high && s->array[high] > pivot);

		if (low < high) {
			printf("low : %d, high : %d\n", s->array[low], s->array[high]);
			temp = s->array[low];
			s->array[low] = s->array[high];
			s->array[high] = temp;
		}
	} while (low < high);
	temp = s->array[high];
	s->array[high] = s->array[start];
	s->array[start] = temp;
	printf("low : %d, high : %d\n", s->array[low], s->array[high]);
	return high;
}

void quickSort(Sort *s, int left, int right) {
	if (left < right) {
		int q = partition(s, left, right);
		quickSort(s, left, q-1);
		quickSort(s, q+1, right);
	}
}

void display(Sort s) {
	for (int i=0; i<s.length; i++) {
		printf("%d ", s.array[i]);
	}
	printf("\n");	
}

void main() {
	Sort test1 = {{67, 90, 57, 25, 84, 32, 73, 54}, 8};
	quickSort(&test1, 0, test1.length-1);
	display(test1);
}