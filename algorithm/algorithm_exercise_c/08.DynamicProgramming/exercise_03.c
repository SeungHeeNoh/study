/*
	10111010100과 00111010110의 최장 공통 부분순서를 구하라.
*/

#include<stdio.h>
#include<malloc.h>
#define max(a, b) (((a) > (b)) ? (a) : (b))
#define ARRAY_SIZE 12


void display(int array[], int length) {
	for(int i=0; i<length; i++) {
		printf("%d ", array[i]);
	}

	printf("\n");
}

void traceBack(int map[ARRAY_SIZE][ARRAY_SIZE], int cpr1[], int cpr2[], int length) {
	int i = ARRAY_SIZE-1, j = ARRAY_SIZE-1,
		*result = malloc(sizeof(int) * length), len = length-1;

	while(i != 0 && j != 0) {
		if (cpr1[i] == cpr2[j]) {
			result[len--] = cpr1[i];
			i--; j--;
		} else if (map[i][j-1] >= map[i-1][j]){
			j--;
		} else {
			i--;
		}
	}
	
	display(result, length);
}

int get_lcs(int cpr1[], int cpr2[]) {
	int map[ARRAY_SIZE][ARRAY_SIZE], lcs = 0;

	for (int i=0; i<ARRAY_SIZE; i++) {
		map[0][i] = 0;
	}

	for (int i=0; i<ARRAY_SIZE; i++) {
		map[i][0] = 0;
	}

	for (int i=1; i<ARRAY_SIZE; i++) {
		for (int j=1; j<ARRAY_SIZE; j++) {
			if (cpr1[i] == cpr2[j]) map[i][j] = map[i-1][j-1] + 1;
			else map[i][j] = max(map[i-1][j], map[i][j-1]);
		}
	}

	lcs = map[ARRAY_SIZE-1][ARRAY_SIZE-1];
	traceBack(map, cpr1, cpr2, lcs);

	return lcs;
}

void getArray(long long data, int result[]) {
	int i=1, digit = 0;

	while (ARRAY_SIZE >= i) {
		if (data != 0) {
			digit = data % 10;
			data /= 10;
		} else {
			digit = 0;
		}

		result[ARRAY_SIZE-i] = digit;
		i++;
	}
}

int main() {
	long long cpr1 = 10111010100,
		 	  cpr2 = 111010110;
	int array1[ARRAY_SIZE], array2[ARRAY_SIZE];
	
	getArray(cpr1, array1);
	getArray(cpr2, array2);

	printf("lcs is %d", get_lcs(array1, array2));

	return 0;
}