/*
 * ===문제 출처===
 * 입양 시각 구하기(1), <https://programmers.co.kr/learn/courses/30/lessons/59412>.
 * */
SELECT
       TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) HOUR
     , COUNT(*)
  FROM ANIMAL_OUTS
 WHERE TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) BETWEEN 9 AND 20
 GROUP BY TO_CHAR(DATETIME, 'HH24')
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/