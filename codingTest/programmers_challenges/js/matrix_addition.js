function solution(arr1, arr2) {
	var row = arr1.length, col = arr1[0].length,
		answer = new Array(row);

	for (var i=0; i<row; i++) {
		answer[i] = new Array(col);

		for (var j=0; j<col; j++) {
			answer[i][j] = arr1[i][j] + arr2[i][j];
		}
	}
	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges