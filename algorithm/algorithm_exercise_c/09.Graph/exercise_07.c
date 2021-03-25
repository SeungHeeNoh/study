/*
	최단 거리를 다익스트라 알고리즘으로 구하는 과정을 보여라.
*/
#include<stdio.h>
#include<stdlib.h>

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

void init(int distance[], int selected[]) {
	for (int i=0; i<ARRAY_SIZE; i++) {
		distance[i] = INF;
		selected[i] = 0;
	}

	distance[0] = 0;
}

int getMinDistance(int distance[], int selected[]) {
	int min = INF, idx = -1;

	for (int i=0; i<ARRAY_SIZE; i++) {
		if (!selected[i] && min > distance[i]) {
			min = distance[i];
			idx = i;
		}
	}

	return idx;
}

void getShortestPath() {
	int distance[ARRAY_SIZE],
		selected[ARRAY_SIZE],
		v = -1;

	init(distance, selected);

	for (int i=0; i<ARRAY_SIZE; i++) {
		v = getMinDistance(distance, selected);
		if (v < 0) {
			printf("Cannot found Shortest Path.\n");
			exit(1);
		}
		selected[v] = 1;
		printf("%c ", (char)(v + 65));

		for(int i=0; i<ARRAY_SIZE; i++) {
			if (!selected[i] && distance[i] > distance[v]+weight[v][i]) {
				distance[i] = distance[v]+weight[v][i];
			}
		}
	}
}

int main() {
	printf("===Result===\n");
	getShortestPath();
	return 0;
}