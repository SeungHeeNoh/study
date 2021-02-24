function solution(x, n) {
	var answer = [];
	
	for(var i=1; i<=n; i++) {
		answer.push(x*i);
	}

	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges