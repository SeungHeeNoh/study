/*
	두 개의 연결 리스트가 데이터 값의 오름차순으로 노드들이 정렬되어 있는 경우,
	이러한 정렬 상태를 유지하면서 합병을 하여 새로운 연결 리스트를 만드는 알고리즘 merge를 작성하라.
*/
#include<stdio.h>
#include<malloc.h>

typedef struct LinkNode {
	int data;
	struct LinkNode *link;
} LinkNode;

LinkNode *createNode(int data) {
	LinkNode *newNode = (LinkNode *)malloc(sizeof(LinkNode));

	if (newNode == NULL) {
		printf("Allocation Failed\n");
	} else {
		newNode->data = data;
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

void merge(LinkNode *list1, LinkNode *list2, LinkNode **result) {
	LinkNode *now1 = list1, *now2 = list2, *node = NULL, *prev = NULL;

	while (now1 != NULL && now2 != NULL) {
		int data = 0;
		if (now1->data > now2->data) {
			data = now2->data;
			now2 = now2->link;
		} else {
			data = now1->data;
			now1 = now1->link;
		}
		node = createNode(data);
		insertNode(result, prev, node);
		prev = node;
	}

	while(now1 != NULL) {
		node = createNode(now1->data);
		insertNode(result, prev, node);
		prev = node;
		now1 = now1->link;
	}

	while(now2 != NULL) {
		node = createNode(now2->data);
		insertNode(result, prev, node);
		prev = node;
		now2 = now2->link;
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
	printf("test1\n");
	LinkNode *list1 = NULL, *list2 = NULL, *result1 = NULL;

	insertNode(&list1, NULL, createNode(60));
	insertNode(&list1, NULL, createNode(49));
	insertNode(&list1, NULL, createNode(40));
	insertNode(&list1, NULL, createNode(30));
	insertNode(&list1, NULL, createNode(29));
	insertNode(&list1, NULL, createNode(10));

	insertNode(&list2, NULL, createNode(65));
	insertNode(&list2, NULL, createNode(55));
	insertNode(&list2, NULL, createNode(45));
	insertNode(&list2, NULL, createNode(31));
	insertNode(&list2, NULL, createNode(25));
	insertNode(&list2, NULL, createNode(15));

	merge(list1, list2, &result1);
	display(result1);

	printf("test2\n");
	LinkNode *list3 = NULL, *list4 = NULL, *result2 = NULL;

	insertNode(&list3, NULL, createNode(60));
	insertNode(&list3, NULL, createNode(55));
	insertNode(&list3, NULL, createNode(50));
	insertNode(&list3, NULL, createNode(45));
	insertNode(&list3, NULL, createNode(40));
	insertNode(&list3, NULL, createNode(35));

	insertNode(&list4, NULL, createNode(30));
	insertNode(&list4, NULL, createNode(25));
	insertNode(&list4, NULL, createNode(22));
	insertNode(&list4, NULL, createNode(21));
	insertNode(&list4, NULL, createNode(15));
	insertNode(&list4, NULL, createNode(10));

	merge(list3, list4, &result2);
	display(result2);
	return 0;
}