/*
 * ===문제 출처===
 * 고양이와 개는 몇 마리 있을까, <https://programmers.co.kr/learn/courses/30/lessons/59040>.
 * */
SELECT
        ANIMAL_TYPE
      , COUNT(*)
  FROM ANIMAL_INS
 WHERE ANIMAL_TYPE IN ('Cat', 'Dog')
 GROUP BY ANIMAL_TYPE
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/