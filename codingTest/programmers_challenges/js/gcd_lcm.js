function getGcd(m, n) {
	var gcd = 0;

	while (m % n != 0) {
		gcd = Math.trunc(m % n);
		m = n;
		n = gcd;
	}
	gcd = n;

	return gcd;
}

function solution(n, m) {
	var gcd = getGcd(m, n), lcd = m*n/gcd;

	return [gcd, lcd];
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges