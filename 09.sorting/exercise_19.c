/*
	삽입 정렬의 코드를 수정하여 삽입 정렬의 각 단계를 출력하도록 하라.
*/
#include<stdio.h>
#define MAX_SIZE 10
typedef struct SortStruct{
	int arr[MAX_SIZE];
	int length;
} SortStruct;

void display(SortStruct *s, int start, int end) {
	printf("(");
	for (int i = start; i < end; i++) {
		printf("%d ", s->arr[i]);
	}
	printf(")");
	printf("     ");
}

void callDisplay(SortStruct *s, int start1, int end1, int start2, int end2) {
	display(s, start1, end1);
	display(s, start2, end2);
	printf("\n");
};

void insertSorting(SortStruct *s) {
	int i=0, j, key;
	
	callDisplay(s, 0, i, i, s->length);
	for (i=1; i<s->length; i++) {
		key = s->arr[i];
		for (j=i-1; j>=0 && key < s->arr[j]; j--) {
			s->arr[j+1] = s->arr[j];
		}
		s->arr[j+1] = key;
		callDisplay(s, 0, i, i, s->length);
	}
	callDisplay(s, 0, i, i, s->length);
}

int main() {
	SortStruct test1 = {{17, 9, 21, 6, 3, 12}, 6};
	insertSorting(&test1);
	return 0;
}