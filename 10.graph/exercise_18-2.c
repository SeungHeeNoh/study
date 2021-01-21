/*
	간선을 삭제하는 delete_edge 연산을 인접 리스트에 대하여 구현하라.
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
	GraphNode *adjList[MAX_VERTICES];
}GraphType;

void init(GraphType *g, int n) {
	if (n > MAX_VERTICES) {
		printf("Input of vertices is too big.\n");
	} else {
		g->n = n;
		for(int i=0; i<n; i++){
			g->adjList[i] = NULL;
		}
	}
}

void insertEdge(GraphType *g, int u, int v, int weight) {
	if(u >= g->n || v >= g->n){
		printf("wrong vertex.\n");
	}else{
		GraphNode *newNode = (GraphNode *)malloc(sizeof(GraphNode));
		newNode->vertex = v;
		newNode->weight = weight;
		newNode->link = g->adjList[u];
		g->adjList[u] = newNode;
	}
}

void deleteEdge(GraphType *g, int u, int v) {
	GraphNode *p,* n = g->adjList[u];

	while(n!=NULL){
		if (n->vertex == v) {
			p->link = n->link;
			free(n);
			return;
		}
		p=n;
		n=n->link;
	}
	printf("edge<%d, %d> is not exist.\n", u, v);
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
	printf("\n");
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

	deleteEdge(&test1, 3, 0);
	deleteEdge(&test1, 5, 0);
	display(test1);
}