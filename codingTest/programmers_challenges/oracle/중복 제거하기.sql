/*
 * ===문제 출처===
 * 중복 제거하기, <https://programmers.co.kr/learn/courses/30/lessons/59408>.
 * */
SELECT
       COUNT(DISTINCT NAME)
  FROM ANIMAL_INS
 WHERE NAME IS NOT NULL;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/