const func = require("./find_prime_number");

describe("소수 찾기", () => {
	test("10 입력", () => {
		expect(func.solution(10)).toBe(4);	
	});

	test("5 입력", () => {
		expect(func.solution(5)).toBe(3);	
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges