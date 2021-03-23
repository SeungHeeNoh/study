/*
	프림 알고리즘으로 최소신장트리를 구하는 과정을 보여라.
*/
#include<stdio.h>
#define INF 1000L
#define ARRAY_SIZE 8

int weight[ARRAY_SIZE][ARRAY_SIZE] = {
	{INF, 8, 11, 9, INF, INF, INF, INF},
	{8, INF, INF, 15, 10, INF, INF, INF},
	{11, INF, INF, 3, INF, 8, 8, INF},
	{9, 15, 3, INF, 1, INF, 12, INF},
	{INF, 10, INF, 1, INF, INF, INF, 2},
	{INF, INF, 8, INF, INF, INF, 7, 4},
	{INF, INF, 8, 12, INF, 7, INF, 5},
	{INF, INF, INF, INF, 2, 4, 5, INF}
};

void initMST(int selected[], int distance[]) {
	for (int i=0; i<ARRAY_SIZE; i++) {
		selected[i] = 0;
		distance[i] = INF;
	}

	distance[0] = 0;
}

int getMinVertex(int selected[], int distance[]) {
	int v;

	for (int i=0; i<ARRAY_SIZE; i++) {
		if (!selected[i]) {
			v = i;
			break;
		}
	}

	for (int i=0; i<ARRAY_SIZE; i++) {
		if (!selected[i] && distance[i] < distance[v]) v = i;
	}

	return v;
}

void getMST() {
	int selected[ARRAY_SIZE],
		distance[ARRAY_SIZE],
		edge = 0,
		v = 0;

	initMST(selected, distance);

	while(edge < ARRAY_SIZE) {
		v = getMinVertex(selected, distance);
		printf("%c ", (char)(v+65));
		selected[v] = 1;
		if (distance[v] == INF) return;
		edge++;

		for(int i=0; i<ARRAY_SIZE; i++) {
			if (!selected[i] && weight[v][i] != INF && weight[v][i] < distance[i]) {
				distance[i] = weight[v][i];
			}
		}
	}
}

int main() {
	printf("prime : ");
	getMST();
	return 0;
}