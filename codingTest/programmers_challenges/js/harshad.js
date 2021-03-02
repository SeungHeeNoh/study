function solution(x) {
	var answer = true,
		arr = Array.from(String(x), Number),
		temp = arr.reduce(function(accumulator, currentValue){return accumulator + currentValue});

	if (x % temp != 0) {
		answer = false;
	}

	return answer;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges