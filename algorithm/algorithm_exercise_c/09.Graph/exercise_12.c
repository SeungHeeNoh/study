/*
	Warshall Algorithm을 구현하라.
*/
#include<stdio.h>
#define ARRAY_SIZE 8
#define BASE_CHAR 65
#define INF 1000L

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
			map[i][j] = (weight[i][j] > 0 && weight[i][j] < INF) ? 1 : 0;
		}
	}
}

void isConnected(int map[][ARRAY_SIZE]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			if (map[i][j]) {
				printf("%c to %c connection exist\n", (char)(i+BASE_CHAR), (char)(j+BASE_CHAR));
			} else {
				printf("%c to %c no exist.\n", (char)(i+BASE_CHAR), (char)(j+BASE_CHAR));
			}
		}
		printf("\n");
	}

	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			printf("%d\t", map[i][j]);
		}
		printf("\n");
	}
}

void warshall() {
	int map[ARRAY_SIZE][ARRAY_SIZE];

	init(map);

	for(int k=0; k<ARRAY_SIZE; k++) {
		for(int i=0; i<ARRAY_SIZE; i++) {
			for(int j=0; j<ARRAY_SIZE; j++) {
				map[i][j] = (map[i][j] || (map[i][k] && map[k][j]));
			}
		}
	}
	isConnected(map);
}

int main() {
	printf("===Result===\n");
	warshall();
	return 0;
}