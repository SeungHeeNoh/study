function solution(s) {
	var answer = false, pattern = new RegExp("^[0-9]*$");
	
	if ((4 == s.length || s.length ==6) && pattern.test(s)) {
		answer = true;
	}

	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges