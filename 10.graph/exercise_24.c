/*
	Prim의 MST 알고리즘을 이용해서 최소 비용 신장 트리가 구성되는 과정을 보여라.
	0번 정점으로 시작한다.
*/
#include<stdio.h>

#define VERTICES 5
#define INF 1000

int selected[VERTICES];
int distance[VERTICES];
int weight[VERTICES][VERTICES] = {
	{0, 1, INF, 2, INF}, 
	{1, 0, 3, 1, 3},
	{INF, 3, 0, INF, 1},
	{2, 1, INF, 0, 2},
	{INF, 3, 1, 2, 0}
};

void init() {
	for(int i=0; i<VERTICES; i++){
		selected[i]=0;
		distance[i]=INF;
	}
}

int getMinVertex(){
	int v=0;

	for(int i=0; i<VERTICES; i++){
		if(!selected[i]) {
			v=i;
			break;
		}
	}
	for(int i=0; i<VERTICES; i++){
		if(!selected[i] && distance[i] < distance[v]) v=i;
	}
	return v;
}


void prim(int n){
	int u;
	init();

	distance[n]=0;

	for(int i=0; i<VERTICES; i++){
		u=getMinVertex();
		if (distance[u] == INF) return;
		selected[u]=1;
		printf("%d \n", u);

		for(int j=0; j<VERTICES; j++){
			if(!selected[j] && weight[u][j] != INF && distance[j] > weight[u][j]){
				distance[j] = weight[u][j];
			}
		}
		for(int i=0; i<VERTICES; i++){
			printf("%d ", distance[i]);
		}
		printf("\n");
	}
}

void main(){
	prim(0);
}