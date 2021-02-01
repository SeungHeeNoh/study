#include<stdio.h>
#define TRUE 1;
#define FALSE 0;
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

int distance[MAX_VERTICES];
int selected[MAX_VERTICES];

void init(int start, int n) {
	for (int i=0; i<n; i++) {
		distance[i] = weight[start][i];
		selected[i] = FALSE;
	}
}

int choose(int n) {
	int v;

	for (int i=0; i<n; i++) {
		if (!selected[i]) {
			v = i;
			break;
		}
	}

	for (int i=0; i<n; i++) {
		if (!selected[i] && distance[i] != INF && distance[i] < distance[v]) v = i;
	}
	
	return v;
}

void dijkstra(int start, int n) {
	int u;
	init(start, n);
	distance[start] = 0;

	for (int i=0; i<n; i++) {
		u = choose(n);
		printf("%d ", u);
		selected[u] = TRUE;
		for (int j=0; j<n; j++) {
			if (!selected[j] && distance[j] > weight[u][j] + distance[u]) {
				distance[j] = weight[u][j] + distance[u];
			}
		}
	}
}

void main() {
	dijkstra(0, MAX_VERTICES);
}