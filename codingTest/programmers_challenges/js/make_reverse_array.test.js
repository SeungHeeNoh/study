const func = require('./make_reverse_array');

describe('자연수 뒤집어 배열로 만들기', () => {
	test('12345 입력', () => {
		expect(func.solution(12345)).toEqual([5, 4, 3, 2, 1]);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges