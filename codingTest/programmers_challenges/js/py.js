function solution(s){
	var answer = true, pCount = 0, yCount = 0;

	pCount = (s.match(/\p/gi) || []).length;
	yCount = (s.match(/\y/gi) || []).length;

	if (pCount != yCount) answer = false;

	return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges