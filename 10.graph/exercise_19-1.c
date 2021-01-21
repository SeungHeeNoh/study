/*
	깊이 우선 탐색을 이용하여 완전 그래프에 대하여 적용한 다음에 방문된 순서로 나열하라.
*/
#include<stdio.h>

#define VERTICES 4
int selected[VERTICES];
int adj[VERTICES][VERTICES] = {
	{0, 1, 1, 1},
	{1, 0, 1, 1},
	{1, 1, 0, 1},
	{1, 1, 1, 0}
};


void init(){
	for(int i=0; i<VERTICES; i++){
		selected[VERTICES]=0;
	}
}

void depth_first_search(int n){
	printf("%d ", n);
	selected[n] = 1;

	for(int i=0; i<VERTICES; i++){
		if(!selected[i] && adj[n][i] != 0){
			depth_first_search(i);
		}
	}
}

void main(){
	init();
	depth_first_search(0);
}