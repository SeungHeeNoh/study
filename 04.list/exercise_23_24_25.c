/*
	다항식을 연결 리스트로 나타내고, sum, poly_eval, poly sub를 작성하라.
*/
#include<stdio.h>
#include<malloc.h>
#include<math.h>

typedef struct ListNode{
	int coef;
	int expon;
	struct ListNode *link;
}ListNode;
typedef struct ListType{
	ListNode *front;
	ListNode *rear;
}ListType;

void init(ListType *lt){
	lt->front = lt->rear = NULL;
}

void display(ListType lt){
	ListNode *p = lt.front;

	while(p != NULL){
		if (p->coef > 0) printf("+");
		printf("%dx^%d ", p->coef, p->expon);
		p = p->link;
	}
	printf("\n");
}

ListNode *createNode(int coef, int expon){
	ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));

	if(newNode == NULL){
		printf("Allocation Failed.\n");
	}else{
		newNode->coef = coef;
		newNode->expon = expon;
		newNode->link = NULL;
	}

	return newNode;
}

void insertNode(ListType *lt, ListNode *newNode){
	if(lt->front == NULL){
		lt->front = lt->rear = newNode;
	}else if(newNode == NULL){
		return;
	}else{
		lt->rear->link = newNode;
		lt->rear = newNode;
	}
}

void poly_sum(ListType *result, ListType *left, ListType *right){
	ListNode *p = NULL, *pLeft = left->front, *pRight = right->front, *newNode = NULL;
	int coef = 0, expon = 0;

	while(pLeft != NULL && pRight != NULL){
		if(pLeft->expon == pRight->expon){
			coef = pLeft->coef + pRight->coef;
			expon = pLeft->expon;
			pLeft = pLeft->link;
			pRight = pRight->link;
		}else if(pLeft->expon > pRight->expon){
			coef = pLeft->coef;
			expon = pLeft->expon;
			pLeft = pLeft->link;
		}else{
			coef = pRight->coef;
			expon = pRight->expon;
			pRight = pRight->link;
		}
		newNode = createNode(coef, expon);
		insertNode(result, newNode);
	}

	if (pLeft != NULL){
		while(pLeft != NULL){
			newNode = createNode(pLeft->coef, pLeft->expon);
			insertNode(result, newNode);
			pLeft = pLeft->link;
		}
	}

	if (pRight != NULL){
		while(pRight != NULL){
			newNode = createNode(pRight->coef, pRight->expon);
			insertNode(result, newNode);
			pRight = pRight->link;
		}
	}
}

void poly_sub(ListType *result, ListType *left, ListType *right){
	ListNode *pLeft = left->front, *pRight = right->front;
	int coef = 0, expon = 0;

	while(pLeft != NULL && pRight != NULL){
		if(pLeft->expon == pRight->expon){
			coef = pLeft->coef - pRight->coef;
			expon = pLeft->expon;
			pLeft = pLeft->link;
			pRight = pRight->link;
		}else if(pLeft->expon >pRight->expon){
			coef = pLeft->coef;
			expon = pLeft->expon;
			pLeft = pLeft->link;
		}else{
			coef = pRight->coef;
			expon = pRight->expon;
			pRight = pRight->link;
		}
		insertNode(result, createNode(coef, expon));
	}

	while(pLeft != NULL){
		pLeft = pLeft->link;
		insertNode(result, createNode(pLeft->coef, pLeft->expon));
	}

	while(pRight != NULL){
		pLeft = pRight->link;
		insertNode(result, createNode(pRight->coef, pRight->expon));
	}
}

int poly_eval(ListType lt, double x){
	ListNode *p = lt.front;
	int result = 0;

	while(p != NULL){
		result += p->coef*pow(x, p->expon);
		p = p->link;
	}
	return result;
}
void main(){
	printf("-----------test 23-----------\n");
	ListType result23, listA, listB;
	init(&result23);
	init(&listA);
	init(&listB);

	insertNode(&listA, createNode(3, 6));
	insertNode(&listA, createNode(7, 3));
	insertNode(&listA, createNode(-2, 2));
	insertNode(&listA, createNode(-9, 0));
	
	insertNode(&listB, createNode(-2, 6));
	insertNode(&listB, createNode(-4, 4));
	insertNode(&listB, createNode(6, 2));
	insertNode(&listB, createNode(6, 1));
	insertNode(&listB, createNode(1, 0));

	display(listA);
	display(listB);

	poly_sum(&result23, &listA, &listB);
	printf("result23 : ");
	display(result23);

	printf("-----------test 24-----------\n");
	ListType result24;
	init(&result24);

	insertNode(&result24, createNode(1, 3));
	insertNode(&result24, createNode(2, 1));
	insertNode(&result24, createNode(6, 0));
	display(result24);
	printf("result24 : %d\n", poly_eval(result24, 2.0));

	printf("-----------test 25-----------\n");
	ListType result25;
	init(&result25);
	poly_sub(&result25, &listA, &listB);
	display(result25);
}