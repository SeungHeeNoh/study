function solution(n) {
	var answer = '';

	for (var i=0; i<n; i++) {
		answer += i%2 ? "박" : "수";
	}

	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges