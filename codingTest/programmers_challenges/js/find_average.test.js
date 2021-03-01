const func = require("./find_average");

describe("평균 구하기", () => {
	test("[1,2,3,4] 입력", () => {
		expect(func.solution([1,2,3,4])).toBe(2.5);	
	});

	test("[5,5] 입력", () => {
		expect(func.solution([5,5])).toBe(5);	
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges