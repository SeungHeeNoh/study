/*
	행렬의 원소 (1, 1)에서 (n, n)으로 이동하는 모든 경로의 점수 중 가장 높은 점수를 찾는 동적 프로그래밍 알고리즘을 작성하라.
	[규칙]
	- 오른쪽이나 아래쪽, 또는 오른쪽 대각석으로만 이동할 수 있다.
	- 왼쪽, 위쪽으로의 이동과 여타의 대각선 이동은 허용하지 않는다.
*/

#include<stdio.h>
#define ARRAY_SIZE 4
#define max(a,b,c) (((a)>(b)) ? ((a) > (c) ? (a) : (c)) : ((b) > (c) ? (b) : (c)))
int map[ARRAY_SIZE][ARRAY_SIZE] = {
	{6, 7, 12, 5},
	{5, 3, 11, 18},
	{7, 17, 3, 3},
	{8, 10, 14, 9}
};
int path[ARRAY_SIZE][ARRAY_SIZE];
int move[ARRAY_SIZE][ARRAY_SIZE];

int getPath() {
	for (int i=0; i<ARRAY_SIZE; i++) {
		for (int j=0; j<ARRAY_SIZE; j++) {
			if (i == 0) {
				path[0][j] = map[0][j] + ((j>0) ? path[0][j-1] : 0);
			} else if (j == 0) {
				path[i][0] = map[i][0] + ((i>0) ? path[i-1][0] : 0);
			} else {
				path[i][j] = map[i][j] + max(path[i-1][j], path[i][j-1], path[i-1][j-1]);
			}
		}
	}

	return path[ARRAY_SIZE-1][ARRAY_SIZE-1];
}

int main() {

	printf("%d", getPath());
	return 0;
}