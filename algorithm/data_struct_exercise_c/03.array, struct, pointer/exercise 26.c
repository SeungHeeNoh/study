/*
	배열 x를 {1, 2, 3, 4, 5, 6}으로 초기화한 후 포인터 p를 정의하고 포인터 p에 저장할 주소는 x[2]로 하고, *(p+3)와 *(p-2) 및 그 값의 곱을 구하는 프로그램을 작성하라. 
*/
#include<stdio.h>

int main() {
	int x[] = {1, 2, 3, 4, 5, 6};
	int *p = &x[2];

	int value1 = *(p+3);
	int value2 = *(p-2);
	int result = value1 * value2;

	printf("%d X %d = %d", value1, value2, result);
	return 0;
};