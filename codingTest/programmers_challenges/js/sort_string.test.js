const func = require("./sort_string");

describe("문자열 내 마음대로 정렬하기", () => {
	test("['sun', 'bed', 'car'] 입력", () => {
		expect(func.solution(["sun", "bed", "car"], 1)).toEqual(["car", "bed", "sun"]);
	});

	test("['abce', 'abcd', 'cdx']", () => {
		expect(func.solution(["abce", "abcd", "cdx"], 2)).toEqual(["abcd", "abce", "cdx"]);
	});
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges