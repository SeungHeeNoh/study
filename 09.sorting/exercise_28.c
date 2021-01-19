/*
	합병 정렬에서의 재귀 호출을 추적하기 위하여 함수 merge_sort가 호출되면 함수 이름과 인수의 값을 화면에 출력하게 변경하여보라.
*/
#include<stdio.h>

#define MAX_SIZE 10
typedef struct SortType {
	int array[MAX_SIZE];
	int length;
}SortType;

void merge(SortType *result, SortType *s, int left, int mid, int right) {
	int leftIdx = left, rightIdx = mid+1;
	int i = left;

	while (leftIdx <= mid && rightIdx <= right) {
		if (s->array[leftIdx] > s->array[rightIdx]) {
			result->array[i++] = s->array[rightIdx++];
		} else {
			result->array[i++] = s->array[leftIdx++];
		}
	}

	while (leftIdx <= mid) {
		result->array[i++] = s->array[leftIdx++];
	}

	while (rightIdx <= right) {
		result->array[i++] = s->array[rightIdx++];
	}

	for (int i = left; i<=right; i++) {
		s->array[i] = result->array[i];
	}
}

void mergeSort(SortType *result, SortType *s, int left, int right) {
	if (left < right) {
		int mid = (left+right)/2;

		printf("mergeSort(%d, %d)\n", left, mid);
		mergeSort(result, s, left, mid);
		printf("mergeSort(%d, %d)\n", mid+1, right);
		mergeSort(result, s, mid+1, right);
		merge(result, s, left, mid, right);
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
	SortType result1 = {{0, }, test1.length};
	mergeSort(&result1, &test1, 0, test1.length-1);
	display(test1);
}