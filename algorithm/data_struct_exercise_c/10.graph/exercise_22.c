/*
	다음의 그래프에서 가능한 깊이 우선 신장 트리를 모두 나열하라.
*/
#include<stdio.h>
#define MAX_VERTICES 5

int selected[MAX_VERTICES];
int adjMatrix[MAX_VERTICES][MAX_VERTICES]={
	{0, 1, 1, 1, 0},
	{1, 0, 1, 0, 1},
	{1, 1, 0, 0, 1},
	{1, 0, 0, 0, 1},
	{0, 1, 1, 1, 0}
};

void init(){
	for(int i=0; i<MAX_VERTICES; i++){
		selected[i]=0;
	}
}

void depthFirstSearch(int n){
	selected[n]=1;
	printf("%d ", n);

	for(int i=0; i<MAX_VERTICES; i++){
		if(!selected[i] && adjMatrix[n][i] != 0){
			depthFirstSearch(i);
		}
	}
}

void main() {
	for(int i=0; i<MAX_VERTICES; i++){
		printf("----test%d : start %d----\n", i+1, i);
		init();
		depthFirstSearch(i);
		printf("\n");
	}
}