/*
	Floyd Warshall Algorithm을 정점 쌍에 대한 최단경로들의 길이들뿐만 아니라
	최단경로들도 복원할 수 있는 정보를 포함하도록 알고리즘을 확장하라.
*/
#include<stdio.h>
#define ARRAY_SIZE 8
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

void init(int map[][ARRAY_SIZE], int path[][ARRAY_SIZE]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			map[i][j] = weight[i][j];
			path[i][j] = i==j ? INF : i;
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

void getPath(int path[][ARRAY_SIZE], int u, int v) {
	if (u == v) {
		printf("%c", (char)(u+65));
	} else if(path[u][v] == INF) {
		printf("no path exist");
	} else {
		getPath(path, u, path[u][v]);
		printf("-%c", (char)(v+65));
	}
}

void printPath(int path[][ARRAY_SIZE]) {
	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			printf("%d\t", path[i][j]);
		}
		printf("\n");
	}

	for(int i=0; i<ARRAY_SIZE; i++) {
		for(int j=0; j<ARRAY_SIZE; j++) {
			if (i != j) {
				printf("from %c to %c : ", (char)(i+65), (char)(j+65));
				getPath(path, i, j);
				printf("\n");
			}
		}
		printf("\n");
	}
}

void floydwarshall() {
	int map[ARRAY_SIZE][ARRAY_SIZE];
	int path[ARRAY_SIZE][ARRAY_SIZE];

	init(map, path);

	for(int k=0; k<ARRAY_SIZE; k++) {
		for(int i=0; i<ARRAY_SIZE; i++) {
			for(int j=0; j<ARRAY_SIZE; j++) {
				if (k != i && k != j && map[i][j] > map[i][k] + map[k][j]) {
					map[i][j] = map[i][k] + map[k][j];
					path[i][j] = path[k][j];
				}
			}
		}
	}
	printf("<print distance>\n");
	displayResult(map);
	printf("\n");

	printf("<print path>\n");
	printPath(path);
}

int main() {
	printf("===Result===\n");
	floydwarshall();
	return 0;
}