const func = require('./add_digit');

describe('자릿수 더하기', () => {
	test('123 대입', () => {
		expect(func.solution(123)).toBe(6);
	});

	test('987 대입', () => {
		expect(func.solution(987)).toBe(24);
	});
});

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges