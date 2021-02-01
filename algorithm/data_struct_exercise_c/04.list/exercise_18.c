/*
	두 개의 단순 연결 리스트 A, B가 주어져 있을 경우, alternate 함수를 작성하라.
	alternate 함수는 A와 B로부터 노드를 번갈아 가져와서 새로운 리스트 C를 만드는 연산이다.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct LinkNode{
	int data;
	struct LinkNode *link;
}LinkNode;

LinkNode *createNode(int data) {
	LinkNode *newNode = (LinkNode *)malloc(sizeof(LinkNode));

	if (newNode == NULL) {
		printf("Allocation Error Occured\n");
	} else {
		newNode->data =data;
		newNode->link = NULL;
	}

	return newNode;
}

void insertNode(LinkNode **phead, LinkNode *p, LinkNode *newNode) {
	if (*phead == NULL) {
		*phead = newNode;
	} else if (p == NULL) {
		newNode->link = *phead;
		*phead = newNode;
	} else {
		newNode->link = p->link;
		p->link = newNode;
	}
}

void deleteNode(LinkNode **phead, LinkNode *p) {
	LinkNode *removed = NULL;

	if (*phead == NULL) {
		printf("Already Empty");
	} else if (p == NULL) {
		removed = *phead;
		*phead = removed->link;
	} else {
		removed = p->link;
		p = removed->link;
	}
	free(removed);
}

void alternate(LinkNode *alternate1, LinkNode *alternate2, LinkNode **result) {
	LinkNode *now1 = alternate1, *now2 = alternate2, *node = NULL, *prev = NULL;
	int data1, data2;

	/*
		만약 alternate1이 null일 경우 result의 head가 alterate2로 연결하면 요구 조건이 만족되지만,
		추후 다른 작업으로 인해 alterate2가 수정되는 경우가 발생하면 전혀 관련없이 연결된 result의 연결 리스트 또한 변경되기 때문에
		복사해서 새로운 연결 리스트를 만들어 result가 바라보도록 처리했습니다.
	*/
	while (now1 != NULL || now2 != NULL) {
		if (now1 != NULL) {
			data1 = now1->data;
			node = createNode(data1);
			insertNode(result, prev, node);
			prev = node;
			now1 = now1->link;
		}

		if (now2 != NULL) {
			data2 = now2->data;
			node = createNode(data2);
			insertNode(result, prev, node);
			prev = node;
			now2 = now2->link;
		}
	}
}

void display(LinkNode *phead) {
	LinkNode *p = phead;

	while (p != NULL) {
		printf("%d ", p->data);
		p = p->link;
	}
	printf("\n");
}

int main() {
	LinkNode *test1A = NULL, *test1B = NULL, *test1C = NULL;

	printf("test1\n");
	insertNode(&test1A, NULL, createNode(15));
	insertNode(&test1A, NULL, createNode(25));
	insertNode(&test1A, NULL, createNode(35));
	insertNode(&test1A, NULL, createNode(45));
	insertNode(&test1A, NULL, createNode(55));
	insertNode(&test1A, NULL, createNode(65));

	insertNode(&test1B, NULL, createNode(10));
	insertNode(&test1B, NULL, createNode(20));
	insertNode(&test1B, NULL, createNode(30));
	insertNode(&test1B, NULL, createNode(40));
	insertNode(&test1B, NULL, createNode(50));
	insertNode(&test1B, NULL, createNode(60));

	alternate(test1A, test1B, &test1C);

	display(test1C);



	LinkNode *test2A = NULL, *test2B = NULL, *test2C = NULL;

	printf("test2\n");
	insertNode(&test2A, NULL, createNode(15));
	insertNode(&test2A, NULL, createNode(25));
	insertNode(&test2A, NULL, createNode(35));
	insertNode(&test2A, NULL, createNode(45));
	insertNode(&test2A, NULL, createNode(55));
	insertNode(&test2A, NULL, createNode(65));

	alternate(test2A, test2B, &test2C);

	display(test2C);

	LinkNode *test3A = NULL, *test3B = NULL, *test3C = NULL;

	printf("test3\n");
	insertNode(&test3B, NULL, createNode(10));
	insertNode(&test3B, NULL, createNode(20));
	insertNode(&test3B, NULL, createNode(30));
	insertNode(&test3B, NULL, createNode(40));
	insertNode(&test3B, NULL, createNode(50));
	insertNode(&test3B, NULL, createNode(60));

	alternate(test3A, test3B, &test3C);

	display(test3C);
	return 0;
}