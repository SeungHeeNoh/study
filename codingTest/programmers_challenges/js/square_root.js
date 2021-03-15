function solution(n) {
	var answer = 0;

	if (Number.isInteger(Math.sqrt(n))) {
		answer = Math.pow(Math.sqrt(n)+1, 2);
	} else {
		answer = -1;
	}

	return answer;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges