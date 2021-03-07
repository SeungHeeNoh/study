const func = require('./descending_number');

describe("정수 내림차순으로 배치하기", () => {
	test("118372", () => {
		expect(func.solution(118372)).toBe(873211);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges