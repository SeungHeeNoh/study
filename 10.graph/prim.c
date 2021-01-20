#include<stdio.h>

#define TRUE 1;
#define FALSE 0;
#define MAX_VERTICES 8
#define INF 1000

int weight[MAX_VERTICES][MAX_VERTICES] = {
	{0, 29, INF, 6, INF, INF, INF, 1},
	{10, 0, 4, INF, INF, 2, INF, INF},
	{INF, 4, 0, 11, INF, 7, INF, INF},
	{6, INF, 11, 0, INF, INF, INF, 3},
	{INF, INF, INF, INF, 0, 5, INF, 8},
	{INF, 2, 7, INF, 5, 0, 9, INF},
	{INF, INF, INF, INF, INF, 9, 0, 12},
	{1, INF, INF, 3, 8, INF, 12, 0}
};

int selected[MAX_VERTICES];
int distance[MAX_VERTICES];

void init(int n) {
	for (int i=0; i<n; i++) {
		selected[i] = FALSE;
		distance[i] = INF;
	}
}

int get_min_vertex(int n) {
	int v;
	for (int i=0; i<n; i++) {
		if (!selected[i]){
			v = i;
			break;
		}
	}

	for (int i=0; i<n; i++) {
		if (!selected[i] && distance[i] != INF && distance[i] < distance[v]) v = i;
	}

	return v;
}

void prim(int s, int n) {
	int u;

	init(n);
	distance[s] = 0;

	for (int i=0; i<n; i++) {
		u = get_min_vertex(n);
		selected[u] = TRUE;
		printf("%d ", u);
		if (distance[u] == INF) return;
		for (int j=0; j<n; j++) {
			if (!selected[j] && weight[u][j] !=INF && distance[j] > weight[u][j]) {
				distance[j] = weight[u][j];
			}
		}
	}
}

void main() {
	prim(0, MAX_VERTICES);
}