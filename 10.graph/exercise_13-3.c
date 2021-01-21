/*
	인접행렬일 때
	그래프 안에 있는 간선들의 개수를 계산하는 함수를 작성하라.
*/
#include<stdio.h>
#include<malloc.h>
#define MAX_VERTICES 50

typedef struct GraphNode{
	int vertex;
	int weight;
	struct GraphNode *link;
}GraphNode;
typedef struct GraphType{
	int n;
	GraphNode *idjList[MAX_VERTICES];
}GraphType;

void init(GraphType *g, int n) {
	if (n> MAX_VERTICES) {
		printf("Input of vertices is too big.\n");
	} else {
		g->n=n;
		for(int i=0; i<n; i++) {
			g->idjList[i]=NULL;
		}
	}
}

void insertEdge(GraphType *g, int u, int v, int weight) {
	if (u<g->n && v<g->n) {
		GraphNode *newNode = (GraphNode *)malloc(sizeof(GraphNode));
		newNode->vertex=v;
		newNode->weight=weight;
		newNode->link=g->idjList[u];
		g->idjList[u]=newNode;
	} else {
		printf("Input of vertex is not vaild.\n");
	}
}

int getEdgeCount(GraphType g) {
	int result = 0;

	for (int i=0; i<g.n; i++) {
		GraphNode *p = g.idjList[i];

		while(p != NULL) {
			result++;
			p=p->link;
		}
	}
	return result;
}

void display(GraphType g) {
	for (int i=0; i<g.n; i++) {
		GraphNode *p = g.idjList[i];

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
	init(&test1, 6);
	
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

	printf("count of edge : %d\n", getEdgeCount(test1));
}