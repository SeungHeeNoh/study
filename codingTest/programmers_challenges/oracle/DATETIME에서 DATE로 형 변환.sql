/*
 * ===문제 출처===
 * DATETIME에서 DATE로 형 변환, <https://programmers.co.kr/learn/courses/30/lessons/59414>.
 * */
SELECT
       ANIMAL_ID
     , NAME
     , TO_CHAR(DATETIME, 'YYYY-MM-DD') 날짜
  FROM ANIMAL_INS
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/