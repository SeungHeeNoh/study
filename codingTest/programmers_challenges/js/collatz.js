function solution(num) {
	var answer = 0;

	while (answer <= 500 && num != 1) {
		switch (num % 2) {
			case 0 : num /= 2; break;
			case 1 : num = num * 3 + 1; break;
		}
		answer++;
	}

	if (answer >= 500) answer = -1;

	return answer;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges