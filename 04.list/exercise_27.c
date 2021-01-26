/*
	단순 연결 리스트를 이용하여 숫자들을 항상 정렬된 상태로 유지하는 리스트 SortedList를 구현하여보라.
	add, delete, clear, is_in_list, get_length, is_empty, is_full, display
*/
#include<stdio.h>
#include<malloc.h>

typedef int element;
typedef struct ListNode{
	element data;
	struct ListNode *link;
}ListNode;
typedef struct ListType{
	int length;
	ListNode *front;
}ListType;


void init(ListType *lt){
	lt->front = NULL;
	lt->length = 0;
}

int getLength(ListType lt){
	return lt.length;
}

int isEmpty(ListType lt){
	return lt.length == 0;
}

void display(ListType lt){
	ListNode *p = lt.front;

	while(p != NULL){
		printf("%d ", p->data);
		p=p->link;
	}
	printf("\n");
}

ListNode *find(ListType *lt, element targetData){
	ListNode *n = lt->front, *targetNode = NULL;

	while(n != NULL){
		if(n->data == targetData){
			targetNode = n;
			break;
		}
		if(n->data < targetData) break;
		n = n->link;
	}

	return targetNode;
}

ListNode *createNode(element newData){
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if(newNode == NULL){
		printf("Allocation Failed\n");
	}else{
		newNode->data = newData;
		newNode->link = NULL;
	}

	return newNode;
}

void add(ListType *lt, element newData){
	if(find(lt, newData) != NULL){
		printf("Already Exist.\n");
	}else{
		ListNode *newNode = createNode(newData);

		if(newNode == NULL) return;
		if(!getLength(*lt)){
			lt->front = newNode;
			lt->length += 1;
		}else{
			ListNode *p = NULL, *n = lt->front;
			lt->length += 1;

			while(n != NULL){
				if(n->data < newNode->data){
					break;
				}
				p = n;
				n = n->link;
			}
			if(p == NULL){
				newNode->link = lt->front;
				lt->front = newNode;
			}else{
				newNode->link = p->link;
				p->link = newNode;
			}
		}
	}
}

void delete(ListType *lt, element newData){
	ListNode *deleteNode;

	if(isEmpty(*lt)) return;

	deleteNode = find(lt, newData);
	if(deleteNode == NULL){
		printf("Data you want to delete is not eixist in List.\n");
	}else{
		// to do list;
	}
}

void clear(ListType *lt){
	ListNode *p, *removed;
	
	while(p != NULL){
		removed = p;
		p = p->link;
		free(removed);
	}
	init(lt);
}

void isInList(ListType lt, element targetData){
	if(getLength(lt) == 0){
		printf("The List is Empty.\n");
		return;
	}
	if(find(&lt, targetData) == NULL){
		printf("%d is not exist.\n", targetData);
	}else{
		printf("%d is exist.\n", targetData);
	}
	
}

void main(){
	ListType test1;
	init(&test1);
	printf("is Empty? %s\n", isEmpty(test1) ? "True" : "False");
	printf("List Length? %d\n", getLength(test1));

	add(&test1, 10);
	add(&test1, 20);
	add(&test1, 1);
	add(&test1, 17);
	add(&test1, 0);
	add(&test1, 10);
	display(test1);
	printf("is Empty? %s\n", isEmpty(test1) ? "True" : "False");
	printf("List Length? %d\n", getLength(test1));
	isInList(test1, 17);
	isInList(test1, 50);

	printf("-----------After clear function call-----------\n");
	clear(&test1);
	display(test1);
}