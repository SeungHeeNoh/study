#include<stdio.h>
#define MAX_VERTICES 7
#define INF 1000

int weight[MAX_VERTICES][MAX_VERTICES] = {
	{0, 7, INF, INF, 3, 10, INF},
	{7, 0, 4, 10, 2, 6, INF},
	{INF, 4, 0, 2, INF, INF, INF},
	{INF, 10, 2, 0, 11, 9, 4},
	{3, 2, INF, 11, 0, INF, 5},
	{10, 6, INF, 9, INF, 0, INF},
	{INF, INF, INF, 4, 5, INF, 0}
};


void floyd(int n) {
	for (int k=0; k<n; k++) {
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (weight[i][j] > weight[i][k]+weight[k][j]) {
					weight[i][j] = weight[i][k]+weight[k][j];
				}
			}
		}
	}
}

void main() {
	floyd(MAX_VERTICES);

	for (int i=0; i<MAX_VERTICES; i++) {
		for (int j=0; j<MAX_VERTICES; j++) {
			printf("%d ", weight[i][j]);
		}
		printf("\n");
	}
}