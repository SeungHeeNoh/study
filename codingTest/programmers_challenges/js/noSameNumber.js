function solution(arr){
	var answer = [];
	answer.push(arr[0]);

	for (var i=1; i<arr.length; i++) {
		if (answer[answer.length-1] != arr[i]) {
			answer.push(arr[i]);
		}
	}
	
	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges