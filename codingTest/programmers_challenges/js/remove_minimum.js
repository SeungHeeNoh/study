function solution(arr) {
    var length = arr.length,
        min = arr[0], index = 0;

    for (var i=0; i<length; i++) {
        if (arr[i] < min) {
            min = arr[i];
            index = i;
        }
    }

    arr.splice(index, 1);
    if (arr.length == 0) arr.push(-1);

    return arr;
}

exports.solution = solution;
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges