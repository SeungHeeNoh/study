/*
	간선을 삭제하는 delete_edge 연산을 인접 행렬에 대하여 구현하라.
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

void deleteEdge(int u, int v){
	if(u <= MAX_VERTICES && v <= MAX_VERTICES){
		adj[u][v] = 0;
	}else{
		printf("wrong vertex.\n");
	}
}

void main() {
	deleteEdge(3, 0);
	deleteEdge(5, 4);
	deleteEdge(1, 3);

	for(int i=0; i<MAX_VERTICES; i++){
		for(int j=0; j<MAX_VERTICES; j++) {
			printf("%d ", adj[i][j]);
		}
		printf("\n");
	}
}
