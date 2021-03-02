function solution(n) {
	var answer = 0, sqrt = parseInt(Math.sqrt(n)), arr = new Array(n+1);
		// arr = Array.apply(null, new Array(n+1)).map(Number.prototype.valueOf,1);

	for (var i=2; i<=n; i++) {
		arr[i] = 1;
	}

	for (var k=2; k<=sqrt; k++) {
		for (var j=k*2; j<=n; j += k) {
			arr[j] = 0;
		}
	}

	for (var i=2; i<=n; i++) {
		if (arr[i] != 0) {
			answer++;
		}
	}

	return answer;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges