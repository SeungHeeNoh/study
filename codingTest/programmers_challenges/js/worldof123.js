function solution(n) {
    var answer = '', temp = n;

    while (temp != 0) {
		temp = parseInt(temp / 3);

        switch(n % 3) {
            case 0 : {
                answer = '4' + answer;
				temp--;
                break;
            }
            case 1 : {
                answer = '1' + answer;
                break;
            }
            case 2 : {
                answer = '2' + answer;
                break;
            }   
        }
		n = temp;
    }
    return answer;
}

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges