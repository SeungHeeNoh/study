/*
	Ackermann함수를 구하는 순환적인 프로그램을 작성하라.
*/
#include<stdio.h>

int ackermann(int m, int n) {
	int returnValue;
	if (m == 0) {
		returnValue = n+1;
	} else if(n == 0) {
		returnValue = ackermann(m-1, 1);
	} else {
		returnValue = ackermann(m-1, ackermann(m, n-1));
	}
	return returnValue;
};

int main() {
	int result = ackermann(2, 3);
	printf("%d", result);

	return 0;
};