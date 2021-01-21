/*
	그래프 안에 있는 간선들의 개수를 계산하는 함수를 작성하라.
*/
#include<stdio.h>
#define MAX_VERTICES 6

int adj[MAX_VERTICES][MAX_VERTICES] = {
	{0, 50, 45, 10, 0, 0},
	{0, 0, 10, 15, 0, 0},
	{0, 0, 0, 0, 30, 0},
	{20, 0, 0, 0, 15, 0},
	{0, 20, 35, 0, 0, 0},
	{0, 0, 0, 0, 3, 0}
};

int getEdgeCount() {
	int result = 0;

	for (int i=0; i<MAX_VERTICES; i++) {
		for (int j=0; j<MAX_VERTICES; j++) {
			if (adj[i][j] != 0) {
				result++;
			}
		}
	}

	return result;
}

void main() {
	printf("count of edge : %d\n", getEdgeCount());
}