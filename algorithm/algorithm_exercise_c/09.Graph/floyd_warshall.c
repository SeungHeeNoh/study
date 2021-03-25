/*
	Floyd Warshall Algorithm 구현하기
*/
#include<stdio.h>
#define ARRAY_SIZE 8
#define INF 1000L
#define MIN(a, b) ((a) < (b) ? (a) : (b));

int weight[ARRAY_SIZE][ARRAY_SIZE] = {
	{0, 10, 4, 7, INF, INF, INF, INF},
	{INF, 0, INF, INF, 8, INF, INF, INF},
	{INF, INF, 0, INF, INF, 20, 8, INF},
	{INF, 2, 2, 0, 8, INF, INF, INF},
	{INF, INF, INF, INF, 0, INF, INF, 12},
	{INF, INF, INF, INF, INF, 0, 3, INF},
	{INF, INF, INF, 12, INF, INF, 0, 7},
	{INF, INF, INF, INF, INF, 4, INF, 0}
};

void init(int map[][ARRAY_SIZE]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			map[i][j] = weight[i][j];
		}
	}
}

void displayResult(int map[][ARRAY_SIZE]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			printf("%d\t", map[i][j]);
		}
		printf("\n");
	}
}

void floydwarshall() {
	int map[ARRAY_SIZE][ARRAY_SIZE];

	init(map);

	for(int k=0; k<ARRAY_SIZE; k++) {
		for(int i=0; i<ARRAY_SIZE; i++) {
			for(int j=0; j<ARRAY_SIZE; j++) {
				if (k !=i && k != j && i != j) {
					map[i][j] = MIN(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
	}
	displayResult(map);
}

int main() {
	printf("===Result===\n");
	floydwarshall();
	return 0;
}