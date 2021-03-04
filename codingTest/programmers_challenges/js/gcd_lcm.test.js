const func = require("./gcd_lcm");

describe("최대공약수와 최소공배수 구하기", () => {
	test("3과 12 입력", () => {
		expect(func.solution(3, 12)).toEqual([3, 12]);
	});

	test("2와 5 입력", () => {
		expect(func.solution(2, 5)).toEqual([1, 10]);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges