const func = require('./harshad');

describe("하샤드 수 확인하기", () => {
	test("10 입력", () => {
		expect(func.solution(10)).toBe(true);
	});

	test("12 입력", () => {
		expect(func.solution(12)).toBe(true);
	});

	test("11 입력", () => {
		expect(func.solution(11)).toBe(false);
	});

	test("13 입력", () => {
		expect(func.solution(13)).toBe(false);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges