function solution(phone_number) {
	var answer = '', prefix = '*'.repeat(phone_number.length-4), suffix = phone_number.slice(-4);

	answer = prefix + suffix;

	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges