function solution(s){
	var answer = true, pCount = 0, yCount = 0;

	pCount = (s.match(/\p/gi) || []).length;
	yCount = (s.match(/\y/gi) || []).length;

	if (pCount != yCount) answer = false;

	return answer;
}