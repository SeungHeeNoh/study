function solution(n) {
	var answer = n.toString().split('')
				  .sort(function(a,b) {return b-a;})
				  .join('');

	return Number(answer);
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges