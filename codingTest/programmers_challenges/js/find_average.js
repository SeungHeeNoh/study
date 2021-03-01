function solution(arr) {
	var answer = 0;

	answer = arr.reduce(function(accumulator, currentValue) {
		return accumulator + currentValue;
	});

	return answer/arr.length;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges