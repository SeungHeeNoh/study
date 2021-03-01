const func = require("./py");

describe("문자열 내 p와 y의 개수 확인", () => {
	test("pPoooyY 입력", () => {
		expect(func.solution("pPoooyY")).toBe(true);	
	});

	test("Pyy 입력", () => {
		expect(func.solution("Pyy")).toBe(false);	
	});
});