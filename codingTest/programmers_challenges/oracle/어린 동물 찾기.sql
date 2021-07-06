/*
 * ===문제 출처===
 * 어린 동물 찾기, <https://programmers.co.kr/learn/courses/30/lessons/59037>.
 * */
SELECT
       ANIMAL_ID
     , NAME
  FROM ANIMAL_INS
 WHERE INTAKE_CONDITION <> 'Aged'
 ORDER BY ANIMAL_ID;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/