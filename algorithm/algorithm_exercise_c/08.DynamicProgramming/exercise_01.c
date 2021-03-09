/*
	동적 프로그래밍에 의한 최적 행렬 곱셈 순서를 찾으라.
*/

#include<stdio.h>
#define ARRAY_SIZE 6

int minimum_mult(int d[], int minOrder[][ARRAY_SIZE]) {
	int map[ARRAY_SIZE][ARRAY_SIZE];

	for (int diagonal=0; diagonal<ARRAY_SIZE; diagonal++) {
		for (int i=1; i<ARRAY_SIZE-diagonal; i++) {
			int j=i+diagonal,
				min = 100000000, minIdx, temp;

			if (i == j) {
				map[i][j] = 0;
			} else {
				for(int k=i; k<j; k++) {
					temp = map[i][k] + map[k+1][j] + d[i-1] * d[k] * d[j];
					if (temp < min) {
						min = temp;
						minIdx = k;
					}
				}
				map[i][j] = min;
				minOrder[i][j] = minIdx;
			}
		}
	}
	return map[1][ARRAY_SIZE-1];
}

void order(int minOrder[][ARRAY_SIZE], int i, int j) {
	int k;

	if (i == j) {
		printf("A%d", i);
	} else {
		k = minOrder[i][j];
		printf("(");
		order(minOrder, i, k);
		printf("*");
		order(minOrder, k+1, j);
		printf(")");
	}
}

int main() {
	int p[ARRAY_SIZE] = {10, 5, 20, 7, 15, 3};
	int minOrder[ARRAY_SIZE][ARRAY_SIZE];

	printf("minimum multiplication : %d\n", minimum_mult(p, minOrder));
	printf("order : ");
	order(minOrder, 1, ARRAY_SIZE-1);

	return 0;
}