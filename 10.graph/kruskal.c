#include<stdio.h>
#define MAX_VERTICES 100
#define INF 1000

typedef struct element{
	int key;
	int u;
	int v;
} element;

typedef struct HeapType {
	element arr[MAX_VERTICES];
	int length;
}HeapType;

int parent[MAX_VERTICES];
int num[MAX_VERTICES];

void set_init(int n) {
	for(int i=0; i<n; i++) {
		parent[i] = -1;
		num[i] = 1;
	}
}

int set_find(int vertex) {
	int i, s, p;

	for(i=vertex; (p=parent[i])>=0; i=p) {}
	s=i;

	for(i=vertex; (p=parent[i])>=0; i=p) {
		parent[i] = s;
	}

	return s;
}

void set_union(int s1, int s2) {
	if (num[s1] < num[s2]) {
		parent[s1] = s2;
		num[s2] += num[s1];
	} else {
		parent[s2] = s1;
		num[s1] += num[s2];
	}
}

void heap_init(HeapType *h) {
	h->length = 0;
}

void insert_min_heap(HeapType *h, element e) {
	h->length += 1;
	int i=h->length;

	while (i != 1 && e.key <= h->arr[i/2].key) {
		h->arr[i] = h->arr[i/2];
		i /= 2;
	}
	h->arr[i] = e;
}

void insert_heap_edge(HeapType *h, int u, int v, int weight) {
	element e = {weight, u, v};
	insert_min_heap(h, e);
}

void insert_all_edges(HeapType *h) {
	insert_heap_edge(h, 0, 1, 29);
	insert_heap_edge(h, 1, 2, 16);
	insert_heap_edge(h, 2, 3, 12);
	insert_heap_edge(h, 3, 4, 22);
	insert_heap_edge(h, 4, 5, 27);
	insert_heap_edge(h, 5, 0, 10);
	insert_heap_edge(h, 6, 1, 15);
	insert_heap_edge(h, 6, 3, 18);
	insert_heap_edge(h, 6, 4, 25);
}

element delete_min_heap(HeapType *h) {
	element removed = h->arr[1], temp = h->arr[h->length--];
	int parent = 1, child = 2;

	while (child <= h->length) {
		if (child < h->length && h->arr[child].key > h->arr[child+1].key) child++;
		if (temp.key < h->arr[child].key) break;
		h->arr[parent] = h->arr[child];
 		parent = child;
		child *= 2;
	}
	h->arr[parent] = temp;

	return removed;
}

void kruskal(int n) {
	HeapType h;
	element e;
	int selected_edge = 0, uset, vset;

	heap_init(&h);
	insert_all_edges(&h);
	set_init(n);

	while(selected_edge < n-1) {
		e = delete_min_heap(&h);
		uset = set_find(e.u);
		vset = set_find(e.v);
		if (uset != vset) {
			printf("(%d, %d)\n", e.u, e.v);
			set_union(uset, vset);
			selected_edge++;
		}
	}
}

void display(HeapType h) {
	for (int i=1; i<=h.length; i++) {
		printf("%d ", h.arr[i].key);
	}
	printf("\n");
}


void main() {
	kruskal(7);
}