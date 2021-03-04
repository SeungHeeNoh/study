/*
	각 집합을 합칠 때 랭크를 이용한 Union을 적용하라.
*/
#include<stdio.h>
#include<malloc.h>

#define SET_SIZE 20
#define DISJOINT_SIZE 26
#define CORRECTION_VALUE 97

int parent[DISJOINT_SIZE];
int rank[DISJOINT_SIZE];

void display() {
	for(int i=0; i<DISJOINT_SIZE; i++) {
		printf("%d ", parent[i]);
	}
	printf("\n");
}

void init() {
	for (int i=0; i<DISJOINT_SIZE; i++) {
		parent[i] = -1;
		rank[i] = -1;
	}
}

int getIndex(int data) {
	return data - CORRECTION_VALUE;
}

void make_set(char data) {
	int index = getIndex(data);

	parent[index] = index;
	rank[index] = 0;
}

int find_set(int index) {
	while (parent[index] != index) {
		index = parent[index];
	}
	
	return index;
}

void union_set(char x, char y) {
	int x_p_index = find_set(getIndex(x)), y_p_index = find_set(getIndex(y));

	if (rank[x_p_index] < rank[y_p_index]) {
		parent[x_p_index] = y_p_index;
	} else {
		parent[y_p_index] = x_p_index;
		if (rank[x_p_index] == rank[y_p_index]) rank[x_p_index] = rank[y_p_index]+1;
	}
}

void print_rank(char data) {
	printf("%c's rank is %d\n", data, rank[getIndex(data)]);
}

int main() {
	init();
	// set(a -1)
	make_set('a');
	make_set('b');
	union_set('a', 'b');

	// set(a-2)
	make_set('c');

	// set(b-1)
	make_set('d');
	make_set('e');
	union_set('d', 'e');

	// set(b-2)
	make_set('f');
	make_set('g');
	make_set('h');
	make_set('i');
	union_set('f', 'g');
	union_set('f', 'h');
	union_set('f', 'i');

	printf("Before union\n");
	display();
	printf("\n");


	printf("After union\n");

	// union set(a-1), set(a-2) => set(a)
	printf("Set (a) union result\n");
	union_set('b', 'c');
	print_rank('a');
	print_rank('c');
	display();
	printf("\n");

	// union set(b-1), set(b-2) => set(b)
	printf("Set (b) union result\n");
	union_set('e', 'i');
	print_rank('d');
	print_rank('f');
	display();
	printf("\n");

	// union set(a), set(b)
	printf("Set (a), Set (b) union result\n");
	union_set('c', 'f');
	display();

	printf("%c\n", (char)(find_set('c')+CORRECTION_VALUE));
	printf("%c\n", (char)(find_set('i')+CORRECTION_VALUE));

	return 0;
}