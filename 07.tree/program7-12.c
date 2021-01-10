/*
	이진 탐색 트리를 사용한 영어 사전
*/
#include<stdio.h>
#include<string.h>
#include<memory.h>

void help() {
	printf("*******************\n");
	printf("i: input\n");
	printf("d: delete\n");
	printf("s: search\n");
	printf("p: print\n");
	printf("q: quit\n");
	printf("*******************\n");
}

int main() {
	char command;

	do {
		help();
		command = getchar();
		fflush(stdin);
	} while(command != 'q');

	return 0;
}