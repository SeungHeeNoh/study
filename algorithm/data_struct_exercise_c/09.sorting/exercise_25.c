/*
	재귀 호출을 추적하기 위하여 quick_sort() 함수가 호출될 때마다 함수 이름과 인수의 값을 출력하라.
*/
#include<stdio.h>

#define MAX_SIZE 10
typedef struct SortType {
	int array[MAX_SIZE];
	int length;
}SortType;

int partition(SortType *s, int left, int right) {
	int pivot = s->array[left];
	int low=left, high=right+1, temp=0;

	do {
		do {
			low++;
		} while (low <= right && s->array[low] < pivot);
		do {
			high--;
		} while (high >= left && s->array[high] > pivot);
		if (low < high) {
			temp=s->array[low];
			s->array[low]=s->array[high];
			s->array[high]=temp;
		}
	} while (low < high);
	temp=s->array[left];
	s->array[left]=s->array[high];
	s->array[high]=temp;

	return high;
}

void quickSort(SortType *s, int left, int right) {
	if (left < right) {
		int q = partition(s, left, right);
		printf("quickSort(%d, %d)\n", left, q-1);
		quickSort(s, left, q-1);
		printf("quickSort(%d, %d)\n", q+1, right);
		quickSort(s, q+1, right);
	}
}

void display(SortType s) {
	for (int i=0; i<s.length; i++) {
		printf("%d ", s.array[i]);
	}
	printf("\n");
}

void main() {
	SortType test1 = {{67, 90, 57, 25, 84, 32, 73, 54}, 8};
	printf("quickSort(%d, %d)\n", 0, test1.length-1);
	quickSort(&test1, 0, test1.length-1);
	display(test1);
}