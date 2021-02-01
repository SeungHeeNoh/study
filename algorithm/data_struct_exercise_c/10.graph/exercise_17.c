/*
	인접 행렬로 표현된 그래프를 입력받아서 인접 리스트로 변환하는 C함수로 작성하라.
*/
#include<stdio.h>
#include<malloc.h>
#define MAX_VERTICES 50
#define MATRIC_VERTICES 6

typedef struct GraphNode{
	int vertex;
	int weight;
	struct GraphNode *link;
}GraphNode;
typedef struct GraphType{
	int n;
	GraphNode *adjList[MAX_VERTICES];
}GraphType;

void init(GraphType *g, int n){
	if(n <= MAX_VERTICES){
		g->n = n;
		for(int i=0; i<n; i++){
			g->adjList[i] = NULL;
		}
	} else {
		printf("Input of vertices is too big.\n");
	}
}

void insertEdge(GraphType *g, int u, int v, int weight){
	if(u < g->n && v < g->n){
		GraphNode *newNode = (GraphNode *)malloc(sizeof(GraphNode));
		newNode->vertex = v;
		newNode->weight = weight;
		newNode->link = g->adjList[u];
		g->adjList[u] = newNode;
	} else {
		printf("wrong vertex.\n");
	}
}

void display(GraphType g){
	for(int i=0; i<g.n; i++){
		GraphNode *p = g.adjList[i];

		printf("%d : ", i);
		while(p != NULL){
			printf("%d ", p->vertex);
			p = p->link;
		}
		printf("\n");
	}
}

void main() {
	GraphType test1;
	int adjMat[MATRIC_VERTICES][MATRIC_VERTICES] = {
		{0, 50, 45, 10, 0, 0},
		{0, 0, 10, 15, 0, 0},
		{0, 0, 0, 0, 30, 0},
		{20, 0, 0, 0, 15, 0},
		{0, 20, 35, 0, 0, 0},
		{0, 0, 0, 0, 3, 0}
	};
	init(&test1, MATRIC_VERTICES);

	for(int i=0; i<MATRIC_VERTICES; i++){
		for(int j=0; j<MATRIC_VERTICES; j++){
			if (adjMat[i][j] != 0) {
				insertEdge(&test1, i, j, adjMat[i][j]);
			}
		}
	}

	display(test1);
}