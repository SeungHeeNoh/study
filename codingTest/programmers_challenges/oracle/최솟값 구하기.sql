/*
 * ===문제 출처===
 * 최솟값 구하기, <https://programmers.co.kr/learn/courses/30/lessons/59038>.
 * */
SELECT
       DATETIME 시간
  FROM ANIMAL_INS
 WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS);
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/