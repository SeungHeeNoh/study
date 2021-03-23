function solution(strings, n) {
	strings.sort(function(a, b) {
		// var aChar = a.slice(n, n+1),
		// 	bChar = b.slice(n, n+1);
		var aChar = a[n],
			bChar = b[n];

		if (aChar < bChar) {
			return -1;
		} else if(aChar > bChar) {
			return 1;
		} else {
			return a.localeCompare(b);
		}
	});

	return strings;
}
exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges