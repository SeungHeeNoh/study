/*
	동적 프로그래밍에 의한 최적 행렬 곱셈 순서를 찾으라.
*/

#include<stdio.h>
#define ARRAY_SIZE 6

int minimum_mult(int d[]) {
	int map[ARRAY_SIZE][ARRAY_SIZE];

	for (int diagonal=0; diagonal<ARRAY_SIZE; diagonal++) {
		for (int i=1; i<ARRAY_SIZE-diagonal; i++) {
			int j=i+diagonal,
				min = 100000000, temp;

			if (i == j) {
				map[i][j] = 0;
			} else {
				for(int k=i; k<j; k++) {
					temp = map[i][k] + map[k+1][j] + d[i-1] * d[k] * d[j];
					min = temp < min ? temp : min;
				}
				map[i][j] = min;
			}
		}
	}
	return map[1][ARRAY_SIZE-1];
}

int main() {
	int p[ARRAY_SIZE] = {10, 5, 20, 7, 15, 3};
	printf("%d", minimum_mult(p));

	return 0;
}