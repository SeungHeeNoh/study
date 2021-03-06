const func = require('./remove_minimum');

describe("제일 작은 수 제거하기", () => {
    test("[4,3,2,1]", () => {
        expect(func.solution([4,3,2,1])).toEqual([4,3,2]);
    });

    test("[10]", () => {
        expect(func.solution([10])).toEqual([-1]);
    });
});
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges