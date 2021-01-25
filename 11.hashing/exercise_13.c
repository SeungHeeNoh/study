/* 12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5*/

#include<stdio.h>

#define KEY_SIZE 20
#define TABLE_SIZE 11

typedef struct element{
	int value;
	int deleted;
	int full;
}element;

typedef struct HashTable{
	element table[TABLE_SIZE];
}HashTable;

void initTable(HashTable *ht){
	for(int i=0; i<TABLE_SIZE; i++){
		ht->table[i].value = ht->table[i].deleted = ht->table[i].full = 0;
	}
}

void display(HashTable ht){
	for(int i=0; i<TABLE_SIZE; i++){
		printf("%d ", ht.table[i].value);
	}
	printf("\n");
}

int isEmpty(HashTable ht){
	int count=0;
	for(int i=0; i<TABLE_SIZE; i++){
		if(ht.table[i].full){
			count++;
		}
	}
	return count == 0;
}

int isFull(HashTable ht){
	int count = 0;

	for(int i=0; i<TABLE_SIZE; i++){
		if(ht.table[i].full){
			count++;
		}
	}
	return count==TABLE_SIZE;
}

void inputHashTable(HashTable *ht, element data){
	int step, hashKey;
	step = hashKey = data.value % 11;

	if(isFull(*ht)){
		printf("Table is Full.\n");
		return;
	}else{
		while(1){
			if (!ht->table[step].full){
				ht->table[step].value = data.value;
				ht->table[step].full = 1;
				ht->table[step].deleted = 1;
				break;
			} else {
				step =  ++step % TABLE_SIZE;
				if (step == hashKey) {
					printf("Table is Full.\n");
					return;
				}
			}
		}
		display(*ht);
	}
}

void search(HashTable *ht, element data){
	int step, hashKey;
	step = hashKey = data.value % 11;

	if(isEmpty(*ht)){
		printf("Table is Empty.\n");
		return;
	} else{
		while(1){
			if(ht->table[step].deleted && ht->table[step].value == data.value){
				printf("search success : %d\n", step);
				break;
			}else{
				step = ++step % TABLE_SIZE;
				if (step == hashKey){
					printf("Data you are looking for is not exist in hashtable.\n");
					return;
				}
			}
		}
	}
}

void main(){
	int op;
	element temp;
	HashTable test1;
	initTable(&test1);

	do{
		printf("Enter the desired operation.(0=input, 1=search, 2=exit.) ");
		scanf("%d", &op);
		switch (op){
		case 0:
			printf("Enter the key ");
			scanf("%d", &temp.value);
			inputHashTable(&test1, temp);
			break;
		case 1:
			printf("Enter the key ");
			scanf("%d", &temp.value);
			search(&test1, temp);
			break;
		}

	}while(op != 2);
}