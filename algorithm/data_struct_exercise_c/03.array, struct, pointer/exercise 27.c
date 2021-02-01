/*
	1개의 정수와 최대 크기가 20인 문자열로 이루어진 구조체를 저장할 수 있또록 동적 메모리를 할당받고 여기에 정수 100과 문자열 "just testing"을 저장한 다음,
	동적 메모리를 반납하는 프로그램을 작성하라.
*/
#include<stdio.h>
#include<string.h>
#include<malloc.h>

int main() {
	typedef struct test {
		int number;
		char text[20];
	}test;

	test *testing;
	testing = (test *)malloc(sizeof(test));

	testing->number = 100;
	strcpy(testing->text, "just testing");

	printf("%d, %s", (*testing).number, (*testing).text);
	free(testing);

	return 0;
}