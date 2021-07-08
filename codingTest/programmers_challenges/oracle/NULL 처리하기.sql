/*
 * ===문제 출처===
 * NULL 처리하기, <https://programmers.co.kr/learn/courses/30/lessons/59410>.
 * */
SELECT
        ANIMAL_TYPE
      , NVL(NAME, 'No name')
      , SEX_UPON_INTAKE
  FROM  ANIMAL_INS
 ORDER BY ANIMAL_ID;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/