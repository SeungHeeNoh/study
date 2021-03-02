const func = require("./collatz");

describe("콜라츠 추측", () => {
	test("6", ()=>{
		expect(func.solution(6)).toBe(8);
	});

	test("16", () => {
		expect(func.solution(16)).toBe(4);
	});

	test("626331", () => {
		expect(func.solution(626331)).toBe(-1);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges