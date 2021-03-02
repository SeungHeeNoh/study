const func = require("./odd_even");

describe("짝수와 홀수", () => {
	test("3 입력했을 때", () => {
		expect(func.solution(3)).toBe("Odd");
	});

	test("4 입력했을 때", () => {
		expect(func.solution(4)).toBe("Even");
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges