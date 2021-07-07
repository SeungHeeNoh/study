/*
 * ===문제 출처===
 * 동명 동물 수 찾기, <https://programmers.co.kr/learn/courses/30/lessons/59041>.
 * */
SELECT
       NAME
     , COUNT(*) COUNT
  FROM ANIMAL_INS
 WHERE NAME IS NOT NULL
  GROUP BY NAME
  HAVING 2 <= COUNT(*)
  ORDER BY NAME;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/