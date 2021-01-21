/*
	주어진 정점의 진출 차수를 계산하는 함수를 작성하라.
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

int getOutDegree(int n) {
	int result = 0;

	for (int i=0; i<MAX_VERTICES; i++) {
		if (adj[n][i] != 0) {
			result++;
		}
	}

	return result;
}

void main() {
	printf("out-degree of vertex %d : %d\n", 0, getOutDegree(0));
	printf("out-degree of vertex %d : %d\n", 3, getOutDegree(3));
	printf("out-degree of vertex %d : %d\n", 5, getOutDegree(5));
}