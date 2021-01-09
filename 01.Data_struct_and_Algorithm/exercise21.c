/*
  크기가 n인 배열 array에서 임의의 위치 loc에 정수 value를 삽입하는 함수를 작성하라.
  정수가 삽입되면 그 뒤에 있는 정수들은 한 칸씩 뒤로 밀려야 한다. 현재 배열에 들어 있는 원수의 개수는 item개라고 하자.
  (여기서 items << n)
*/
#include<stdio.h>
#define MAX_ELEMENT 15
int array[MAX_ELEMENT] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

void insert_array(int loc, int value) {
	for (int i=MAX_ELEMENT-1; i>loc; i--) {
		array[i] = array[i-1];
	}
	array[loc] = value;
};

int main() {
	// 문제 세팅
	int loc = 0, value = 0;
	insert_array(loc, value);


	//결과물 출력
	for (int i=0; i<MAX_ELEMENT; i++) {
		printf("%d ",array[i]);
	}
	return 0;
};