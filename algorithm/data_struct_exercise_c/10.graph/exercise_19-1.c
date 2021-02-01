/*
	깊이 우선 탐색을 이용하여 완전 그래프에 대하여 적용한 다음에 방문된 순서로 나열하라.
*/
#include<stdio.h>

#define VERTICES 10
int selected[VERTICES];
int adj[VERTICES][VERTICES] = {
	{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
	{1, 0, 1, 1, 0, 0, 0, 0, 0, 0},
	{0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
	{0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
	{0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
	{0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
	{0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
	{0, 0, 0, 0, 0, 1, 1, 0, 1, 1},
	{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
	{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
};


void init(){
	for(int i=0; i<VERTICES; i++){
		selected[i]=0;
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
	printf("-----test1 : 20-1-----\n");
	depth_first_search(3);
	printf("\n");

	printf("-----test2 : 20-2-----\n");
	init();
	depth_first_search(6);
	printf("\n");
}