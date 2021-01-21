/*
	만약 그래프가 인접 리스트로 표현되어 있다고 가정하였을 때,
	주어진 정점의 진출 차수를 계산하는 함수를 작성하라.
*/
#include<stdio.h>
#include<malloc.h>
#define MAX_VERTICES 50

typedef struct GraphNode{
	int vertex;
	int weight;
	struct GrapNode *link;
}GraphNode;
typedef struct GraphType{
	int n;
	GraphNode *adjList[MAX_VERTICES];
}GraphType;

void init(GraphType *g) {
	g->n = 0;
	for (int i=0; i<MAX_VERTICES; i++) {
		g->adjList[i] = NULL;
	}
}

void insertVertex(GraphType *g, int k) {
	if ((g->n) +1 <= MAX_VERTICES) {
		g->n+=1;
	} else {
		printf("Number of vertices is exceeding.\n");
	}
}

void insertEdge(GraphType *g, int u, int v, int weight) {
	if (u < g->n && v < g->n) {
		GraphNode *newNode;
		newNode = (GraphNode *)malloc(sizeof(GraphNode));
		newNode->vertex = v;
		newNode->weight = weight;
		newNode->link = g->adjList[u];
		g->adjList[u] = newNode;
	}
}

int getOutDegree(GraphType g, int n) {
	int result = 0;
	GraphNode *p = g.adjList[n];

	while(p != NULL) {
		result++;
		p=p->link;
	}

	return result;
}

void display(GraphType g) {
	for (int i=0; i<g.n; i++) {
		GraphNode *p = g.adjList[i];
		printf("%d : ", i);
		while(p != NULL) {
			printf("%d ", p->vertex);
			p=p->link;
		}
		printf("\n");
	}
}

void main() {
	GraphType test1;
	init(&test1);
	for (int i=0; i<6; i++) {
		insertVertex(&test1, 0);
	}
	
	insertEdge(&test1, 0, 1, 50);
	insertEdge(&test1, 0, 2, 45);
	insertEdge(&test1, 0, 3, 10);
	insertEdge(&test1, 1, 2, 10);
	insertEdge(&test1, 1, 3, 15);
	insertEdge(&test1, 2, 4, 30);
	insertEdge(&test1, 3, 0, 20);
	insertEdge(&test1, 3, 4, 15);
	insertEdge(&test1, 4, 1, 20);
	insertEdge(&test1, 4, 2, 35);
	insertEdge(&test1, 5, 4, 3);
	display(test1);

	printf("out-degree of vertex %d : %d\n", 0, getOutDegree(test1, 0));
	printf("out-degree of vertex %d : %d\n", 3, getOutDegree(test1, 3));
	printf("out-degree of vertex %d : %d\n", 5, getOutDegree(test1, 5));
}