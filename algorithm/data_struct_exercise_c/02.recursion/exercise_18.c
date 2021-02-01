/*
	이항 계수를 계산하는 순환 함수를 작성하라.
*/
#include<stdio.h>

int getBC(int n, int k){
	if(k==0 || k==n) return 1;
	return getBC(n-1, k-1) + getBC(n-1, k);
};

void main(){
	printf("result : %d\n", getBC(4, 2));
}