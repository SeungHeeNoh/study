function solution(n){
	var answer = 0;

	while(n > 0) {
		answer += n % 10;
		n = Math.floor(n/10);
	}

	return answer;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges