function solution(s){
	var answer = "",
		temp = s.split(' '),
		n = temp[0],
		m = temp[1];

	for (var i=0; i<m; i++) {
		for (var j=0; j<n; j++) {
			answer = answer + "*";
		}
		answer = answer + "\n";
	}

	console.log(answer);
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges