function solution(s) {
	var answer = false, pattern = new RegExp("^[0-9]*$");
	
	if ((4 == s.length || s.length ==6) && pattern.test(s)) {
		answer = true;
	}

	return answer;
}