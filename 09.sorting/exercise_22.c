/*
	선택 정렬의 코드를 수정하여 선택 정렬의 각 단계를 출력하도록 하라.
*/
#include<stdio.h>
#define MAX_SIZE 10

typedef struct SortNode {
	int arr[MAX_SIZE];
	int length;
} SortNode;

void display(SortNode *s, int start, int end) {
	printf("(");
	for (int i=start; i<end; i++) {
		printf("%d ", s->arr[i]);
	}
	printf(")");
	printf("    ");
}

void allDisplay(SortNode *s, int start1, int end1, int start2, int end2) {
	display(s, start1, end1);
	display(s, start2, end2);
	printf("\n");
}

void selectionSort(SortNode *s) {
	int min = 10000, minIdx = 0, temp = 0;
	allDisplay(s, 0, 0, 0, s->length);

	for (int i = 0; i<s->length-1; i++) {
		min = 10000;
		for (int j=i; j<s->length; j++) {
			if (min > s->arr[j]) {
				min = s->arr[j];
				minIdx = j;
			}
		}
		if (i != minIdx) {
			temp = s->arr[i];
			s->arr[i] = s->arr[minIdx];
			s->arr[minIdx] = temp;
		}
		allDisplay(s, 0, i+1, i+1, s->length);
	}
}

int main() {
	SortNode test1 = {{17, 9, 21, 6, 3, 12}, 6};
	selectionSort(&test1);

	return 0;
}