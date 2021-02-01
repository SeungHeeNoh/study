/*
	hash_chain_delete(element item, ListNode *ht[]) 함수를 구현해보라.
*/
#include<Stdio.h>
#include<malloc.h>

#define TABLE_SIZE 11

typedef struct ListNode{
	int data;
	struct LinkNode *link;
}ListNode;


void init(ListNode *ht[]){
	for(int i=0; i<TABLE_SIZE; i++){
		ht[i]=NULL;
	}
}

void display(ListNode *ht[]){
	for(int i=0; i<TABLE_SIZE; i++){
		ListNode *p = ht[i];
		printf("%d : ", i);
		while(p != NULL){
			printf("%d ", p->data);
			p = p->link;
		}
		printf("\n");
	}
}

ListNode *createNode(int data){
	ListNode *new = (ListNode *)malloc(sizeof(ListNode));

	if(new == NULL){
		printf("Allocation Failed.\n");
	}else{
		new->data = data;
		new->link = NULL;
	}

	return new;
}

void addHashTable(ListNode *ht[], ListNode *newNode){
	if (newNode == NULL){
		return;
	}else{
		int hashVlaue = newNode->data % TABLE_SIZE;

		if (ht[hashVlaue] == NULL){
			ht[hashVlaue] = newNode;
		}else{
			newNode->link = ht[hashVlaue];
			ht[hashVlaue] = newNode;
		}
	}
}

void deleteHashTable(ListNode *ht[], int data){
	int hashValue = data % TABLE_SIZE;
	ListNode *n = ht[hashValue], *p = NULL, *removed = NULL;

	while(n != NULL){
		if(n->data == data){
			if (p == NULL){
				removed = ht[hashValue];
				ht[hashValue] = n->link;
			}else{
				removed = n;
				p->link = removed->link;
			}
			free(removed);
			return;
		}
		p=n;
		n=n->link;
	}
	printf("Data you want to delete is not exist in hashtable.\n");
}

void search(ListNode *ht[], int data){
	int hashValue = data % TABLE_SIZE;
	ListNode *p = ht[hashValue];

	while(p != NULL){
		if(p->data == data){
			printf("Find the value.\n");
			return;
		}
		p=p->link;
	}
	printf("Data you want to find is not exist.\n");
}

void main(){
	ListNode *test1[TABLE_SIZE];
	init(test1);
	addHashTable(test1, createNode(12));
	addHashTable(test1, createNode(44));
	addHashTable(test1, createNode(13));
	addHashTable(test1, createNode(88));
	addHashTable(test1, createNode(23));
	addHashTable(test1, createNode(94));
	addHashTable(test1, createNode(11));
	addHashTable(test1, createNode(39));
	addHashTable(test1, createNode(20));
	addHashTable(test1, createNode(16));
	addHashTable(test1, createNode(5));
	display(test1);

	printf("find data 11 in hashtable. ");
	search(test1, 11);
	printf("find data 77 in hashtable. ");
	search(test1, 77);

	printf("\n");
	printf("delete data 5 in hashtable.\n");
	deleteHashTable(test1, 5);
	display(test1);

	printf("\n");
	printf("delete data 7 in hashtable.\n");
	deleteHashTable(test1, 7);

	printf("\n");
	printf("delete data 88 in hashtable.\n");
	deleteHashTable(test1, 88);
	display(test1);
}