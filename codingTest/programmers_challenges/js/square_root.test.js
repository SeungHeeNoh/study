const func = require('./square_root');

describe('정수 제곱근 판별하기', () => {
	test('121대입', () => {
		expect(func.solution(121)).toBe(144);
	});

	test('3대입', () => {
		expect(func.solution(3)).toBe(-1);
	});
});

// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges